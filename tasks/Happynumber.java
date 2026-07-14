package tasks;

import java.util.Scanner;

public class Happynumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int num = n;

        while (num != 1 && num != 4) {
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }

            num = sum;
        }

        if (num == 1)
            System.out.println("Happy Number");
        else
            System.out.println("not Happy Number");

        sc.close();
    }
}
