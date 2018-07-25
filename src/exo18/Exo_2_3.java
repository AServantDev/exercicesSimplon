package exo18;

import java.util.Arrays;
import java.util.Scanner;

public class Exo_2_3 {

	public static void main(String[] args) {
		
	char[] tab = new char[6];
		
		Scanner input = new Scanner(System.in);
		int i;
		
		
		for(i = 0; i < tab.length; i++) {
			char inputUser = input.next().charAt(0);
			tab[i] = inputUser; 
		}
		
		Arrays.sort(tab);

		System.out.println(Arrays.toString(tab));
		System.out.println(tab[5]);

	}

}
