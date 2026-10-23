package oop;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account("2107-JCH", "Jason Christian");
		Account acc2 = new Account("0609-RCZ", "Clement Zhao", 55000);
		
		acc2.transferTo(acc1, 22000);
		System.out.println("ACC1 Balance:"+acc1.getBalance());
		
		
		int creditAmt = 15000;
		acc2.credit(creditAmt);
		System.out.println(acc2.getId()+ " creditted: $"+ creditAmt + ", remaining balance:"+acc2.getBalance());
		
		int debitAmt = 32000;
		acc2.debit(debitAmt);
		System.out.println(acc2.getId()+ " debitted: $"+ debitAmt + ", remaining balance:"+acc2.getBalance());
	}

}
