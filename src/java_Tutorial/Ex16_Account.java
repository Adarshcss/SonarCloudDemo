package java_Tutorial;

public class Ex16_Account {

	public String Id;
	public String name;
	public int balance;

	public Ex16_Account(String Id, String name) {
		// TODO Auto-generated constructor stub
		this.Id = Id;
		this.name = name;
	}

	public Ex16_Account(String Id, String name, int balance) {
		// TODO Auto-generated constructor stub

		this.Id = Id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	
	private void credit() {
		// TODO Auto-generated method stub

	}
	
	private void debit() {
		// TODO Auto-generated method stub

	}
	
	private void transferTo() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ex16_Account[id=?,desc=?,qty=?,unitPrice=?]";
	}
}
