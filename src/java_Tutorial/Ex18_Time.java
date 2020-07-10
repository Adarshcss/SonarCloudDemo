package java_Tutorial;

public class Ex18_Time {

	private int houre;
	private int minute;
	private int second;

	public Ex18_Time(int houre, int minute, int second) {
		// TODO Auto-generated constructor stub

		this.houre = houre;
		this.minute = minute;
		this.second = second;
	}

	public int getHoure() {
		return houre;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHoure(int houre) {
		this.houre = houre;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	private void setTime(int houre, int minute, int second) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "hh:mm:ss";
	}
}
