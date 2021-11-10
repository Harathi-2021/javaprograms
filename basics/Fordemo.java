package basics;

import java.util.Scanner;

public class Fordemo 
{
	Scanner Sc=new Scanner(System.in);
	void formethod()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}
	void domethod()
	{
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
	}
	void whilemethod()
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
	void table()
	{
		int no;
		System.out.println("Enter the no:");
		no=Sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+ "*" +i+" = "+no*i);
		}
	}
	void nestedfor()
	{
		for(int i=1;i<=10;i++)//outer for loop
		{
		for(int j=1;j<=10;j++)//inner for loop
		{
				System.out.println(i+" "+j);
		}
			
		}
	}
	void starpyramid()
	{
		int term=6;
		for(int i=1;i<=term;i++)
		{
		for(int j=term;j>=i;j--)
		{
				System.out.print("* ");
		}
		System.out.println();
		}
		
	}
	void starpattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	void Factorial()
	{
		int no, i=1,fact=1;
		System.out.println("Enter no:");
		no=Sc.nextInt();
		while(i<=no)
		{
			System.out.println(fact=fact*i);
			i++;
		}
	}
	
	

	public static void main(String[] args) {
		Fordemo fw=new Fordemo();
		//fw.formethod();
		//fw.domethod();
		//fw.whilemethod();
		//fw.table();
		//fw.nestedfor();
		//fw.starpyramid();
		//fw.starpattern();
		fw.Factorial();

	}

}
