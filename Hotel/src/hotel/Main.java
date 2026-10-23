package hotel;

public class Main {
    public static void main(String[] args) {
        // Create rooms
        Room room1 = new Room(101, 2, 100);
        Room room2 = new Room(102, 4, 200);
        Room room3 = new Room(103, 3, 150);
        Room room4 = new Room(104, 1, 80);

        // Add rooms to the hotel
        Hotel hotel = new Hotel();
        hotel.rooms.add(room1);
        hotel.rooms.add(room2);
        hotel.rooms.add(room3);
        hotel.rooms.add(room4);

        // Create dates for check-in and check-out
        Dates arrivalDate1 = new Dates(15, 4, 2024);
        Dates departureDate1 = new Dates(20, 4, 2024);
        Dates arrivalDate2 = new Dates(18, 4, 2024);
        Dates departureDate2 = new Dates(22, 4, 2024);

        // Create clients and assign rooms
        Client client1 = new Client(1, "John Doe", arrivalDate1, departureDate1, room1);
        Client client2 = new Client(2, "Jane Smith", arrivalDate2, departureDate2, room4);

        // Print the clients' bills
        client1.bill();
        System.out.println("\n-------------\n");
        client2.bill();

        System.out.println("\n-------------\n");

        // Create a group
        Group group = new Group("Family Vacation", 6);

        // Assign rooms to the group
        group.setNumber(2);
        int[] groupRooms = {room2.getRoomNumber(), room3.getRoomNumber()};

        // Print the group's bill
        double groupBill = group.bill(groupRooms);
        System.out.println("Group Bill: $" + groupBill);
    }
}