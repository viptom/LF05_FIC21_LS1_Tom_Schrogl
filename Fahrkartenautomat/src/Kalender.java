import java.util.Scanner;

public class Kalender {
    public static void main(String[] args) {
        int tage = 0;
        int monat;
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Wie lautet der Monat (1-12): ");
        monat = eingabe.nextInt();

        switch (monat) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                tage = 31;
                System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
                break;
                
            case 2:
                tage = 28;
                System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
                break;
                
            case 4:
            case 6:
            case 9:
            case 11:
                tage = 30;
                System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
                break;
                
            default:
        	    System.out.printf("Der Monat %d ist kein Monat", monat);
        	    break;
        }

        eingabe.close();
    }
}
