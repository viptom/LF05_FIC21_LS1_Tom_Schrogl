
public class Suche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] zahlenArray = { 1, 5, 5, 7, 3, 11, 22, 23, 27 }; 
		int wert = 2;

		int[] zahlenArray2 = { 33, 5, 3, 5, 9, 7, 11, 23, 23, 3};
		int wert2 = 3;
		
		boolean gefunden = false;
		
		for(int i = 0; i < zahlenArray.length; i++) {
			if (zahlenArray[i] == wert)
				gefunden = true;
		}
		
		if (!gefunden) {
			System.out.println("Nicht gefunden!");
		}
		else {
			System.out.println("Gefunden!");
		}
		
		for(int i = 0; i < zahlenArray2.length; i++) {
			if (zahlenArray2[i] == wert2)
				gefunden = true;
		}
		
		if (!gefunden) {
			System.out.println("Nicht gefunden!");
		}
		else {
			System.out.println("Gefunden!");
		}
	}

}
