package tester;
import java.util.Scanner;

public class CheapTravel {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//amount of rides//
		int m = sc.nextInt();//special ticket get per special price(b)//
		int a = sc.nextInt();//price for single normal ticket//
		int b = sc.nextInt(); //price for special ticket// 
		
		int tcp = 0; 
		
		double pptSpecial = (double)b/m; //pricePerTicket//
		if(pptSpecial<a) {
			int nost  = n/m; //numOfSpecialTickets//
			int tsp = nost*b; //totalSpecialPrice//
			int rst = n-nost*m;//remainder normal ticket that needs to be bought//
			int tnp = Math.min(rst*a,b);//total normal ticket price//
			tcp = tsp+tnp;
			
		}else if(pptSpecial>=a) {

			tcp = a*n; 
		}
		System.out.println(tcp);
	}
}