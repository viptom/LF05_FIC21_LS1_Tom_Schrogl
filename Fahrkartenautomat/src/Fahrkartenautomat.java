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
		String[] fahrkarten = { //7.4
				"Einzelfahrschein AB [3,00 EUR] (1)",
				"Einzelfahrschein BC [3,50 EUR] (2)",
				"Einzelfahrschein ABC [3,80 EUR] (3)",
				"Einzelfahrschein AB [2,00 EUR] (4)",
				"Einzelfahrschein AB [8,60 EUR] (5)",
				"Einzelfahrschein AB [9,20 EUR] (6)",
				"Einzelfahrschein AB [10,00 EUR] (7)",
				"Einzelfahrschein AB [9,40 EUR] (8)",
				"Einzelfahrschein AB [12,60 EUR] (9)",
				"Einzelfahrschein AB [13,80 EUR] (10)",
				"Einzelfahrschein AB [25,50 EUR] (11)",
				"Einzelfahrschein AB [26,00 EUR] (12)",
				"Einzelfahrschein AB [26,50 EUR] (13)",
				"Bezahlen (14)"
		};
		System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:");
		for (int i = 0; i<fahrkarten.length; i++) {
			System.out.println(fahrkarten[i]);
		}
	}
	
	//Kartenauswahl und Ticketanzahl
	public static double fahrkartenbestellungErfassen(Scanner tastatur) {
		boolean isBezahlt = true;
		int ticketTyp;
		double[] ticketPreis = {3.00, 3.50, 3.80, 2.00, 8.60, 9.20, 10.00, 9.40, 12.60, 13.80, 25.50, 26.00, 26.50}; //7.4
		double anzahlTickets = 0;
		double zwischenSumme = 0;
		double zuZahlenderBetrag;
		
		while (isBezahlt) { //4.4
        	
        	System.out.println("Ihre Wahl: ");
        	ticketTyp = tastatur.nextInt();
        
        	switch (ticketTyp) {
        	case 1:
        	case 2:
        	case 3:
        	case 4:
        	case 5:
        	case 6:
        	case 7:
        	case 8:
        	case 9:
        	case 10:
        	case 11:
        	case 12:
        	case 13:
        		break;
        	case 14:
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
                System.out.println(" >> Wählen Sie bitte eine Anzahl von 1 bis 13 Tickets aus << \n");
                anzahlTickets = tastatur.nextDouble();
            }
            
            zwischenSumme = zwischenSumme + ticketPreis[ticketTyp-1] * anzahlTickets;
            System.out.printf("\nZwischensumme: %.2f€\n",zwischenSumme);
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