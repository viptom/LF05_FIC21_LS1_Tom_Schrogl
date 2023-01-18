import java.util.Scanner;

public class Rechteck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);
		int a;
		int b;
		int umfang;
		int flaeche;
		
		System.out.println("SeiteA (in cm): ");
		a = eingabe.nextInt();
		
		System.out.println("SeiteB (in cm): ");
		b = eingabe.nextInt();
		
		umfang = 2*(a+b);
		flaeche = a*b;
		
		System.out.println("Umfang = " + umfang + " cm");
		System.out.println("Flaeche =  " + flaeche + " cm^2");
		
		eingabe.close();
	}

}
