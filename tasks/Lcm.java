package tasks;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a n1: ");
		int n1=sc.nextInt();
		System.out.println("enter a n2: ");
		int n2=sc.nextInt();
		
		int res= n1>n2 ? n1 : n2;
		int gcd=0;
		
		for(int i=res; i>0;i--) {
			if (n1%i==0 && n2%i==0) {
				gcd=i;
				break;
			}
		}
		
		int lcm= (n1*n2)/gcd;
		System.out.println("lcm: "+lcm);
	}
}
