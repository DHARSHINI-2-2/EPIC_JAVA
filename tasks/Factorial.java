package tasks;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n= sc.nextInt();
		
		int result=factorial(n);   //function call
		
		System.out.println("factorial: "+result);
		
		sc.close();
	}
	public static int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
}
