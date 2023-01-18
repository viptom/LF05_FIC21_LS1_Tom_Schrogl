import java.util.Scanner;

public class Zinsen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);
		double euro;
		double zinssatz;
		double jahre;
		double zinsen;
		double zinseszinsen;
		
		System.out.print("Einzahlung in Euro: ");
		euro = eingabe.nextDouble();
		
		System.out.print("Zinsen in Prozent: ");
		zinssatz = eingabe.nextDouble();
		
		System.out.print("Jahre: ");
		jahre = eingabe.nextDouble();
		
		zinsen = euro * (zinssatz / 100) * jahre;
		zinseszinsen = euro * Math.pow((1 + zinssatz / 100), jahre); //ist um eine kommastelle falsch
		
		System.out.println("\nDer Investor hat insgesamt " + zinsen + " Euro erhalten");
		System.out.println("Der Investor hat insgesamt " + zinseszinsen + " Euro erhalten");
		eingabe.close();
	}

}
