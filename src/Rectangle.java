import static java.lang.System.out;
public class Rectangle {

	double width;
	double height;

public double calculateArea(){
	
	// double area = this.width * this.height;
	
	return this.width * this.height;
	
	}
	void resize(double width, double height){
		this.width = width;
		this.height = height;		
	}
	public void printInfo(){
		out.println("Kur");
	}
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
		
	}
	public Rectangle() {
		// overloading....
		// read about constructor.....
	}
}
