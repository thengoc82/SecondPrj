package iuh.fit.se;
/**
 * @description A class representing a rectangle with length and width attributes, and methods to calculate area and perimeter.
 * @author 
 * @version 1.0
 * @created Sep 1, 2024
 */

public class TestRectangle {
	public static void main(String[] args) {
		// Test default constructor
		Rectangle r1 = new Rectangle();
		System.out.println("Default Rectangle - Length: " + r1.getLength() + ", Width: " + r1.getWidth());

		// Test parameterized constructor
		Rectangle r2 = new Rectangle(5.0, 3.0);
		System.out.println("Rectangle 2 Length: " + r2.getLength() + ", Width: " + r2.getWidth());

		// Test setters
		r2.setLength(6.0);
		r2.setWidth(4.0);
		System.out.println("Rectangle 3 Length: " + r2.getLength() + ", Width: " + r2.getWidth());

		// Test area and perimeter
		System.out.println("Rectangle 3 Area: " + r2.getArea() + ", Perimeter: " + r2.getPerimeter());

		// Test invalid inputs
		new Rectangle(-1.0, 2.0);
		r2.setLength(-2.0);
		r2.setWidth(-3.0);
	}
}
