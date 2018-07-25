package exo18;
import java.util.Arrays;
import java.util.Scanner;

public class Exo_2_5 {

	public static void main(String[] args) {
		
		//Création du scanner
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		//Création du tableau
		char[] tab = new char[n];
		
		
		int i;
		
		for(i=0; i < tab.length; i++) {
			Scanner input2 = new Scanner(System.in);
			char j = input2.next().charAt(0);
			tab[i] = j;
		}
		
		System.out.println(Arrays.toString(tab));
		

	}

}
