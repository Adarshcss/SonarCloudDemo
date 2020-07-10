package java_Tutorial;

public class Ex15_InvoiceItem {

	private String Id;
	private String Description;
	private int Quantity;
	private double UnitPrice;

	public Ex15_InvoiceItem(String Id, String Description, int Quantity, double UnitPrice) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return Id;
	}

	public String getDescription() {
		return Description;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}

	public double getTotal() {
		// TODO Auto-generated method stub
		return UnitPrice*0.0;
	}

	// Base structure
		@Override
		public String toString() {
			return "Ex15_InvoiceItem[id=?,desc=?,qty=?,unitPrice=?]";
		}
}
