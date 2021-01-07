
/**
 * Create a method to find the sum of the cubes of the digits of an n digit number
 * Author:jyothi
 */
import java.util.Scanner;
public class exercise1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int res = sumOfCube(n);
		System.out.println("Result : "+res);
	}
	private static int sumOfCube(int n) {
		// TODO Auto-generated method stub
		int sum=0,r;
		while(n!=0){
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		return sum;
	}
	
}
