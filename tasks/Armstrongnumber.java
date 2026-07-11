package tasks;

import java.util.Scanner;

public class Armstrongnumber {
	public static void main(String[] args) { 
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		n=sc.nextInt();
		
		int rev=0;
		int r=0;
		int num=n;
		
		while(num>0) {
			r=num%10;
			rev=rev+(r*r*r);
			num=num/10;
		}
		
		System.out.println(rev);
		sc.close();
		
		if (n==rev) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("not Armstrong");
		}
	}
}
