//Simple Transaction code in java
package javasrc;
import java.util.Scanner;
public class bank {
	static int currentBalance,withdraw,upi,amount,id=0,n=1;	
	//Welcome Greetigs
	public static void greet() {
		System.out.println("Welcome HDFC Banking....");
		System.out.println("-----My Bank Offers------");
		System.out.println("deposit click(1)");
		System.out.println("withdraw  click(2)");
		System.out.println("Check balance click(3)");
		System.out.println("NOTE:FIRST SET YOUR UPI ID.");	
		System.out.println("-------------------------------------------");
	}
	//set upi
	public static void upid() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Set your UPI ID must contain: ");
		upi = sc.nextInt();
		System.out.println("UPI SUCCESSFULLY SET");
		System.out.println("UPI NO: "+upi);
	}
	//checkbalance
	public static void CheckBalance(){
		System.out.println("Balnce: "+currentBalance);
	}
	//withdraw
	public static void withdraw(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdraw Amount: ");
		withdraw=sc.nextInt();
		currentBalance=currentBalance-withdraw;
		System.out.println("WITHDREAW SUCCESS");
		System.out.println("Balance:"+currentBalance);
	}
	//deposit
	public static void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deposit your amount: ");
		amount=sc.nextInt();
		currentBalance=currentBalance+amount;
		System.out.println("DEPOSITE SUCCESS");
	}
	//main method
	public static void main(String[] args) {
		// scanner object
		Scanner sc = new Scanner(System.in);
		//method call
		greet();
		upid();
		int i=0;
		//condition
		id=upi;
		if(upi==id && n==1) {
		do{
		System.out.println("Enter your number: ");
		n=sc.nextInt();
		System.out.println("Eneter upi: ");
		id=sc.nextInt();
		if(n==1 && upi==id) {
			deposit();
		}
		else if(n==2 && upi==id && currentBalance!=0) {
			
			withdraw();
		}
		else if(n==3 && upi==id) {
			CheckBalance();
		}
		else {
			
			System.err.println("invalid Number: " +n);
			System.out.println("Balance:"+currentBalance);
		}
		}while(i<=n);
		}
		else {
			System.err.println("set upi");
		}
	}
}
