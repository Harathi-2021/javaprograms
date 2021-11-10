package basics;

import java.util.Scanner;

public class switchdemo 
{
	Scanner Sc=new Scanner(System.in);
	void menudriver()
	{
		int ch;
		System.out.println("Enter the month:");
		ch=Sc.nextInt();
		switch (ch)
		{
		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("aug");
			break;
		case 9:
			System.out.println("sep");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;
		default:
			System.out.println("invalid case");
			break;
		}
		
	}
	void chardemo()
	{
		System.out.println("R. Red");
		System.out.println("B. Blue");
		System.out.println("Y. yellow");
		System.out.println("W. White");
		System.out.println("G. Green");
		System.out.println("P. Pink");
		System.out.println("Enter your choice");
		char ch=Sc.next().charAt(0);
		switch (ch)
		{
		case 'R':
			System.out.println("It's Red");
			break;
		case 'B':
			System.out.println("It's Blue");
			break;
		case 'Y':
			System.out.println("It's Yellow");
			break;
		case 'G':
			System.out.println("It's Green");
			break;
		case 'P':
			System.out.println("It's Pink");
			break;
		case 'W':
			System.out.println("It's White");
			break;
		default:
			System.out.println("It's a invalid choice");
			break;
			}
	}
	void hotel()
	{
		System.out.println("southindian");
		System.out.println("maharastraian");
		System.out.println("Gujarathi");
		System.out.println("punjabi");
		System.out.println("Enter your choice");
		String str=Sc.next();
		switch (str)
		{
		case "southindian":
			System.out.println("idly sambar");
			System.out.println("masal dosa");
			System.out.println("vada pongal");
			break;
		case "maharastrian":
			System.out.println("Bahata vada");
			System.out.println("poha");
			System.out.println("subhudana kichadi");
			break;
		case "Gujarathi":
			System.out.println("dhokala");
			System.out.println("chaapthi");
			System.out.println("poori");
			break;
		case "punjabi":
			System.out.println("balepoori");
			System.out.println("chicken dosa");
			System.out.println("chapathi");
			break;
		default:
			System.out.println("It's a invalid choice");
			break;
		}
	}
		
		

	
	


	public static void main(String[] args) {
		switchdemo so=new switchdemo();
		//so.menudriver();
		//so.chardemo();
		so.hotel();

	}

}
