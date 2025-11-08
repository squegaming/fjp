package exceptionHandling;

public class rectangle {
	double width;
	double length;
	double area;
	String colour;
	
	rectangle(double width,double length,String colour){
		this.width=width;
		this.length=length;
		this.colour=colour;
		find_area();
		
	}
	public double get_width() {
		return width;
	}
	public double get_length() {
		return length;
	}
	public String get_colour() {
		return colour;
	}
	public void find_area() {
		this.area = this.length * this.width;
	}
	
	
	public static void main(String[] args) {
		rectangle rect1 = new rectangle(10.4,20.4,"red");
		rectangle rect2 = new rectangle(10.4,20.4,"red");
		
		if(rect1.area == rect2.area && rect1.colour.equals(rect2.colour)) {
			
			System.out.println("Matching Rectangle");
		}else {
			System.out.println("Non-Matching Rectangle");
		}

	}

}
