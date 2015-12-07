/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1_BANQUE;

import java.util.*;
import java.util.*;
import java.net.*;
import java.io.*;
/**
 *
 * @author BoubacarSidy
 */
public class Thread_TCP implements Runnable  {
    
	   Socket sockService;
	   GestionProto gestion;
       String requete;
       BufferedReader fluxEntre;
       PrintStream fluxSortant;
       public Thread_TCP(Socket sockService, GestionProto gestion)
       {
    	   this.sockService=sockService; 
    	   this.gestion=gestion;
       }
	public void run(){
		
		 try{ 
             //  Instancie un BufferedReader travaillant sur un InputStreamReader lié à
             // l’input stream de la socket 
             fluxEntre = new BufferedReader 
                           (new InputStreamReader(sockService.getInputStream())); 
             fluxSortant = new PrintStream(sockService.getOutputStream()); 
             //  Lit une ligne de caractères depuix le flux, et donc la reçoit du client 

             while((requete=fluxEntre.readLine())!=null)
             {
                fluxSortant.println(gestion.traitement(requete));
             
             }
             } 
               catch(IOException ioe) { 
                     System.out.println("Erreur de lecture : " + ioe.getMessage()); 
               }
             socketService.close();
		}
	}
