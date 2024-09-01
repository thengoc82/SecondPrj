package iuh.fit.se;
/**
 * @description A class representing a rectangle with length and width attributes, and methods to calculate area and perimeter.
 * @author 
 * @version 1.0
 * @created Sep 1, 2024
 */

public class Rectangle {
	private double length;
	private double width;
	
	/**
	 * Default constructor initializing the rectangle with length and width of 0.0.
	 */
	public Rectangle() {
		this(0.0, 0.0);
	}
	
	/**
	 * Constructor to initialize the rectangle with specified length and width.
	 * @param length the length of the rectangle
	 * @param width the width of the rectangle
	 * @throws IllegalArgumentException if length or width is less than 0
	 */
	public Rectangle(double length, double width) {
		if (length < 0 || width < 0) {
			throw new IllegalArgumentException("Length and width must be greater than 0");
		}
		this.length = length;
		this.width = width;
	}

	/**
	 * Gets the length of the rectangle.
	 * @return the length of the rectangle
	 */
	public double getLength() {
		return length;
	}
	
	/**
	 * Sets the length of the rectangle.
	 * @param length the new length of the rectangle
	 * @throws IllegalArgumentException if length is less than 0
	 */
	public void setLength(double length) {
		if (length < 0) {
			throw new IllegalArgumentException("Length must be greater than 0");
		}
		this.length = length;
	}
	
	/**
	 * Gets the width of the rectangle.
	 * @return the width of the rectangle
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * Sets the width of the rectangle.
	 * @param width the new width of the rectangle
	 * @throws IllegalArgumentException if width is less than 0
	 */
	public void setWidth(double width) {
		if (width < 0) {
			throw new IllegalArgumentException("Width must be greater than 0");
		}
		this.width = width;
	}
	
	/**
	 * Calculates the area of the rectangle.
	 * @return the area of the rectangle
	 */
	public double getArea() {
		return length * width;
	}
	
	/**
	 * Calculates the perimeter of the rectangle.
	 * @return the perimeter of the rectangle
	 */
	public double getPerimeter() {
		return (length + width) * 2;
	}
}
