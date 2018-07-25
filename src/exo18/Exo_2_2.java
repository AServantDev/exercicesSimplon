package exo18;
import java.util.Arrays;
import java.util.Scanner;

public class Exo_2_2 {

public static void main(String[] args) {
		
		int[] tab = new int[6];
		
		Scanner input = new Scanner(System.in);
		int i;
		
		
		for(i = 0; i < tab.length; i++) {
			int inputUser = input.nextInt();
			tab[i] = inputUser; 
		}
		
		Arrays.sort(tab);

		System.out.println(Arrays.toString(tab));
		System.out.println(tab[5]);
	}

}
