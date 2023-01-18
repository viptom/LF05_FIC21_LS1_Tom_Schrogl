import java.util.Scanner;

public class Wechselstube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);
		int euro;
		int cent;
		int centGesamt;
		int zweiEuro;
		int einEuro;
		int fuenfzigCent;
		int zwanzigCent;
		int zehnCent;
		int fuenfCent;
		int zweiCent;
		int einCent;
		int rest;
		
		//Eingabe
		System.out.println("Wie viel Euro habe Sie?: ");
		euro = eingabe.nextInt();
		
		System.out.println("Wie viel Cent habe Sie?: ");
		cent = eingabe.nextInt();
		
		//Verarbeitung
		centGesamt = euro*100 + cent;
		
		zweiEuro = centGesamt / 200;
		rest = centGesamt % 200;
		
		einEuro = rest / 100;
		rest = rest % 100;
		
		fuenfzigCent = rest / 50;
		rest = rest % 50;
		
		zwanzigCent = rest / 20;
		rest = rest % 20;
		
		zehnCent = rest / 10;
		rest = rest % 10;
		
		fuenfCent = rest / 5;
		rest = rest % 5;
		
		zweiCent = rest / 2;
		rest = rest % 2;
		
		einCent = rest;
		
		//Ausgabe
		System.out.println("Sie bekommen " + centGesamt + " Cent als:");
		System.out.println(zweiEuro + " 2-Euro-Münzen");
		System.out.println(einEuro + " 1-Euro-Münzen");
		System.out.println(fuenfzigCent + " 50-Cent-Münzen");
		System.out.println(zwanzigCent + " 20-Cent-Münzen");
		System.out.println(zehnCent + " 10-Cent-Münzen");
		System.out.println(fuenfCent + " 5-Cent-Münzen");
		System.out.println(zweiCent + " 2-Cent-Münzen");
		System.out.println(einCent + " 1-Cent-Münzen");
		
		eingabe.close();
	}

}
