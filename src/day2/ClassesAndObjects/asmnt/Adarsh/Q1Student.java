package day2.ClassesAndObjects.asmnt.Adarsh;
public class Q1Student {
	
	//Declaration a Class
	private String name; 
	private int rollnumber;
	
	//Constructor Declaration
	public Q1Student(String name, int rollnumber) 
	{ 
		this.name = name; 
		this.rollnumber = rollnumber; 
		}
		
		
	//Method to print a object details
	public void printDetails() 
		{ 
			System.out.println("Name is " + this.name + ", Roll number is " + this.rollnumber ); 
		} 
	 
		public static void main(String[] args) 
		{ 
			
			// Creating the Object 
			Q1Student adarsh = new Q1Student("Adarsh Kumar", 2);
			
			
			// Calling methods
			adarsh.printDetails();
			
		} 
}
