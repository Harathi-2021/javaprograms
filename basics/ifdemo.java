package basics;

import java.util.Scanner;

public class ifdemo 
{
	int n0,n1,n2,n3,year;
	Scanner Sc=new Scanner(System.in);
	void ifstmt()
	{
		System.out.println("Enter the n0:");
		n0=Sc.nextInt();
		if(n0>0)
		{
			System.out.println(n0+" is a positive no");
		}
		else
		{
			System.out.println(n0+" is a negative no");
		}
	}
	void evenodd()
	{
		if(n0%2==0)
		{
			System.out.println(n0+"is even number");
		}
		else
		{
			System.out.println(n0+"is odd number");
		}
	}
	void leapyear()
	{
		System.out.println("Enter the year");
		year=Sc.nextInt();
		if(year%4==0)
		{
			System.out.println("it is leap year");
		}
		else
		{
			System.out.println("it is not a leap year");
		}
	}
	void ifelseladderDeno()
	{
		int maths,phy,chem;
		String studtName;
		System.out.println("Enter the studentname");
		studtName=Sc.next();
		System.out.println("Enter the mathsmarks ");
		maths=Sc.nextInt();
		System.out.println("Enter the Physicsmarks");
		phy=Sc.nextInt();
		System.out.println("Enter the chemistrymarks ");
		chem=Sc.nextInt();
		int sum=phy+maths+chem;
		int per=sum/3;
		if(per>=75)
		{
			System.out.println(studtName+"got "+per+" distinction");
		}
		else if(per<75 && per>=60)
		{
			System.out.println(studtName+" got "+per+" firstclass");
		}
		else if(per<60 && per>=55)
		{
			System.out.println(studtName+"got "+per+" secondclass");
		}
		else if(per<55 && per>=40)
		{
			System.out.println(studtName+"got "+per+" Thirdclass");
		}
		else
		{
			System.out.println(studtName+"got  "+per+" fail");
		}
		
	}
	void max()
	{
		System.out.println("Enter the n1:");
		n1=Sc.nextInt();
		System.out.println("Enter the n2:");
		n2=Sc.nextInt();
	    System.out.println("Enter the n3:");
	    n3=Sc.nextInt();
	    if(n1>n2 && n1>n3)
	    {
	    	System.out.println("n1 = "+n1+" is greater");
	    }
	    else if(n2>n1 && n2>n3)
	    {
	    	System.out.println("n2 ="+n2+" is greater");
	    }
	    else
	    {
	    	System.out.println("n3 ="+n3+" is greater");
	    }
	}
	void min()
	{
		System.out.println("Enter the n1:");
		System.out.println("Enter the n2:");
		System.out.println("Enter the n3:");
		if(n1<n2)
		{
			if(n1<n3)
			{
				System.out.println("n1 ="+n1+" is a smaller");
			}
			else
			{
				System.out.println("n3 ="+n3+" is a smaller");
			}
		}
		else if(n2<n1)
		{
			if(n2<n3)
			{
				System.out.println("n2 ="+n2+" is a smaller");
			}
			else
			{
				System.out.println("n3 ="+n3+" is a smaller");
			}
		}
		else if(n3>n1)
		{
			if(n3>n2)
			{
				System.out.println("n3 ="+n3+" is a smaller");
			}
			else
			{
				System.out.println("n2 ="+n2+" is a smaller");
			}
		}
	}
	
	public static void main(String[] args) {
		ifdemo demo=new ifdemo();
		demo.ifstmt();
		demo.evenodd();
		demo.leapyear();
		demo.ifelseladderDeno();
		demo.max();
		demo.min();
		
	}

}
