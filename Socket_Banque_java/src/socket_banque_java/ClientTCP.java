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
public class ClientTCP {
    private Socket client = null;
    private PrintStream fluxSortant = null;
    private BufferedReader fluxEntrant = null;
    
    public ClientTCP(String NomServeur, int Numport){
        
        

        try {
            // echoSocket = new Socket("taranis", 7);
            client = new Socket(NomServeur, Numport);
            fluxSortant= new PrintStream(client.getOutputStream());
            fluxEntrant = new BufferedReader(new InputStreamReader(client.getInputStream()));
        
          }catch(IOException ioe) { 
              System.out.println("Erreur de création du Client socket: " + ioe.getMessage()); 
              return; 
        }
    
    
 }   
      
    public void traitementTCP() throws IOException{
       
        String requete;
        BufferedReader entreeClavier = new BufferedReader(new InputStreamReader(System.in));
	        
        System.out.print ("\n Saisir une requete: ");
        requete = entreeClavier.readLine();   
        
        while(!(requete.equals("FIN"))){
        
		    fluxSortant.println(requete);
		    System.out.println("REPONSE: \n" + fluxEntrant.readLine());
		    System.out.print ("\n Saisir une requete: ");
	        requete = entreeClavier.readLine();   
        }
        client.close();
    }
}
