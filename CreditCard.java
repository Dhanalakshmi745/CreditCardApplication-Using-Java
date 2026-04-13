import java.util.Scanner;

public class CreditCard {
	String branch;
	long accountNumber;
	String name;
	String address;
	long mobileNumber;
	private int balance;
	
	
	public CreditCard(String branch,long accountNumber,String name,String address,long mobileNumber,int balance) {
		this.branch=branch;
		this.accountNumber=accountNumber;
		this.name=name;
		this.address=address;
		this.mobileNumber=mobileNumber;
		this.balance=balance;
	}
	public void displayInfo() {
		System.out.println("Branch"+branch);
		System.out.println("Account Number"+accountNumber);
		System.out.println("Name"+name);
		System.out.println("Address"+address);
		System.out.println("Mobile Number"+mobileNumber);
	}
	public void creditAmount(int amount) {
		balance+=amount;
		System.out.println("The total balance is  "+balance);
	}
	 public void cashWithdraw (int amount) {
		 if(balance>amount)
			 balance-=amount;
		 System.out.println("The current balance is "+balance);
	 }
}


class Tester{
	public static void main(String args[]) {
		CreditCard cc=new CreditCard("Ambhattur",123548689964L,"dhana","No:1/23,cross street",736878780l,5000);
		Scanner sc=new Scanner(System.in);
		cc.displayInfo();
		System.out.println("Select operation 1.credit or 2.Withdraw");
		int options=sc.nextInt();
		if(options==1) {
			System.out.println("Enter the amount to be credited");
			int a1=sc.nextInt();
			cc.creditAmount(a1);
		}
		else {
			System.out.println("Enter the amount to be withdraw");
			int a2=sc.nextInt();
			cc.cashWithdraw(a2);
		}
		
	}
}