package tasks;

import java.util.Scanner;

public class Digitcount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n= sc.nextInt();
		
		int count=0;
		while(n>0) {
			count+=1;
			n=n/10;
		}
		System.out.println("count:"+count);
		
		sc.close();
	}
}
