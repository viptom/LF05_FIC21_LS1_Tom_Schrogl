import java.util.Scanner;

public class Fallunterscheidungen {
    public static void main(String[] args) {

        int aufgabe;
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Welche Aufgabe solls sein?: ");
        aufgabe = eingabe.nextInt();

        switch(aufgabe){
            case 1:
                aufgabe1(eingabe);
                break;

            case 2:
                aufgabe2(eingabe);
                break;

            case 3:
                aufgabe3(eingabe, "");
                break;

            case 4:
                aufgabe4(eingabe);
                break;

            case 5:
                aufgabe5(eingabe);
                break;

            case 6:
                aufgabe6(eingabe);
                break;
        }
    }

    private static void aufgabe1(Scanner eingabe) {
        String note1, note2, note3, note4, note5, note6;
        note1 = "Sehr gut";
        note2 = "Gut";
        note3 = "Befriedigend";
        note4 = "Ausreichend";
        note5 = "Mangelhaft";
        note6 = "Ungenügend";
        int note;

        System.out.print("Bitte geben Sie Ihre Note ein: ");
        note = eingabe.nextInt();

        switch (note) {
            case 1:
                System.out.printf("Die Note " + note + " entspricht %s", note1);
                break;

            case 2:
                System.out.printf("Die Note " + note + " entspricht %s", note2);
                break;

            case 3:
                System.out.printf("Die Note " + note + " entspricht %s", note3);
                break;

            case 4:
                System.out.printf("Die Note " + note + " entspricht %s", note4);
                break;

            case 5:
                System.out.printf("Die Note " + note + " entspricht %s", note5);
                break;

            case 6:
                System.out.printf("Die Note " + note + " entspricht %s", note6);
                break;

            default:
                System.out.printf("Die Note " + note + " entspricht keine Note");
                break;
        }
    }

    private static void aufgabe2(Scanner eingabe) {
        String[] monate = {"Januar", "Februar", "März", "April", "Mai", "Junie", "Julie", "August", "September", "Oktober", "November", "Dezember"};
        int monat;

        System.out.print("Bitte geben Sie Ihren Monat ein: ");
        monat = eingabe.nextInt();

        switch (monat) {
            case 1:
                System.out.printf("Der Monat " + monat + " entspricht %s", monate[monat - 1]);
                break;

            case 2:
                System.out.printf("Der Monat " + monat + " entspricht %s", monate[monat - 1]);
                break;

            case 3:
                System.out.printf("Der Monat " + monat + " entspricht %s", monate[monat - 1]);
                break;

            case 4:
                System.out.printf("Der Monat " + monat + " entspricht %s", monate[monat - 1]);
                break;

            case 5:
                System.out.printf("Der Monat " + monat + " entspricht %s", monate[monat - 1]);
                break;

            case 6:
                System.out.printf("Der Monat " + monat + " entspricht %s", monate[monat - 1]);
                break;

            case 7:
                System.out.printf("Der Monat " + monat + " entspricht %s", monate[monat - 1]);
                break;

            case 8:
                System.out.printf("Der Monat " + monat + " entspricht %s", monate[monat - 1]);
                break;

            case 9:
                System.out.printf("Der Monat " + monat + " entspricht %s", monate[monat - 1]);
                break;

            case 10:
                System.out.printf("Der Monat " + monat + " entspricht %s", monate[monat - 1]);
                break;

            case 11:
                System.out.printf("Der Monat " + monat + " entspricht %s", monate[monat - 1]);
                break;

            case 12:
                System.out.printf("Der Monat " + monat + " entspricht %s", monate[monat - 1]);
                break;

            default:
                System.out.printf("Der Monat " + monat + " existiert nicht");
                break;
        }
    }

    private static void aufgabe3(Scanner eingabe, String romZahl) {
        int deciRomZahl = 0;
        if(romZahl == "") {
            System.out.print("Bitte gebe deine Römische Zahl ein: ");
            romZahl = eingabe.next();
        }
        
        if(max3Gleiche(romZahl)) {

        for (int i = 0; i <= romZahl.length()-1; i++) {

            switch (romZahl.charAt(i)) {

                case 'I':
                    deciRomZahl = deciRomZahl + 1;
                    break;

                case 'V':
                    deciRomZahl = deciRomZahl + 5;
                    break;

                case 'X':
                    deciRomZahl = deciRomZahl + 10;
                    break;

                case 'L':
                    deciRomZahl = deciRomZahl + 50;
                    break;

                case 'C':
                    deciRomZahl = deciRomZahl + 100;
                    break;

                case 'D':
                    deciRomZahl = deciRomZahl + 500;
                    break;

                case 'M':
                    deciRomZahl = deciRomZahl + 1000;
                    break;

                default:
                    System.out.printf("Der Buchstabe: "+ romZahl.charAt(i) + " existiert nicht in den Römischen Zahlen!");
                    System.exit(1);
                    break;
            	}
        	}
        System.out.printf("Deine Römische Zahl ist die Dezimalzahl: %d", deciRomZahl);
        }
    }

