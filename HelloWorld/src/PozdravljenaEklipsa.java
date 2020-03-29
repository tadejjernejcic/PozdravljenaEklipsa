/**
 * 
 */

/**
 * @author Tadej
 *
 */
public class PozdravljenaEklipsa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//izpise pozdrav
		System.out.println("Pozdravljena eklipsa");
		//ustvarimo pivsko steklenico
		PivskaSteklenica ps = new PivskaSteklenica(2, "Lasko");
		//odpremo pivsko steklenico
		ps.odpri();
		//izpraznimo steklenico
		try {
			ps.izprazni(100);
			System.out.println("Iz steklenice izpraznemo 100ml.");
			System.out.println("Ostane se: " + ps.getKolicinaVsebine() + "ml.");
		} catch (Exception e) {
			// vrze error
			System.out.println("Napaka: " + e);
		}
		
	}

}
