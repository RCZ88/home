package tester;
import java.util.*;
public class TwoButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int n1 = n;
		int m1 = 0;
		int m2 = 0;
		int ms = 0;
		if(m>n1) {
			while(n<m) {
				n = n*2;
				m2++;
				if(n==m) {
					break;
				}
			}
			if(n>m) {
				while(!(n==m)){
					n--;
					m2++;
					if(n==m) {
						break;
					}
				}
			}
			if(n == m) {
				n = n1;

			}
			if(n>1) {
				
			}
			while(n != m) {
				
				if(n*2<=m) {
					n = n*2;
					m1++;
				}else {
					while(!((n*2)<=m)) {
						n = n-1;
						m1++;
					}
				}
				if(n==m) {
					break;
				}
			}
			if(m1>m2) {
				ms = m2;
			}else if (m1<m2) {
				ms = m1;
			}else {
				ms = m2;
			}
		}else {
			while(!(n==m)) {
				n--;
				ms++;
				if(n==m) {
					break;
				}
			}
		}
		System.out.println(ms);
	}

}



