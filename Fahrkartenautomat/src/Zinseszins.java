import java.util.Scanner;

public class Zinseszins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double laufzeit, kapital, zinssatz, auszahlung;
		Scanner eingabe = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie die Laufzeit für den Vertrag an: ");
		laufzeit = eingabe.nextDouble();
		System.out.print("Bitte geben Sie an, wie viel Kapital Sie anlegen: ");
		kapital = eingabe.nextDouble();
		auszahlung = kapital;
		System.out.print("Bitte geben Sie die den Zinssatz an: ");
		zinssatz = eingabe.nextDouble() / 100;
		
		for (int i = 0; i < laufzeit; i++) {
			auszahlung = auszahlung + auszahlung * zinssatz;
		}
		
		System.out.printf("\nEingezahltes Kapital: %.2f€", kapital);
		System.out.printf("\nAusgezahltes Kapital: %.2f€", auszahlung);
	}

}
