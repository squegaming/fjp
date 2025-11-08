package exceptionHandling;
import java.util.*;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose an operator +,-,* or /");
		char operator = sc.next().charAt(0);
		
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		
		switch(operator) {
		
		case'+':
				System.out.println(num1 + num2);
		break;
		
		case'-':
				System.out.println(num1 - num2);
		break;
		
		case'*':
				System.out.println(num1 * num2);
		break;
		
		case'/':
				System.out.println(num1 / num2);
		break;
		
		default:
			System.out.println("Invalid Input");
		}
	}

}
