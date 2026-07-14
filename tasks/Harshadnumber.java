package tasks;

import java.util.Scanner;

public class Harshadnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		
		int r=0;
		int num=n;
		while(num>0) {
			r=r+num%10;
			num/=10;
		}
		if (n%r==0) {
			System.out.println("harshad number");
		}
		else {
			System.out.println("not harshad number");
		}
	}
}
