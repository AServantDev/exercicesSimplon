package exo18;

import java.util.Scanner;

public class Exo_1_3 {
	
	public static void guessNumber() {
		Scanner input = new Scanner(System.in);
		boolean isRight = false;
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		int input1 = input.nextInt();
		int valeur =0;
		
		for (int pos = 0; pos < tab.length; pos++) {
			if(tab[pos] == input1 ) {
				valeur = pos;
				break;
						
			}
		}System.out.println("Yeaaaah! " + valeur);
	}

	public static void main(String[] args) {
		
		guessNumber();

	}

}
