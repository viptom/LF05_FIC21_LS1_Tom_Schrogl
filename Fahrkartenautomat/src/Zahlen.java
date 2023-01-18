import java.util.Arrays;

//Entwerfen Sie einen Algorithmus, der die am häufigsten in einem Integer-Array vorkommende Zahl ausgibt, sowie die Anzahl der Vorkommen.

public class Zahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] zahlen = {3,4,2,3,5,1,2,7,2,1,2,4};
		int countFinal = 0, countTemp = 0, finalNumber = 0;
		
		for(int i = 0; i < zahlen.length; i++) {
			for(int j = 0; j < zahlen.length; j++) {
				if (zahlen[i] == zahlen[j]) {
					countTemp += 1;
				}
			}
			
			if(countTemp > countFinal) {
				countFinal = countTemp;
				countTemp = 0;
				finalNumber = i;
			} else {
				countTemp = 0;
			}
		}
		
		System.out.printf("\n Häufigste Zahl:%d - Vorkommen:%d",finalNumber, countFinal);
	}
}
