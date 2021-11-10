package basics;

import java.util.Scanner;

public class elsedemo 
{
	Scanner Sc=new Scanner(System.in);
	void ifelsedemo()
	{
		int age;
		System.out.println("Enter the name");
		String Name=Sc.next();
		System.out.println("Enter the age");
		age=Sc.nextInt();
		if (age>=60)
		{
			System.out.println("you are not eligible for work,you are senior citizen");
		}
		else if(age<60 && age>=18)
		{
			System.out.println("you are eligible for work");
		}
		else if(age<18 && age>=5)
		{
			System.out.println("you are for education");
		}
		else
		{
			System.out.println("you are kid,go for play");
		}
		
	}
	void voting()
	{
		int age;
		System.out.println("Enter the age:");
		age=Sc.nextInt();
		if(age>=18)
		{
			System.out.println("elgible for vote");
		}
		else
		{
			System.out.println("not eligible for vote");
		}
			
	}
	void donating()
	{
		int age,weight;
		System.out.println("Enter the age:");
		age=Sc.nextInt();
		System.out.println("Enter the weight");
		weight=Sc.nextInt();
//		if(age>=18)
		{
			if(weight>=55)
			{
				System.out.println("ur eligible for blood donating");
			}
			else if(weight<55)
			{
				System.out.println("not eligible for blood donation");
			}
			else if(age<=18 && weight<55)
			{
				System.out.println("not eligible for donating blood");
			}
			
				
		}
	}
	
	public static void main(String[] args) {
		elsedemo na=new elsedemo();
		na.ifelsedemo();
	    na.voting();
	    na.donating();
	}

}
