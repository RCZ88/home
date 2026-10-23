package tester;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Assign1Store {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00"); 
        String []Instrument = {"Guitar", "Piano", "Keyboard", "Trumpet", "Saxophone", "Drum", "Banjo", "Maracas", "Flute", "Xhylophones"};
        double []Price = {750.55, 1400.15, 600.95, 550.95, 700.15, 1200.99, 500, 70.55, 325.45, 175.55};
        int[] Bought = new int[Instrument.length]; // Initialize Bought array
        
        int i = 0;
        for (i = 0; i < Instrument.length; i++) {
            System.out.print(i + ". ");
            System.out.println(Instrument[i] + "  $" + Price[i]);
        }
        
        boolean discount = false;
        int sn = 1; 
        String yonOUT = "yes"; 
        while (yonOUT.equals("yes")) {  
            System.out.println("Please enter the ID number of the product you would like to purchase -> ");
            int IL = scan.nextInt();
            scan.nextLine();
   
            if(sn==1) {
            	if(IL == -1) {
            		discount = true; 
            		System.out.println("Discount Applied!!");
            		sn++;	
            	}else {
            		if (IL < 0 || IL >= Instrument.length) {
                        System.out.println("Invalid instrument ID.");
                        continue;
                	}
                	String ITI = Instrument[IL];
                    System.out.println("You chose product id no: " + IL + ". How many " + ITI + " would you like to buy?" );
                    int numBought = scan.nextInt();
                    Bought[IL] += numBought; // Update the Bought array with the number bought

                    System.out.print("Would you like to continue shopping? (yes/no) -> ");
                    yonOUT = scan.next().toLowerCase();
                    scan.nextLine(); 
            	}
            }else {
            	if (IL < 0 || IL >= Instrument.length) {
                    System.out.println("Invalid instrument ID.");
                    continue;
            	}
            	String ITI = Instrument[IL];
                System.out.println("You chose product id no: " + IL + ". How many " + ITI + " would you like to buy?" );
                int numBought = scan.nextInt();
                Bought[IL] += numBought; // Update the Bought array with the number bought

                System.out.print("Would you like to continue shopping? (yes/no) -> ");
                yonOUT = scan.next().toLowerCase();
                scan.nextLine(); 
            }
            System.out.println("---------------------------------------------");
            sn++;
        }
        
        System.out.println("Instrument "+"     Price"+"     Amount"+"       Total");
        System.out.println("---------------------------------------------");
        double GrandTotal = 0;
        double total = 0; 
        String formattedGT = "";
        double save = 0; 
        for (i = 0; i < Instrument.length; i++) {
            if (Bought[i] > 0) {
            	if(discount = true) {
            		total = (0.9*Price[i] * Bought[i]);
            		String formattedTotal = decimalFormat.format(total);
                    System.out.printf("%-15s $%-10.2f %-10d $%s%n", 
                            Instrument[i], 0.9*Price[i], Bought[i], formattedTotal);
                    GrandTotal = GrandTotal+total;
                    formattedGT = decimalFormat.format(GrandTotal);
            	}else {
            		total = (Price[i] * Bought[i]);
            		String formattedTotal = decimalFormat.format(total);
                    System.out.printf("%-15s $%-10.2f %-10d $%s%n", 
                            Instrument[i], Price[i], Bought[i], formattedTotal);
                    GrandTotal = GrandTotal+total;
            	}
            	save = (0.1*Price[i] * Bought[i]);
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("Grand Total: $" + formattedGT);
        if(discount = true) {
        	System.out.println("You save a total amount of $"+ save);
        }
    }
    
}
