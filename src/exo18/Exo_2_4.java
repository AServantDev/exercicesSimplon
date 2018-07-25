package exo18;

import java.util.Arrays;
import java.util.Scanner;

public class Exo_2_4 {

	public static void main(String[] args) {
		
	int[] tab = new int[6];
		
		Scanner input = new Scanner(System.in);
		int i;
		
		
		for(i = 0; i < tab.length; i++) {
			int inputUser = input.nextInt();
			tab[i] = inputUser; 
		}
		
		double sum =0;
				
		for(i = 0; i < tab.length; i++ ) {
			
			sum = sum + tab[i];
			
			
		}
		double divide = sum / i;
		System.out.println(divide);
		
		Arrays.sort(tab);

		System.out.println(Arrays.toString(tab));
		
	}

}