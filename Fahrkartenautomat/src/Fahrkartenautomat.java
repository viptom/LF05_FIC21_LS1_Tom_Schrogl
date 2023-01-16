import java.util.Scanner;

class Fahrkartenautomat {
	public static void main(String[] args) {

		double zuZahlenderBetrag;
		double eingezahlterGesamtbetrag;
		double rueckgabebetrag;
		
		
		Scanner tastatur = new Scanner(System.in);
		
        begruessung();
        zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
        eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
        rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
        rueckgabebetrag = Math.round(rueckgabebetrag*100.0)/100.0; //2.8
        fahrkartenAusgeben();
        if (rueckgabebetrag > 0.0) {
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro ", rueckgabebetrag); //2.8
			System.out.println("wird in folgenden Münzen ausgezahlt:");
			rueckgabebetrag = muenzRueckgabe(rueckgabebetrag, 2.0);
			rueckgabebetrag = muenzRueckgabe(rueckgabebetrag, 1.0);
			rueckgabebetrag = muenzRueckgabe(rueckgabebetrag, 0.5);
			rueckgabebetrag = muenzRueckgabe(rueckgabebetrag, 0.2);
			rueckgabebetrag = muenzRueckgabe(rueckgabebetrag, 0.1);
			rueckgabebetrag = muenzRueckgabe(rueckgabebetrag, 0.05);
        }
        rueckgeldAusgeben();
        
		tastatur.close();
	}
	
	public static void begruessung() {
		//4.3
        System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:\r\n"
        		+ "  Kurzstrecke AB [2,00 EUR] (1)\r\n"
        		+ "  Einzelfahrschein AB [3,00 EUR] (2)\r\n"
        		+ "  Tageskarte AB [8,80 EUR] (3)\r\n"
        		+ "  4-Fahrten-Karte AB [9,40 EUR] (4)"
        		+ "  Bezahlen (9)");
	}
	
	//Kartenauswahl und Ticketanzahl
	public static double fahrkartenbestellungErfassen(Scanner tastatur) {
		boolean isBezahlt = true;
		int ticketTyp;
		double ticketPreis = 0;
		double anzahlTickets = 0;
		double zwischenSumme = 0;
		double zuZahlenderBetrag;
		
		while (isBezahlt) { //4.4
        	
        	System.out.println("Ihre Wahl: ");
        	ticketTyp = tastatur.nextInt();
        
        	switch (ticketTyp) {
        	case 1:
        		ticketPreis = 2;
        		break;
			
        	case 2:
        		ticketPreis = 3;
        		break;

        	case 3:
        		ticketPreis = 8;
        		break;
	
        	case 4:
        		ticketPreis = 9.4;
        		break;
        		
        	case 9:
        		isBezahlt = false;
        		break;

        	default:
        		System.out.println(" >>falsche Eingabe<<");
        		break;
        	}
        	
        	if(isBezahlt) {
        	System.out.println("Anzahl der Tickets: "); //2.7
            anzahlTickets = tastatur.nextDouble();
            
            while (anzahlTickets < 1 || anzahlTickets > 10) { //4.2
                System.out.println(" >> Wählen Sie bitte eine Anzahl von 1 bis 10 Tickets aus << \n");
                anzahlTickets = tastatur.nextDouble();
            }
            
            zwischenSumme = zwischenSumme + ticketPreis * anzahlTickets;
            System.out.println("\nZwischensumme: " + zwischenSumme + " €\n");
        	}
        
        }
        
        zuZahlenderBetrag = zwischenSumme;
        
        return zuZahlenderBetrag;
	}
	
	public static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {
		double eingezahlterGesamtbetrag;
		double nochZuZahlen;
		double eingeworfeneMuenze;
		
		// Geldeinwurf
		eingezahlterGesamtbetrag = 0.0;
		nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.printf("\nNoch zu zahlen: %.2f Euro\n",nochZuZahlen); //2.6
			System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
		}
		
		return eingezahlterGesamtbetrag;
	}
	
	public static void fahrkartenAusgeben() {
		// Fahrscheinausgabe
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
	}
	
	public static void rueckgeldAusgeben() {
		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");
	}
	
	public static double muenzRueckgabe(double rueckgabebetrag, double muenze) {
		while (rueckgabebetrag >= muenze) { //Euro-Münzen
				if (muenze < 1)
					System.out.printf("\n%.2f Cent", muenze);
				if (muenze >= 1)
					System.out.printf("\n%.2f Euro", muenze);
				rueckgabebetrag = rueckgabebetrag - muenze;
			}
		return rueckgabebetrag;
		}
	}