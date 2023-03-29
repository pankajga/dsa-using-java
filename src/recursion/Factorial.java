package recursion;

import java.util.Scanner;

public class Factorial {
	
	static int getFactorial(int input) {
		if(input == 0) {
			return 1;
		}
		return input*getFactorial(input-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		System.out.println(getFactorial(input));
	}

}
