/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
le port et l'adresse IP¨du serveur ne change pas, c'est le port 
des differents clients qui changent
il faut synchroniser la HashMap
*/

/*
Pour UDP, putty ne marche pas pour les test, il faut creer un client UDP
*/
package socket_banque_java;

import java.util.*;
import java.net.*;
import java.io.*;
/**
 *
 * @author BoubacarSidy
 */
public class MainServTCP {
    
    public static void main(String args[])  {	
        
        ServeurTCP serv1=new ServeurTCP();
        
        serv1.traitementTCP();
        
    }
    
}
