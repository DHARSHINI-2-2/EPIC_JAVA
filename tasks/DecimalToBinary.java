package tasks;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter decimal number: ");
        int decimal = sc.nextInt();
        int[] binary = new int[32];
        int i = 0;

        if (decimal == 0) {
            System.out.println(0);
            return;
        }

        while (decimal > 0) {
            binary[i] = decimal % 2;
            decimal = decimal / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }
}
