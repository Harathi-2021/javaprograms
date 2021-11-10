package basics;

import java.util.Scanner;

public class whiledemo 
{
	Scanner Sc=new Scanner(System.in);
	void reverse()
	{
		int no,rev=0,rem;
		System.out.println("Enter the no:");
		no=Sc.nextInt();
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
		
	}
	void sum()
	{
		int no,sum=0,rem;
		System.out.println("Enter the no:");
		no=Sc.nextInt();
		while(no>0)
		{
			rem=no%10;
		    sum=sum+rem;
			no=no/10;
		}
		System.out.println("sum of the digits:"+sum);
		
	}
	void Even()
	{
		int upper,lower;
		System.out.println("Enter the upperlimit: ");
		upper=Sc.nextInt();
		System.out.println("Enter the lowerlimit: ");
		lower=Sc.nextInt();
		System.out.println("Even no from "+lower+" "+upper+" : ");
		for(int i=lower;i<=upper;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	void odd()
	{
		int upper,lower;
		System.out.println("Enter the upperlimit: ");
		upper=Sc.nextInt();
		System.out.println("Enter the lowerlimit: ");
		lower=Sc.nextInt();
		System.out.println("Even no from "+lower+" "+upper+" : ");
		for(int i=lower;i<=upper;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
		
	}
	void Armstrong()
	{
		int no,sum=0,temp,rem;
		System.out.println("Enter  no:");
		no=Sc.nextInt();
		temp=no;
		while(no!=0)
		{
			rem=no%10;
		    sum=sum+rem*rem*rem;
			no=no/10;
		}
		if(temp== sum)
			System.out.println("given number is Armstrong number");
		else
			System.out.println("given number is not a Armstrong number");
			
	}
	void palindrome()
	{
		int no,rev=0,temp,rem;
		System.out.println("Enter  no:");
		no=Sc.nextInt();
		temp=no;
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(temp==rev)
			System.out.println("given number is palindrome number");
		else
			System.out.println("given number is not a palindrome number");
			
		}

	public static void main(String[] args) {
		whiledemo dr=new whiledemo();
		//dr.reverse();
		//dr.sum();
		//dr.Even();
		//dr.odd();
		dr.Armstrong();
		//dr.palindrome();
		

	}

}
