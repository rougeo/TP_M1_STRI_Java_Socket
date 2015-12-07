import java.util.*;
/**
 * 
 */

package exercice1;

/**
 * @author BoubacarSidy
 *
 */
public class Philosophe implements Runnable {
	
	  private Fourchette fourchetteG;
	  private Fourchette fourchetteD;
	  
	/**
	 * 
	 */
	public Philosophe(Fourchette G,Fourchette D) {
		// TODO Auto-generated constructor stub
		this.fourchetteD=D;
		this.fourchetteG=G;
	}
	
	public void run(){
	while(true){
	try{
		getFourchetteG().prendre();
		getFourchetteD().prendre();
		
		Thread.sleep(2000);
		getFourchetteG().poser();
		getFourchetteD().poser();
		
	}
	catch (InterruptedException e){
		}
	}
		
	}

	/**
	 * @return the fourchetteG
	 */
	public Fourchette getFourchetteG() {
		return fourchetteG;
	}

	/**
	 * @param fourchetteG the fourchetteG to set
	 */
	public void setFourchetteG(Fourchette fourchetteG) {
		this.fourchetteG = fourchetteG;
	}

	/**
	 * @return the fourchetteD
	 */
	public Fourchette getFourchetteD() {
		return fourchetteD;
	}

	/**
	 * @param fourchetteD the fourchetteD to set
	 */
	public void setFourchetteD(Fourchette fourchetteD) {
		this.fourchetteD = fourchetteD;
	}
}
