package tasks;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		n=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=n;i++) {
			if (n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime");
		}
		sc.close();
	}
}
