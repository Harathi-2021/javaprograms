package basics;

import java.util.Scanner;

public class atmproject 
{
	

	public static void main(String[] args) {
		int balance=10000, withdraw, deposit;
		Scanner Sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Automated teller machine");
			System.out.println("1.withdraw");
			System.out.println("2.deposit");
			System.out.println("3.checkbaalnce");
			System.out.println("4. Exit");
			System.out.println("choose the operations you to perform");
			int choice = Sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter money to be withdrawn");
				withdraw=Sc.nextInt();
			if(balance>=withdraw)
			{
				balance=balance-withdraw;
				System.out.println("please collect your money");
			}
			else
			{
				System.out.println("insufficient baalnce");
			}
			System.out.println("");
			break;
			case 2:
			{
				System.out.println("Enter money to be deposited");
				deposit=Sc.nextInt();
				balance=balance+deposit;
				System.out.println("");
				break;
			}
			case 3:
			{
				System.out.println("present amount in your account:"+balance);
				break;
			}
			case 4:
				System.exit(0);
			}
		}
	}
}


		
		
