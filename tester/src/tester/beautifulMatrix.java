package tester;
import java.util.Scanner;

public class beautifulMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String fl = scan.nextLine().replace(" ", "");
		String sl = scan.nextLine().replace(" ", "");
		String tl = scan.nextLine().replace(" ", "");
		String fol = scan.nextLine().replace(" ", "");
		String fil = scan.nextLine().replace(" ", "");
		
		int toMiddleColumn = 0;
		int toMiddleRow = 0; 
		
		int columnAt = 0; 
		int rowAt = 0; 
		
		if(fl.contains("1")||fil.contains("1")) {
			toMiddleColumn = 2;
			if(fl.contains("1")) {
				columnAt = 1;
			}else if(fil.contains("1")){
				columnAt = 5;
			}
		}else if(sl.contains("1")||fol.contains("1")){
			toMiddleColumn  = 1; 
			if(sl.contains("1")) {
				columnAt = 2;
			}else if (fol.contains("1")){
				columnAt = 4;
			}
		}else if(tl.contains("1")){
			toMiddleColumn = 0;
			columnAt = 3;
		}

			if(columnAt == 1) {
				rowAt = fl.indexOf("1")+1;
			}else if (columnAt == 2) {
				rowAt = sl.indexOf("1")+1;
			}else if (columnAt == 3) {
				rowAt = tl.indexOf("1")+1;
			}else if (columnAt == 4) {
				rowAt = fol.indexOf("1")+1;
			}else if(columnAt == 5) {
				rowAt = fil.indexOf("1")+1;
			}
			
		if(rowAt == 1 || rowAt == 5) {
			toMiddleRow = 2;
		}else if(rowAt == 2 || rowAt == 4) {
			toMiddleRow = 1;
		}else if (rowAt == 3) {
			toMiddleRow =0;
		}
		
		int toMiddle = toMiddleRow + toMiddleColumn;
		System.out.println(toMiddle);
	}
}
