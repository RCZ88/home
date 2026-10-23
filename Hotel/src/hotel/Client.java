package hotel;

public class Client {
	private int customerID; 
	private String name;
	private Dates arrive;
	private Dates leave;
	private Room bedroom;
	
	public Client(int id, String c, Dates dateIn, Dates dateOut, Room r) {
		setCustomerID(id);
		setName(c);
		setArrive(dateIn);
		setLeave(dateOut);
		setBedroom(r);
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dates getArrive() {
		return arrive;
	}

	public void setArrive(Dates arrive) {
		this.arrive = arrive;
	}

	public Dates getLeave() {
		return leave;
	}

	public void setLeave(Dates leave) {
		this.leave = leave;
	}

	public Room getBedroom() {
		return bedroom;
	}

	public void setBedroom(Room bedroom) {
		this.bedroom = bedroom;
	}
	
	public void bill() {
		System.out.println("Customer Name: " + name);
		System.out.println("Room Number: " + bedroom.getRoomNumber());
		System.out.println("Date Arrived: " + "\nDate: "+arrive.getDay() + "\nMonth: " + arrive.getMonth() + "\nYear: " + arrive.getYear());
		System.out.println("Date Leave: " + "\nDate: "+leave.getDay() + "\nMonth: " + leave.getMonth() + "\nYear: " + leave.getYear());
		System.out.println("Total Nights: " + Dates.StayDays(arrive, leave) + " Days");
		int totalPrice = bedroom.getPrice()*Dates.StayDays(arrive, leave);
		System.out.println("Total Price: " + totalPrice);
	}
	
}
