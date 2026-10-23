package tester;
import java.util.Scanner; 

public class Isyourhorseshoeontheotherhoof {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[4];
        int s = 0;

        
        for (int i = 0; i < 4; i++) {
            n[i] = sc.nextInt();
        }

        
        boolean[] isColorRepeated = new boolean[101]; 
        
       
        for (int i = 0; i < 4; i++) {
            if (!isColorRepeated[n[i]]) {
                isColorRepeated[n[i]] = true;
            } else {
                s++;
            }
        }

        System.out.println(s);
    }
}
