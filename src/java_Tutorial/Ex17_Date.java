package java_Tutorial;

public class Ex17_Date {
	private int Day;
	private int Month;
	private int Year;

	public Ex17_Date(int Day, int Month, int Year) {
		// TODO Auto-generated constructor stub
		this.Day = Day;
		this.Month = Month;
		this.Year = Year;
	}

	public int getDay() {
		return Day;
	}

	public int getMonth() {
		return Month;
	}

	public int getYear() {
		return Year;
	}

	public void setDay(int day) {
		Day = day;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public void setYear(int year) {
		Year = year;
	}

	public void setDate() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "dd/mm/yy";
	}

}
