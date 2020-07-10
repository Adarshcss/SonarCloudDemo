package java_Tutorial;

public class Ex12_YetAnotherCircleClass {

	// Base structure
	private double radius;

	// Base structure
	public Ex12_YetAnotherCircleClass() {
		radius = 1.0;
	}

	// Base structure
	public Ex12_YetAnotherCircleClass(double radius) {
		// TODO Missing initializing code
		this.radius = radius;
	}

	// Base structure
	public double getRadius() {
		return radius;
	}

	// Base structure
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 0.0;
	}

	public double getcCircumference() {
		// return radius*Math.PI*2;
		return 0.0;
	}

	// Base structure
	@Override
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
}
