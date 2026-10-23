package oop;

public class InvoiceItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvoiceItem item1 = new InvoiceItem("TEST", "A STRING TEST", 99, 56.50);
		double total = item1.getTotal();
		System.out.println(total);
	}

}
