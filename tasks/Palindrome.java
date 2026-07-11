package tasks;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		n = sc.nextInt();
		
		int rev=0;
		int num=n;
		
		while(num>0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		if(n==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		sc.close();
	}
}
