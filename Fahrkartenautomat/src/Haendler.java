import java.util.Scanner;
public class Haendler {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Benutzereingaben lesen
        //System.out.println("was möchten Sie bestellen?");
        //String artikel = myScanner.next();
        String artikel = liesString("was möchten Sie bestellen?");
        
        //System.out.println("Geben Sie die Anzahl ein:");
        //int anzahl = myScanner.nextInt();
        int anzahl = liesInt("Geben Sie die Anzahl ein:");
        
        //System.out.println("Geben Sie den Nettopreis ein:");
        //double preis = myScanner.nextDouble();
        double preis = liesDouble("Geben Sie den Nettopreis ein:");
        
        //System.out.println("Geben Sie den Mehrwertsteuersatz in Prozent ein:");
        //double mwst = myScanner.nextDouble();
        double mwst = liesDouble("Geben Sie den Mehrwertsteuersatz in Prozent ein:");
       
        // Verarbeiten
        //double nettogesamtpreis = anzahl * preis;
        //double bruttogesamtpreis = nettogesamtpreis * (1 + mwst / 100);
        berechneGesamtnettopreis(anzahl, preis);
        berechneGesamtbruttopreis(preis, mwst);

        // Ausgeben
        //System.out.println("\tRechnung");
        //System.out.printf("\t\t Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
        //System.out.printf("\t\t Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");
        rechungausgeben(artikel, anzahl, preis, preis, mwst);
    }
    
    public static String liesString(String text) {
    	 Scanner myScanner = new Scanner(System.in);
    	 System.out.println(text);
    	 return myScanner.next();
    }
    
    public static int liesInt(String text) {
    	 Scanner myScanner = new Scanner(System.in);
    	 System.out.println(text);
    	 return myScanner.nextInt();
    }
    
    public static double liesDouble(String text) {
    	 Scanner myScanner = new Scanner(System.in);
    	 System.out.println(text);
         return myScanner.nextDouble();
    }
    
    public static double berechneGesamtnettopreis(int anzahl, double nettopreis) {
    	return anzahl * nettopreis;
    }
    
    public static double berechneGesamtbruttopreis(double nettogesamtpreis, double mwst) {
    	return nettogesamtpreis * (1 + mwst / 100);
    }
    
    public static void rechungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst) {
    	// Ausgeben
        System.out.println("\tRechnung");
        System.out.printf("\t\t Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
        System.out.printf("\t\t Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");
    }

}