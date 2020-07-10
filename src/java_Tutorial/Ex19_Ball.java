package java_Tutorial;

public class Ex19_Ball {

	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;

	public Ex19_Ball(float x, float y, int radius, int speed, int direction) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public float getXdelta() {
		return xDelta;
	}

	public void setXdelta(float xdelta) {
		this.xDelta = xdelta;
	}

	public float getYdelta() {
		return yDelta;
	}

	public void setYdelta(float ydelta) {
		this.yDelta = ydelta;
	}

	public void move() {
		x += xDelta;
		y += yDelta;
	}

	public void reflectHorizontal() {
		// TODO Auto-generated method stub
		xDelta = -xDelta;
	}

	public void reflectVertical() {
		// TODO Auto-generated method stub

		yDelta = -yDelta;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ball[(x,y),speed=(xDelta yDelta)]";
	}
}
