package DemoCode;


public class DemoClass {

	private String name;
	private int rollno;

	public void Q1_Student(String s, int i) {
		this.name = s;
		this.rollno = i;
	}

	public void display() {
		System.out.println("name is   " + name + "   rollno is   " + rollno);
	}

	public static void main(String[] args) {
		DemoClass stud = new DemoClass();
		stud.display();
	}
}
