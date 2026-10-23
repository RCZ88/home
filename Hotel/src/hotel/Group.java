package hotel;

public class Group {
	private Hotel hotel = new Hotel();
	private String name;
	private int amountOfClient;
	private Room room;
	private int number;
	
	public Group(String name, int aoc) {
		this.name = name;
		amountOfClient = aoc;
		numberOfRooms();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	int[]gRooms = new int[number];
	
	public double bill(int[]gRooms) {
		int totalCost = 0;
		for(int i = 0; i<gRooms.length; i++) {
			for(Room rooms : hotel.rooms) {
				if(rooms.getRoomNumber() == gRooms[i]) {
					totalCost += rooms.getPrice();
				}
			}
		}
		return totalCost;
	}
	
	private void numberOfRooms() {
		number = (int) Math.ceil(amountOfClient/room.getBeds());
		System.out.println(amountOfClient + " person are Split into " + number + " of Rooms.");
	}
}
