package exceptionHandling;

 class sportDemo{
	    String name;
	    int age;

	    sportDemo(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	}
	class Cricket extends sportDemo {
	    String role;

	    Cricket(String name, int age, String role) {
	        super(name, age);
	        this.role = role;
	    }

	    void showCricketDetails() {
	        displayInfo();
	        System.out.println("Cricket Role: " + role);
	    }
	}
	class Football extends sportDemo {
	    String position;

	    Football(String name, int age, String position) {
	        super(name, age);
	        this.position = position;
	    }

	    void showFootballDetails() {
	        displayInfo();
	        System.out.println("Football Position: " + position);
	    }
	}
	class Hockey extends sportDemo {
	    String stickType;

	    Hockey(String name, int age, String stickType) {
	        super(name, age);
	        this.stickType = stickType;
	    }

	    void showHockeyDetails() {
	        displayInfo();
	        System.out.println("Hockey Stick Type: " + stickType);
	    }
	}
	public class player {
	    public static void main(String[] args) {
	        Cricket c = new Cricket("Virat", 34, "Batsman");
	        Football f = new Football("Messi", 36, "Forward");
	        Hockey h = new Hockey("Dhyan", 28, "Wooden");

	        c.showCricketDetails();
	        f.showFootballDetails();
	        h.showHockeyDetails();
	    }
	}
