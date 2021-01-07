

/**
*Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green
with radio buttons. On entering the choice, an appropriate message with “stop” or “ready” or 
“go” should appear in the console .Initially there is no message shown
*Author:jyothi
*/
import java.util.Scanner;

public class exercise2 {

	public static void checkTraffic(String color) {
	
		switch(color) {
		case "red": System.out.println("STOP");
				  	break;
		case "yellow": System.out.println("READY");
						break;
		case "green": System.out.println("GO");
						break;
		default:
			System.out.println("color is invalid");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String color = sc.next();
		checkTraffic(color);
		sc.close();

	}

}