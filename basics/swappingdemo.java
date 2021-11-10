package basics;

import java.util.Scanner;

public class swappingdemo 
{
	int n1,n2,temp=0;
	Scanner Sc=new Scanner(System.in);
	void swap()
	{
		System.out.println("Enter the n1:");
		n1=Sc.nextInt();
		System.out.println("Enter the n2:");
		n2=Sc.nextInt();
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("swapping by using third variable");
		System.out.println("n1 ="+n1);
		System.out.println("n2 ="+n2);
	}
	void swap1(int n1,int n2)
	{
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("swapping without using third variable");
		System.out.println("n1 ="+n1);
		System.out.println("n2 ="+n2);
	}
	public static void main(String[] args) {
		swappingdemo sd=new swappingdemo();
		sd.swap();
		sd.swap1(10,20);

	}

}
