
public class Konfigurationstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Übung 1:
		int cent = 70;
		cent = 80;
		
		double maximum = 95.50;
		
		//Übung 2:
		boolean status = true;
		short zahl1 = -1000;
		float zahl2 = 1.255F;
		char zeichen = '#';
		byte zahl3 = 8;
		float zahl4 = 2147483648F;
		
		//Übung 3
		String s = "Hallo Welt, lul";
		final short check_nr = 8765;
		
		/* Übung 4
		 * Datentypen sind in der Programmiersprache sinvoll, da mit ihnen einen schnelleren und effizienteren Code geschrieben werden kann.
		 */
		
		//Operatoren Übung 1 a)
		int ergebnis = 4 + 8 * 9 - 1;
		System.out.println(ergebnis);
		
		//b)
		int zaehler = 1;
		zaehler++;
		System.out.println(zaehler);
		
		//c)
		int division;
		division = 22/6;
		System.out.println(division);
		
		//Übung 3 a)
		int schalter = 10;
		System.out.println(schalter>7 && schalter<12);
		
		//b)
		System.out.println(schalter!=10 || schalter==12);
		
		System.out.println("Meine Oma " + "fährt im " + "Hühnerstall Motorrad.");
	}

}
