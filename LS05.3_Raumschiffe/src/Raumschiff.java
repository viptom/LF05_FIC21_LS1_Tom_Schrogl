import java.util.ArrayList;

public class Raumschiff {
	private int photonentorpedoAnzahl;
	private int energieversorgungInProzent;
	private int schildeInProzent;
	private int huelleInProzent;
	private int lebenserhaltungssystemeInProzent;
	private int androidenAnzahl;
	private String schiffsname;
	private static ArrayList<String> broadcastKommunikator = new ArrayList<String>();
	private ArrayList<Ladung> ladungsverzeichnis = new ArrayList<Ladung>();
	
	public Raumschiff() {}

	public Raumschiff(int photonentorpedoAnzahl, int energieversorgungInProzent, int zustandSchildeInProzent,
			int zustandHuelleInProzent, int zustandLebenserhaltungssystemeInProzent, int androidenAnzahl, String schiffsname) {
		this.photonentorpedoAnzahl = photonentorpedoAnzahl;
		this.energieversorgungInProzent = energieversorgungInProzent;
		this.schildeInProzent = zustandSchildeInProzent;
		this.huelleInProzent = zustandHuelleInProzent;
		this.lebenserhaltungssystemeInProzent = zustandLebenserhaltungssystemeInProzent;
		this.androidenAnzahl = androidenAnzahl;
		this.schiffsname = schiffsname;
	}

	public int getPhotonentorpedoAnzahl() {
		return photonentorpedoAnzahl;
	}

	public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahl) {
		this.photonentorpedoAnzahl = photonentorpedoAnzahl;
	}

	public int getEnergieversorgungInProzent() {
		return energieversorgungInProzent;
	}

	public void setEnergieversorgungInProzent(int energieversorgungInProzent) {
		this.energieversorgungInProzent = energieversorgungInProzent;
	}

	public int getSchildeInProzent() {
		return schildeInProzent;
	}

	public void setSchildeInProzent(int schildeInProzent) {
		this.schildeInProzent = schildeInProzent;
	}

	public int getHuelleInProzent() {
		return huelleInProzent;
	}

	public void setHuelleInProzent(int huelleInProzent) {
		this.huelleInProzent = huelleInProzent;
	}

	public int getLebenserhaltungssystemeInProzent() {
		return lebenserhaltungssystemeInProzent;
	}

	public void setLebenserhaltungssystemeInProzent(int lebenserhaltungssystemeInProzent) {
		this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
	}

	public int getAndroidenAnzahl() {
		return androidenAnzahl;
	}

	public void setAndroidenAnzahl(int androidenAnzahl) {
		this.androidenAnzahl = androidenAnzahl;
	}

	public String getSchiffsname() {
		return schiffsname;
	}

	public void setSchiffsname(String schiffsname) {
		this.schiffsname = schiffsname;
	}	
	
	public void addLadung(Ladung neueLadung) {
		this.ladungsverzeichnis.add(neueLadung);
	}
	
	public void photonentorpedoSchiessen(Raumschiff r) {
		if (this.getPhotonentorpedoAnzahl() < 1)
			this.nachrichtAnAlle("-=*Click*=-");
		else {
			this.setPhotonentorpedoAnzahl(this.getPhotonentorpedoAnzahl()-1);
			this.nachrichtAnAlle("Photonentorpedo abgeschossen");
			this.treffer(r);
		}
			
	}
	
	public void phaserkanoneSchiessen(Raumschiff r) {
		if(this.getEnergieversorgungInProzent() < 50)
			this.nachrichtAnAlle("-=*Click*=-");
		else {
			this.setEnergieversorgungInProzent(this.getEnergieversorgungInProzent()-50);
			this.nachrichtAnAlle("Phaserkanone abgeschossen");
			this.treffer(r);
		}
	}
	
	private void treffer(Raumschiff r) {
		System.out.printf("%s wurde getroffen!", r.getSchiffsname());
		r.setSchildeInProzent(r.getSchildeInProzent()-50);
		if (r.getSchildeInProzent() < 1) {
			r.setHuelleInProzent(r.getHuelleInProzent()-50);
			r.setEnergieversorgungInProzent(r.getEnergieversorgungInProzent()-50);
			if (r.getHuelleInProzent() < 1) {
				r.setLebenserhaltungssystemeInProzent(0);
				r.nachrichtAnAlle("Die Lebenserhaltungssystem wurden vernichtet!");
			}
		}
	}
	
	public void nachrichtAnAlle(String message) {
		broadcastKommunikator.add(message);
	}
	
	public static ArrayList<String> eintraegeLogbuchZurueckgeben() {
		return broadcastKommunikator;
	}
	
	public void photonentorpedosLaden(int anzahlTorpedos) {
		for(Ladung l : this.ladungsverzeichnis) {
			if(!l.getBezeichnung().equalsIgnoreCase("Photonentorpedo")) {
					System.out.println("Keine Photonentorpedos gefunden!");
					this.nachrichtAnAlle("-=*Click*=-");
			}
			if (anzahlTorpedos > this.photonentorpedoAnzahl)
				anzahlTorpedos = this.photonentorpedoAnzahl;
			else {
				this.photonentorpedoAnzahl = this.photonentorpedoAnzahl + l.getMenge();
				l.setMenge(0);
			}
		}
		System.out.printf("%d Photonentorpedo(s) eingesetzt", anzahlTorpedos);
	}
	
	public void reparaturDurchfuehren(boolean schutzschilde, boolean energieversorgung, boolean schiffshuelle, int anzahlDroiden) {
		int anzahlTrue = 0;
		
		if(schutzschilde)
			anzahlTrue++;
		
		if(energieversorgung)
			anzahlTrue++;
		
		if(schiffshuelle)
			anzahlTrue++;
		
		if(anzahlTrue > 0) {
			if(anzahlDroiden > this.androidenAnzahl)
				anzahlDroiden = this.androidenAnzahl;
			
			int prozentualeBerechnung = ((int) (Math.random()*Math.abs(anzahlDroiden)))/Math.abs(anzahlTrue);
			this.schildeInProzent += prozentualeBerechnung;
			this.energieversorgungInProzent += prozentualeBerechnung;
			this.huelleInProzent += prozentualeBerechnung;
		}
	}
	
	public void zustandRaumschiff() {
		System.out.println("Raumschiff [photonentorpedoAnzahl=" + photonentorpedoAnzahl + ", energieversorgungInProzent="
				+ energieversorgungInProzent + ", schildeInProzent=" + schildeInProzent + ", huelleInProzent="
				+ huelleInProzent + ", lebenserhaltungssystemeInProzent=" + lebenserhaltungssystemeInProzent
				+ ", androidenAnzahl=" + androidenAnzahl + "]");
	}
	

	public void ladungsverzeichnisAusgeben() {
		for(Ladung l : this.ladungsverzeichnis) {
			l.toString();
		}
	}
	
	public void ladungsverzeichnisAufraeumen() {
		for(Ladung l : this.ladungsverzeichnis) {
			if(l.getMenge() < 1)
				this.ladungsverzeichnis.remove(l);
		}
	}
}
