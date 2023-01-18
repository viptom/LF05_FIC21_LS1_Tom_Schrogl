import java.util.Scanner;

public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);
		/*
		 * int zahl1; double zahl2;
		 * 
		 * System.out.println("Bitte geben Sie eine Zahl ein: "); zahl1 =
		 * eingabe.nextInt(); System.out.println("Sie haben die Zahl: "+ zahl1 +
		 * " eingegeben");
		 * 
		 * System.out.println("\nBitte geben Sie eine zweite Zahl ein: "); zahl2 =
		 * eingabe.nextDouble(); System.out.println("Sie haben die Zahl: "+ zahl2 +
		 * " eingegeben");
		 */
		// Das Programm addiert, subtrahiert, multipliziert und dividiert zwei Zahlen zu einer Summe zusammen
		int zahl1 = 0;
		int zahl2 = 0;
		int ergebnisSumme = 0;
		int ergebnisSubtraktion= 0;
		int ergebnisMultiplikation = 0;
		int ergebnisDivision = 0;
		System.out.print("Bitte geben Sie eine ganze Zahl ein: ");			
		zahl1 = eingabe.nextInt();											//Eingabe
		
		System.out.print("Bitte geben Sie eine zweite ganze Zahl ein: ");
		zahl2 = eingabe.nextInt();											//Eingabe
		
		ergebnisSumme = zahl1 + zahl2;										//Verarbeitung
		ergebnisSubtraktion = zahl1 - zahl2;								//Verarbeitung
		ergebnisMultiplikation = zahl1 * zahl2;								//Verarbeitung
		ergebnisDivision = zahl1 / zahl2;									//Verarbeitung
		ergebnisDivision = zahl1 % zahl2;									//Verarbeitung
		
		System.out.println("\nSumme: " + ergebnisSumme);					//Ausgabe
		System.out.println("Differenz: " + ergebnisSubtraktion);			//Ausgabe
		System.out.println("Produkt: " + ergebnisMultiplikation);			//Ausgabe
		System.out.println("Quotient: " + ergebnisDivision);				//Ausgabe
		System.out.println("Rest: " + ergebnisDivision);					//Ausgabe
		
		eingabe.close();
	}

}
