package exo18;
import java.util.Arrays;
import java.util.Scanner;

public class Exo_1_4 {

	
		
		
	public static void main(String[] args) {
		
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
		Scanner input = new Scanner(System.in);
		
		int input1 = input.nextInt();
		int input2 = input.nextInt();
		
		System.out.println(Arrays.toString(tab));
		
		int temp = input1;
		tab[input1] = tab[input2];
		tab[input2] = temp;
		
		System.out.println(Arrays.toString(tab));
		// TODO Auto-generated method stub

	}

}
