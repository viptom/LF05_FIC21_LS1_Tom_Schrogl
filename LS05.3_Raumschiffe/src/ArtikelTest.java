
public class ArtikelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artikel him = new Artikel();
		Artikel ff = new Artikel();
		
		him.setBezeichnung("Himalayareis");
		him.setNummer(12);
		him.setEinkaufspreisInEuro(1.41);
		him.setVerkaufspreisInEuro(1.78);
		him.setSollBestand(100);
		him.setIstBestand(90);
		
		ff.setBezeichnung("Frische Fische");
		ff.setNummer(581);
		ff.setEinkaufspreisInEuro(7.21);
		ff.setVerkaufspreisInEuro(12.45);
		ff.setSollBestand(80);
		ff.setIstBestand(77);

		him.bestellen();
		ff.bestellen();
		System.out.println("");
		System.out.printf("Der Gewinn von %s beträgt: %.2f",him.getBezeichnung(),him.gewinnBerechen());
		System.out.println("");
		
		System.out.printf("Der Gewinn von %s beträgt: %.2f",ff.getBezeichnung(),ff.gewinnBerechen());
		System.out.println("\n");
		
		System.out.println(him.toString());
		
		System.out.println(ff.toString());
	}

}
