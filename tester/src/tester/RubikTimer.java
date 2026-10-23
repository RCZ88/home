package tester;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class RubikTimer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String[] moves = {"U", "D", "L", "R", "F", "B"};

        System.out.print("Input Scramble Size: ");
        int ss = sc.nextInt(); // scramble size
        System.out.print("Input Name: ");
        String sen = sc.next(); // session name
        sc.nextLine(); // consume the newline character
        System.out.println("Scramble Size Set to: "+ ss);
        
        boolean on = true;
        
        int sn = 0; //solve number
        double tt = 0; //total time
        double bt = 99999999; //best 
        double at = 0; //average time
        
        ArrayList<Double> tl = new ArrayList<>(); //timelist
        int pn = 0;
        while(on) {
        	sn++;
        	System.out.println("--------------------------------\nSolve #"+sn+"\n-----------");
        	StringBuilder s = new StringBuilder(); // Scramble
            for (int i = 0; i < ss; i++) {
            	int rs;

            	do {
            	    rs = r.nextInt(6);
            	} while (rs == pn);

            	pn = rs; 
                int rn = r.nextInt(3); // random number for move
                String m = "";
                switch (rn) {
                case 0:
                    m = ""; // No modifier
                    break;
                case 1:
                    m = "2"; // Double turn
                    break;
                case 2:
                    m = "'";
                    break;
                case 3:
                    m = "2"; // Double turn
                    break;
                default:
                    // Handle unexpected value
                    break;
            }
                s.append(moves[rs]).append(m);
                s.append(" ");
            }
            System.out.println("Scramble: \n"+s);

            System.out.println("Press Enter to start the timer.");
            sc.nextLine(); // Wait for Enter key press

            long st = System.currentTimeMillis(); //start time

            System.out.println("Log: \nTimer started. Press Enter to stop.");
            sc.nextLine(); // Wait for Enter key press

            long et = System.currentTimeMillis(); //end time

            long timm  = et - st; //time in millisecond
            double t= timm/1000.0; //time in second
            tl.add(t);
            
            if(t<bt) {
            	bt = t;
            }
            System.out.println("Timer stopped. \n\nStats:\nTime: " + t +"s");
            tt+=t;
            at = tt/sn; //average time
            System.out.println("Average Time: "+at+"s");
            System.out.println("Best Time: "+ bt+"s");
            System.out.println("\nPress 'e' to exit. (Press anything else to Continue)");
            String ce = sc.next();
            if(ce.equalsIgnoreCase("e")) {
            	on = false;
            }
            sc.nextLine();
        }
        
        System.out.println("---------------------\n"+sen+"'s Session\n---------------------");
        for(int i = 0; i<tl.size(); i++) {
            System.out.println("Solve #" + (i + 1) + ": " + tl.get(i) + "s");
           }
        System.out.println("-----------------\nAverage Time: "+at+"s");
        System.out.println("\nThank You For Using Java Timer!");
    }
}

