package exceptionHandling;
import java.util.*;

public class sumAndAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int sum = 0;
		
		System.out.println("Enter" + num + "Numbers");
		
		for(int i=1;i<=num;i++) {
			
			int N = sc.nextInt();
			
			sum += N;
		}
		double Avg = sum / num;
		
		System.out.println(sum);
		System.out.println(Avg);
	}

}
