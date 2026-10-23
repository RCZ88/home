package tester;
import java.util.Scanner;
public class AgainTwentyFiwe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 5;
        for(int i = 0; i<n-1; i++){
            a = a*5;
        }
        if(n == 0){
            a = 1;
        }
        System.out.println(a);
	}

}
