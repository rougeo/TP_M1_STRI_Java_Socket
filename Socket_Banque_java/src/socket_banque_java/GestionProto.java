/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket_banque_java;

import java.util.*;
/**
 *
 * @author BoubacarSidy
 */
public class GestionProto {
    private BanqueSimple banque;
    
    public GestionProto(){
        banque=new BanqueSimple();
    }
    
    
    public String traitement(String requete)
    { String chaine[];
      String reponse="ERREUR REQUETE INCORRECTE";
      double solde;
      
      chaine=requete.split(" ");
      
       switch (chaine[0]) {
            case "CREATION": 
               if(chaine.length==3)
               {
                   solde=Double.parseDouble(chaine[2]);
                   banque.creerCompte(chaine[1], solde);
            
                   
               }
              
                     break;
            case "POSITION":
               if(chaine.length==2)
               {
                   
               }
                break;
            case "AJOUT":
                  if(chaine.length==3)
               {
                   
               }
                break;
            case "RETRAIT":
                  if(chaine.length==3)
               {
                   
               }
                break;
            default:
              reponse="ERREUR REQUETE INCORRECTE";
    }
   
      
   
       return reponse;
}

     public BanqueSimple getBanque(){
           return banque;
       }
}
