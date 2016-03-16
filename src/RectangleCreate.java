import static java.lang.System.out;

public class RectangleCreate {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 5);
		
		

		rectangle.width = 10;
		rectangle.height = 10;
		// check about this.width;
		// double area = rectangle.height * rectangle.width;

		rectangle.calculateArea();
		System.out.println(rectangle.calculateArea());
		rectangle.resize(30, 20);
		System.out.println(rectangle.calculateArea());
	}

}
