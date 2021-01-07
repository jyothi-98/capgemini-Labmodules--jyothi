

/**
 * Write a Java program that prompts the user for an integer and 
 * then prints out all the prime numbers up to that Integer?
 */

import java.util.Scanner;

public class exercise4 {

	public static void primeornot(int number) {
		int n, i;

		for (n = 1; n <= number; n++) {
			int flag = 0;
			for (i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag++;
					break;
				}

			}

			if (flag == 0 && n != 1) {
				System.out.println(n);

			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int num = sc.nextInt();
		primeornot(num);
		sc.close();
	}

}
