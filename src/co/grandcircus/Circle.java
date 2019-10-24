package co.grandcircus;

public class Circle {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		radius = 0;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRaidus() {
		return radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public double getArea() {
		return Math.pow(Math.PI * radius, 2);
	}

	public String getFormattedCircumference() {
		return String.format("%.2f", getCircumference());
	}

	public String getFormattedArea() {
		return String.format("%.2f", getArea());
	}

	@Override
	public String toString() {
		return String.format("Radius: %.2f\nArea: %.2f\nCircumference: %.2f", radius, getArea(), getCircumference());
	}

}
