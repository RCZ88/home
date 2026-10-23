package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 11;
		ArrayList<Long> times = new ArrayList<>();
		for(int i = 0; i<a; i++) {
			long start = System.nanoTime();
			Bank bank1 = new Bank("BCA");
			Account acc1 = new Account("Samuel Kiswanto", 937756210, 3000);
			Account acc2 = new Account("Jason Harjono", 163403372, 5000);
			
			acc1.deposit(2000);
			acc1.transfer(acc2, 500);
			acc2.withdraw(1500);
			acc2.transfer(acc1, 750);
			acc1.withdraw(2000);
			acc1.deposit(5000);
			
			System.out.println();
			System.out.println("Account1's Balance: ");
			System.out.println(acc1.getBalance());
			System.out.println("Account2's Balance: ");
			System.out.println(acc2.getBalance());
			
			long end = System.nanoTime();
			long time = end-start;
			times.add(time);
		}
		int count = 0;
		long sum = 0;
		for(long time : times) {
			System.out.println(count + ". " + time);
			if(count>0) {
				sum+=time;
			}
			count ++;
		}
		long avg = sum/(a-1);
		System.out.println("Average: " + avg + " nano seconds");
	}

}
