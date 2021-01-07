
/**
 * Create a class with a method which can calculate the sum of 
 * first n natural numbers which are divisible by 3 or 5.
 */
import java.util.Scanner;
public class exercise5{
public static void main(String args[]){
	Scanner out = new Scanner(System.in);
	System.out.println("enter the number");
	int n=out.nextInt();
	int a=calculateSum(n);
	System.out.println(a);
	
}
public static int calculateSum(int n){
	int sum=0;
	for(int i=0;i<=n;i++){
		if(i%3==0||i%5==0)
		{
			sum=sum+i;
		}
	}
	return sum;
}
}