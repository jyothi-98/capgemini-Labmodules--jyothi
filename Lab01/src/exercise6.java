
/**
 * Create a class with a method to find the difference between the sum of the squares 
 * and the square of the sum of the first n natural numbers.
 */

import java.util.Scanner;

public class exercise6 {

	public static int calculateDiff(int number) {
		int sum1 =0,sum2 = 0,result =0;
		for(int i =0;i<=number;i++) {
			sum1 += i * i;
			sum2 += i;
			result = sum1 + (sum2 * sum2);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = calculateDiff(num);
		System.out.println(res);
		sc.close();

	}

}