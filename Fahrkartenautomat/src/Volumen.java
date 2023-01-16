
public class Volumen {

	public static void main(String[] args) {
		System.out.println(volumenBerechnung(volumenBerechnung(3)));
	}
	
	public static double volumenBerechnung(double zahl) {
		return Math.pow(zahl, 3);
	}
}
