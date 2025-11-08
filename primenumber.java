package exceptionHandling;

public class primeNum {

	public static void main(String[] args) {
		int N = 50;
		
		for(int i=1;i<=N;i++) {
			
			int count=0;
			
			for(int j=2;j<=i/2;j++) {
				
				if(i%j==0) {
					count++;
					break;
				}
				}
				if(count==0) {
					System.out.println(i);
			}
		}

	}
}
