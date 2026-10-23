package pp;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        long s = System.nanoTime();

        String restaurantName = "McDonald";
        String restaurantAddress = "Los Angeles, US";

        ArrayList<TableData> tables = new ArrayList<>();
        tables.add(new TableData(1, 6, false, null, null));
        tables.add(new TableData(2, 6, false, null, null));
        tables.add(new TableData(3, 8, false, null, null));
        tables.add(new TableData(4, 4, false, null, null));
        tables.add(new TableData(5, 10, false, null, null));

        ArrayList<StaffData> staffs = new ArrayList<>();
        staffs.add(new StaffData("Ryan Lam", "Cleaning Service", false));
        staffs.add(new StaffData("Reinhard luhur", "Cleaning Service", false));
        staffs.add(new StaffData("Ivander", "Chef", false));
        staffs.add(new StaffData("Jayden Hamil", "Server", false));
        staffs.add(new StaffData("Clement", "Server", false));

        ArrayList<MenuItemData> menuItems = new ArrayList<>();
        menuItems.add(new MenuItemData("Spagethi MeatBALLS", "an attrocious food", 200));
        menuItems.add(new MenuItemData("Salmonela", "a delicious virus", 150));
        menuItems.add(new MenuItemData("Raw Steak", "red cepie for Disaster", 400));
        menuItems.add(new MenuItemData("Nasi Goreng Kuah", "sloppy, yucky, yummy", 80));
        menuItems.add(new MenuItemData("Spoiled milk", "nice and sour", 50));

        tables.get(0).isOccupied = true;
        tables.get(1).isOccupied = true;
        tables.get(2).isOccupied = true;

        viewMenu(menuItems);

        ArrayList<MenuItemData> table1Order = new ArrayList<>();
        table1Order.add(menuItems.get(0));
        table1Order.add(menuItems.get(2));
        table1Order.add(menuItems.get(4));

        StaffData table1Server = searchForStaff(staffs, "Server");
        table1Server.busy = true;

        OrderData table1CurrentOrder = placeOrder(table1Order);
        tables.get(0).currentOrder = table1CurrentOrder;

        PaymentMethodData table1PM = new PaymentMethodData("Cash", 1000);
        boolean paymentSuccessful = makePayment(table1CurrentOrder, table1PM);
        if (paymentSuccessful) {
            System.out.println("Payment successful for Table 1");
            getReceipt(tables.get(0), table1PM);
            table1Server.busy = false;
            tables.get(0).isOccupied = false;
            tables.get(0).currentOrder = null;
            tables.get(0).pm = null;
        }

        ArrayList<MenuItemData> table2Order = new ArrayList<>();
        table2Order.add(menuItems.get(0));
        table2Order.add(menuItems.get(0));
        table2Order.add(menuItems.get(1));
        table2Order.add(menuItems.get(3));
        table2Order.add(menuItems.get(2));

        StaffData table2Server = searchForStaff(staffs, "Server");
        table2Server.busy = true;

        StaffData table2CleaningStaff = searchForStaff(staffs, "Cleaning Service");
        table2CleaningStaff.busy = true;

        OrderData table2CurrentOrder = placeOrder(table2Order);
        tables.get(1).currentOrder = table2CurrentOrder;

        PaymentMethodData table2PM = new PaymentMethodData("Credit", 3000);
        paymentSuccessful = makePayment(table2CurrentOrder, table2PM);
        if (paymentSuccessful) {
            System.out.println("Payment successful for Table 2");
            getReceipt(tables.get(1), table2PM);
            table2Server.busy = false;
            table2CleaningStaff.busy = false;
            tables.get(1).isOccupied = false;
            tables.get(1).currentOrder = null;
            tables.get(1).pm = null;
        }

        long e = System.nanoTime();
        System.out.println("TIME TAKEN");
        System.out.println(e - s + "ns");
    }

    private static void viewMenu(ArrayList<MenuItemData> menuItems) {
        for (MenuItemData m : menuItems) {
            System.out.println(m.name + "\n" + m.description + "\n" + m.price);
        }
    }

    private static StaffData searchForStaff(ArrayList<StaffData> staffs, String role) {
        boolean roleFound = false;
        for (StaffData s : staffs) {
            if (!roleFound) {
                if (s.role.equals(role)) {
                    roleFound = true;
                }
            }
            if (s.role.equals(role) && !s.busy) {
                return s;
            }
        }
        if (roleFound) {
            System.out.println("All " + role + " staffs are busy");
        } else {
            System.out.println("We don't have " + role + " in this restaurant!");
        }
        return null;
    }

    private static OrderData placeOrder(ArrayList<MenuItemData> orderItems) {
        OrderData order = new OrderData();
        order.orderedItems = orderItems;
        order.calculateTotal();
        return order;
    }

    private static boolean makePayment(OrderData order, PaymentMethodData paymentMethod) {
        if (paymentMethod.amount >= order.totalCost) {
            System.out.println("Payment Successful!");
            return true;
        }
        System.out.println("Not enough Balance!");
        return false;
    }

    private static void getReceipt(TableData table, PaymentMethodData paymentMethod) {
        System.out.println("Table " + table.tableNumber + "'s Receipt: ");
        for (MenuItemData m : table.currentOrder.orderedItems) {
            System.out.println(m.name + "\n" + m.price);
        }
        System.out.println("Total: " + table.currentOrder.totalCost);
        System.out.println("Payment Method: " + paymentMethod.type + " - " + paymentMethod.amount);
        if (paymentMethod.type.equals("Cash")) {
            double r = table.currentOrder.totalCost - paymentMethod.amount;
            System.out.println("Return: " + r);
        }
    }
}

class TableData {
    int tableNumber;
    int capacity;
    boolean isOccupied;
    OrderData currentOrder;
    PaymentMethodData pm;

    TableData(int tableNumber, int capacity, boolean isOccupied, OrderData currentOrder, PaymentMethodData pm) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isOccupied = isOccupied;
        this.currentOrder = currentOrder;
        this.pm = pm;
    }
}

class StaffData {
    String name;
    String role;
    boolean busy;

    StaffData(String name, String role, boolean busy) {
        this.name = name;
        this.role = role;
        this.busy = busy;
    }
}

class MenuItemData {
    String name;
    String description;
    double price;

    MenuItemData(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}

class OrderData {
	ArrayList<MenuItemData> orderedItems;
	double totalCost;

	OrderData() {
	   orderedItems = new ArrayList<>();
	   totalCost = 0;
	}

	void calculateTotal() {
	   totalCost = 0;
	   for (MenuItemData mi : orderedItems) {
	       totalCost += mi.price;
	   }
	}
	}

	class PaymentMethodData {
	   String type;
	   double amount;

	   PaymentMethodData(String type, double amount) {
	       this.type = type;
	       this.amount = amount;
	   }
	}
