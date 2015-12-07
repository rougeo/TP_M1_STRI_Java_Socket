/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket_banque_java;

import java.util.*;
import java.net.*;
import java.io.*;
/**
 *
 * @author BoubacarSidy
 */
public class ServeurTCP {

ServerSocket sockEcoute;                   // Déclaration du ServerSocket 

    public ServeurTCP(){
    //  Instanciation du ServerSocket en utilisant le constr. le plus simple (choix port) 
        try { 
               sockEcoute = new ServerSocket(13214); 
        } 
        catch(IOException ioe) { 
              System.out.println("Erreur de création du server socket: " + ioe.getMessage()); 
              return; 
        }
    }
 
    public void traitementTCP(){

        Socket sockService;
        String requete;
        BufferedReader fluxEntre;
        PrintStream fluxSortant;
        
        GestionProto gestion=new GestionProto();
        while(true) { 
              try { 
                    sockService = sockEcoute.accept(); 
              } 
              catch(IOException ioe) { 
                    System.out.println("Erreur de accept : " + ioe.getMessage()); 
                    break;                     
              } 
              
              /**************************/
              Thread_TCP t=new Thread_TCP(sockService,gestion);
            		  t.start();
              /*******************/
              
        }
    }
}