    private static void aufgabe4(Scanner eingabe) {
        float zahl1, zahl2, ergebnis;
        char operator;

        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        zahl1 = eingabe.nextFloat();
        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        zahl2 = eingabe.nextFloat();
        System.out.print("Bitte geben Sie den Operator an: ");
        operator = eingabe.next().charAt(0);
        switch (operator){
            case '+':
                ergebnis = zahl1 + zahl2;
                System.out.printf("Das Ergebnis ist: %.2f", ergebnis);
                break;
            case '-':
                ergebnis = zahl1 - zahl2;
                System.out.printf("Das Ergebnis ist: %.2f", ergebnis);
                break;
            case '*':
                ergebnis = zahl1 * zahl2;
                System.out.printf("Das Ergebnis ist: %.2f", ergebnis);
                break;
            case '/':
                ergebnis = zahl1 / zahl2;
                System.out.printf("Das Ergebnis ist: %.2f", ergebnis);
                break;
            default:
                System.out.print("Dieser Operator ist nicht gültig!");
                break;
        }
    }

    private static void aufgabe5(Scanner eingabe) {
        float r,u,i;
        char auswahl;

        System.out.print("Was soll berechnet werden?: ");
        auswahl = eingabe.next().charAt(0);

        switch (auswahl){
            case 'R':
                System.out.print("Bitte gebe den Wert für U an: ");
                u = eingabe.nextFloat();
                System.out.print("Bitte gebe den Wert für I an: ");
                i = eingabe.nextFloat();
                r = u / i;
                System.out.printf("Der Widerstand R beträgt: %.2f Ohm",r);
                break;

            case 'U':
                System.out.print("Bitte gebe den Wert für R an: ");
                r = eingabe.nextFloat();
                System.out.print("Bitte gebe den Wert für I an: ");
                i = eingabe.nextFloat();
                u = r * i;
                System.out.printf("Die Spannung U beträgt: %.2f Volt",u);
                break;

            case 'I':
                System.out.print("Bitte gebe den Wert für U an: ");
                u = eingabe.nextFloat();
                System.out.print("Bitte gebe den Wert für R an: ");
                r = eingabe.nextFloat();
                i = u / r;
                System.out.printf("Die Stromstärke I beträgt: %.2f Amper",i);
                break;

            default:
                System.out.print(auswahl + " ist kein gültiges Zeichen.");
                break;
        }
    }

    private static void aufgabe6(Scanner eingabe) {
        String romZahl;

        System.out.print("Bitte gebe deine Römische Zahl ein: ");
        romZahl = eingabe.next();

        if (additionsregel(eingabe, romZahl) && max3Gleiche(romZahl) && subtraktionsregel(romZahl)) {
            // Berechnung der Römischenzahl mit Subregeln in Mind
            System.exit(1);
        }

        System.out.print("\nIhre Römische Zahl: "+ romZahl + " ist ungültig");
    }

    private static boolean additionsregel(Scanner eingabe, String romZahl) {
    	if (romZahl == "III" || romZahl == "II" || romZahl == "I")
    		return true;
    	
        return false;
    }

    private static boolean max3Gleiche(String romZahl) {
        if (romZahl.length() < 4)
            return true;

        for (int i = 0; i <= romZahl.length(); i++) {
        	if (romZahl.charAt(i) == romZahl.charAt(romZahl.length()-3)) //PROBLEM
        		return true;
        	
        	if (romZahl.charAt(i) != romZahl.charAt(i+3))
        		return true;
        }
        
        return false;
    }

    private static boolean reihenfolgeSubtraktion(String romZahl) {
    	for (int i = 0; i <= romZahl.length(); i++) {
    		if ((romZahl.charAt(i) == 'I' && (romZahl.charAt(i+1) == 'V' || romZahl.charAt(i+1) == 'X'))
    		  || romZahl.charAt(i) == 'X' && (romZahl.charAt(i+1) == 'L' || romZahl.charAt(i+1) == 'C')
    		  || romZahl.charAt(i) == 'C' && ((romZahl.charAt(i+1) == 'D' || romZahl.charAt(i+1) == 'M')) || romZahl.charAt(i+1) == 'I') {
    			return true;
    		}
    	}
        return false;
    }

    private static boolean subtraktionsregel(String romZahl) {
        if(reihenfolgeSubtraktion(romZahl)) {
            return true;
        }
        return false;
    }
}
