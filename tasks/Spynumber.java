package tasks;

import java.util.Scanner;

public class Spynumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		
		int sum=0;
		int mul=1;
		
		while(n>0) {
			sum+=n%10;
			mul*=n%10;
			n/=10;
		}
		if (sum==mul) {
			System.out.println("spy number");
		}
		else {
			System.out.println("not spy number");
		}
	}
}
