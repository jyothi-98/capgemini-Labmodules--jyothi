
/**
 * The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1.
 *  Every subsequent value is the sum of the 2 values preceding it. Write a Java program that uses both 
 * recursive and non-recursive functions to print the nth value of the Fibonacci sequence?
 */
import java.util.Scanner;

public class exercise3 {

	public static int fibonacci(int number){
		for(int i=0; i<= number; i++){ 
			System.out.print(getFibonacci(i) + " "); 
			}
		return number;
		} 
	public static int getFibonacci(int n){
		if (n == 0) { 
			return 1;
			} 
		if (n == 1){ 
			return 1; 
			} 
		int first = 1; int second = 1; int nth = 1;
			for (int i = 2; i <= n; i++) {
				nth = first + second;
				first = second;
				second = nth;
				}
			return nth;
			}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fib = sc.nextInt();
		fibonacci(fib);
		
		sc.close();
		
		

			

	}

}
