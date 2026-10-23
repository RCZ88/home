package tester;
import java.util.Scanner;
public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Soap Shop");
		//#2037 Lervia avocado $2500
		//#4623 Lervia Honey $2500
		//#9135 Na'eem Rose $4000
		//#5018 ImperialLeather $5200
		//#1234 My Baby Honey 2800
		String [] item = {"Lervia Avocado","Lervia Honey", "Naeem Roase", "Imperial Leather", "MyBaby Honey"};
		int [] price = {2500,2500,4000,5200,2800};
		int [] amount = new int [item.length];
		int [] tp = new int[price.length];
		System.out.println("Input Items: ");
		boolean cs = true;
		while(cs) {
			System.out.print("#");
			int code = sc.nextInt();
			if(code == 1) {
				amount[0]++;
			}else if(code == 2) {
				amount[1]++;
			}else if(code == 3) {
				amount[2]++;
			}else if(code == 4) {
				amount[3]++;
			}else if(code == 5) {
				amount[4]++;
			}else if(code == 0) {
				cs = false;
			}
		}
		int total = 0;//grandtotal
		for(int i = 0; i<amount.length; i++) {
			if(amount[i]>0) {
				tp[i] = amount[i]*price[i];
				total+=tp[i];
			}
		}
		System.out.println("Grand Total: "+total);
		System.out.print("Payment: ");
		
		String d = "$";
		int pay = sc.nextInt();
		System.out.println("\nItem:              Price:           Total:");
		System.out.println("----------------------------------------------------------------");
		for (int i = 0; i < amount.length; i++) {
		    if (amount[i] > 0) {
		    	System.out.printf("%-18s $%4d %5dx %5s%d\n", item[i], price[i], amount[i], d, tp[i]);
		    }
		}
		System.out.println("----------------------------------------------------------------");
		
		int change = pay-total;
		System.out.printf("Total:%31s%d\n",d,total);
		System.out.printf("Payment: %s%d\n",d,pay);
		System.out.printf("Change: %s%d\n",d,change);
	}

}
