package tasks;

import java.util.Scanner;

public class Perfectnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		
		int count=0;
		for(int i=1;i<n;i++) {
			if (n%i==0) {
				count+=i;
			}
		}
		
		if(count==n) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not perfect number");
		}
		sc.close();
	}
}
