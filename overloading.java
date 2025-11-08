package exceptionHandling;

public class overloading {

	    String message;
	    int number;

	    public overloading() {
	        this.message = "NO Message Provided";
	        this.number = 0;
	        System.out.println("default constructor");
	    }

	    public overloading(String msg) {
	        this.message = msg;
	        this.number = 0;
	        System.out.println("String parameter constructor");
	    }

	    public overloading(int num) {
	        this.message = "NO Message Provided";
	        this.number = num;
	        System.out.println("integer parameter constructor");
	    }

	    public overloading(String msg, int num) {
	        this.message = msg;
	        this.number = num;
	        System.out.println("String & integer parameter constructor");
	    }

	    public void displayInfo() {
	        System.out.println("displayInfo: message - " + this.message + ", number - " + this.number);
	    }

	    public void displayInfo(String prefix) {
	        System.out.println(prefix + ": message - " + this.message + ", number - " + this.number);
	    }

	    public int add(int a, int b) {
	        return a + b;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        overloading obj1 = new overloading();
	        overloading obj2 = new overloading("hello");
	        overloading obj3 = new overloading(123);
	        overloading obj4 = new overloading("hello", 123);

	        System.out.println("\n--- Demonstrating method overloading ---");
	        obj1.displayInfo(); // corrected method name
	        obj2.displayInfo("prefixInfo");

	        System.out.println("Sum of two integers: " + obj1.add(5, 10));
	        System.out.println("Sum of two doubles: " + obj1.add(5.5, 10.4));
	    }
	}
