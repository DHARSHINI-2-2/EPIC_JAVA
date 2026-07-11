package tasks;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		
		fibonacci(n);
		
		
		sc.close();
	}
	public static void fibonacci(int n) {
		int a=0,b=1,f=0;
		System.out.println(a);  //i=0
		System.out.println(b); //i=1
		
		for(int i=2;i<n;i++) {
			f=a+b; //i=2 to n
			System.out.println(f);
			a=b;
			b=f;
		}
	}
}
