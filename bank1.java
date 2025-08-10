package javasrc;

import java.util.Scanner;
public class bank1{
	static int currentBalance=0,n=0,amount;
	static void deposit(){
		currentBalance=currentBalance+amount;
		System.out.println("DEPOSIT SUCCESS: "+currentBalance);
	}
	static void withdraw(){
		if(amount>currentBalance){
			System.out.println("withdraw fail Balance only " +currentBalance+ "/- please deposit some money!");
		}
		else{
			currentBalance=currentBalance-amount;
			System.out.println("WITHDRAW SUCCESS");
			System.out.println("Balance: "+currentBalance);
		}
	} 
	static void checkbalance(){
		System.out.println("Balance: "+currentBalance);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! Please Enter 1.deposit 2.withdraw 3.checkbalance 4.exit. ");

		do{
			System.out.println("Enter your option: ");
			n=sc.nextInt();
			if(n==0) {
				System.out.println("invalid option");
			}
			else if(n==1){
				System.out.println("enter your amount: ");
				amount=sc.nextInt();
				deposit();
			}
			else if(n==2 && currentBalance!=0){
				System.out.println("Enter withdraw amount: ");
				amount=sc.nextInt();
				withdraw();
			}
			else if(n==3){
				checkbalance();
			}
			else if(n==4){
				System.out.println("Exit");
				break;
			}
			else{
				System.out.println("Insufficient balance");
			}
		}while(n>=0);
		sc.close();
	}
}
