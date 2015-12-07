/**
 * 
 */
package exercice1;

/**
 * @author BoubacarSidy
 *
 */
public class Fourchette {
	private boolean prise;

	/**
	 * 
	 */
	public Fourchette() {
		// TODO Auto-generated constructor stub
		this.prise=false;
	}
        
		synchronized
		public void prendre() throws InterruptedException{
        	while(isPrise())
        		wait();
			this.setPrise(true);
              
		}
        synchronized
        public void poser(){
        	this.setPrise(false);
        	notify();
        }
		/**
		 * @return the prise
		 */
		public boolean isPrise() {
			return prise;
		}
		/**
		 * @param prise the prise to set
		 */
		
		public void setPrise(boolean prise) {
			this.prise = prise;
		}
}
