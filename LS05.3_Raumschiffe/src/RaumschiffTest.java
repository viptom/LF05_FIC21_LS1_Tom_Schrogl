
public class RaumschiffTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ladung l1 = new Ladung("Ferengi Schneckensaft", 200);
		Ladung l2 = new Ladung("Borg-Schrott", 5);
		Ladung l3 = new Ladung("Rote Materie", 2);
		Ladung l4 = new Ladung("Forschungssonde", 35);
		Ladung l5 = new Ladung("Bat'leth Klingonen Schwert", 200);
		Ladung l6 = new Ladung("Plasma-Waffe", 50);
		Ladung l7 = new Ladung("Photonentorpedo", 3);
		
		Raumschiff klingonen = new Raumschiff(1, 100, 100, 100, 100, 2, "IKS Hegh'ta");
		Raumschiff romulaner = new Raumschiff(2, 100, 100, 100, 100, 2, "IRW Khazara");
		Raumschiff vulkanier = new Raumschiff(0, 80, 80, 50, 100, 5, "Ni'Var");
		
		klingonen.addLadung(l1);
		klingonen.addLadung(l5);
		
		romulaner.addLadung(l2);
		romulaner.addLadung(l3);
		romulaner.addLadung(l6);
		
		vulkanier.addLadung(l4);
		vulkanier.addLadung(l7);
	}

}
