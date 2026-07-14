package tasks;

import java.util.Scanner;

public class Automorphic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		
		int res=n*n;
		int temp=n;
		
		
			temp=temp/10;
			res=res/10;
			
			if((temp%10)!=(res%10)) {
				System.out.println("not automorphic");
			}
			else {
				System.out.println("automorphic number");
			}
		
	}
}
