package tasks;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		
		int res=n*n;
		int sum=0;
		while(res>0) {
			sum+=res%10;
			res/=10;
		}
		if (n==sum) {
			System.out.println("neon number");
		}
		else {
			System.out.println("not neon nunber");
		}
	}
}
