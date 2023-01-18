import java.util.Scanner;

public class Spielbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);
		int chip5;
		int chip10;
		int chip20;
		int chip50;
		int chip100;
		int gesamtEuro;
		
		System.out.println("Anzahl an 5 Euro Chips: ");
		chip5 = 5 * eingabe.nextInt();
		
		System.out.println("Anzahl an 10 Euro Chips: ");
		chip10 = 10 * eingabe.nextInt();
		
		System.out.println("Anzahl an 20 Euro Chips: ");
		chip20 = 20 * eingabe.nextInt();
		
		System.out.println("Anzahl an 50 Euro Chips: ");
		chip50 = 50 * eingabe.nextInt();
		
		System.out.println("Anzahl an 100 Euro Chips: ");
		chip100 = 100 * eingabe.nextInt();
		
		gesamtEuro = chip5 + chip10 + chip20 + chip50 + chip100;
		
		System.out.println("\nIhr Auszahlungsbetrag beträgt: " + gesamtEuro + " Euro.");
		
		eingabe.close();
	}

}
