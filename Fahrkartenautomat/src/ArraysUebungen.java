import java.util.Iterator;

public class ArraysUebungen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//aufgabeA7211(); //Aufgabe A7.2.1 Teilaufgabe 1
		//aufgabeA7212(); //Aufgabe A7.2.1 Teilaufgabe 2
		//aufgabeA7221(); //Aufgabe A7.2.2 Teilaufgabe 1
	}
	
	public static void aufgabeA7211() {
		int[] zahlen = new int[]{1, 6, 3, 7, 2};

		int i = 4;
		
		System.out.println(zahlen[1]); //vermutung Ausgabe: 6 -> richtig

		System.out.println(zahlen[5]); //vermutung Ausgabe: ArrayOutOfBounce Error -> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

		System.out.println(zahlen[3]); //vermutung Ausgabe: 7 -> richtig

		System.out.println(zahlen[i]); //vermutung Ausgabe: 2 -> richtig

		System.out.println(zahlen[i-2]); //vermutung Ausgabe: 3 -> richtig

		System.out.println(zahlen[zahlen[4]]); //vermutung Ausgabe: 3 -> richtig
	}
	
	public static void aufgabeA7212() {
		int[] zahlen = {1, 6, 3, 7, 2, 2, 4, 8};
		
		//vermutung Ausgabe: 3,7, -> richtig
		for (int i=2; i<=3; i++) {
		     System.out.print(zahlen[i] + ", ");
		}

		System.out.println("\n----------------------------");
		
		//vermutung Ausgabe: 1,6,3,7,2,2,4,8, ArrayIndexOutOfBoundsException -> richtig
		for (int i=0;  i<=zahlen.length;  i++) {
		      System.out.print (zahlen[i] + ", ");
		}
		
		System.out.println("\n----------------------------");
		
		//vermutung Ausgabe: 6,7,2,8 -> richtig
		for (int i=1; i<=zahlen.length-1; i=i+2) {
		      System.out.print(zahlen[i] + ", ");
		}
	}

	public static void aufgabeA7221() {
		// 1. Deklaration eines Arrays für ganze Zahlen.
		int[] arr;
		
	    // 2. Initialisierung des Arrays mit 100 Elementen.
		arr = new int[100];

	    // 3. Durchlaufen des gesamten Arrays und Ausgabe des Inhalts.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	    // 4. Das Array mit allen ganzen Zahlen von 1 bis 100 befüllen.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}

	    // 5. Geben Sie den Wert an der Stelle 89 des Arrays aus.
		System.out.println(arr[89]);

	    // 6. Ändern Sie den Wert des Arrayelements mit dem Index 49 zu 1060.
		arr[49] = 1060;

	    // Außerdem ändern Sie den Wert an der ersten und der letzte Stelle des Arrays zu 2020.
		arr[0] = 2020;
		arr[arr.length-1] = 2020;

	    // 7. Erneutes ausgeben des Arrayinhalts.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	    // Darstellung: Index und zugehöriger Inhalt (z.B. Index 6 - Inhalt: 7)
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("\nIndex:%d - Inhalt:%d",i,arr[i]);
		}

	    // 8. Berechnung des Durchschnitts aller Arrayelemente
		double durchschnhitt = 0;
		for (int i = 0; i < arr.length; i++) {
			durchschnhitt += arr[i];
		}
		System.out.printf("\nDurchschnitt:%.2f",durchschnhitt/arr.length);
	}
}
