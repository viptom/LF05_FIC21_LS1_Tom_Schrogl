import java.util.Iterator;

public class Schleifen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i <= 20; i++) {
			System.out.printf("%d ", i*i);
			
		}
		
		System.out.println("\n");
		
		int i = 9;
		while(i <= 20) {
			i++;
			if (i == 11) continue;
			if (i == 18) break;		//Die Ausgabe geht nur bis 289, da ab i=18 das Programm abbricht
		    System.out.printf("%d ", i*i);
		}
	}

}
