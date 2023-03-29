package recursion;

import java.util.Scanner;

public class Fibonacci {
	
	static int f(int n) {
		if(n <= 1) {
			return n;
		}
		return f(n-1) + f(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		System.out.println(f(input));
	}

}
