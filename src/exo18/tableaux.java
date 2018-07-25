package exo18;

import java.util.Scanner;

public class tableaux {
	
	public static void guessNumber() {
		Scanner input = new Scanner(System.in);
		boolean isRight = false;
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		int input1 = input.nextInt();
		int valeur =0;
		
		
		for (int pos = 0; pos < tab.length; pos++) {
			if(tab[pos] == input1 ) {
				pos = tab.length;
				isRight=true;
				
				
				
						
			}
			
		}if(isRight == true) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Saisir un nombre entier");
		
		guessNumber();
		// TODO Auto-generated method stub

	}

}
