package basics;

import java.util.Scanner;

public class Arithmeticdemo 
{
	int n1,n2,ans;
	double pi=3.14,r,c;
	int l,b,S;
	Scanner Sc=new Scanner(System.in);
	public void add()
	{
		System.out.println("Enter the n1:");
		n1=Sc.nextInt();
		System.out.println("Enter the n2:");
		n2=Sc.nextInt();
		System.out.println("n1 ="+n1);
		System.out.println("n2 ="+n2);
		System.out.println("sum ="+(ans=n1+n2));
	}
	void sub()
	{
		int a,b,c;
		System.out.println("Enter the a:");
		a=Sc.nextInt();
		System.out.println("Enter the b:");
		b=Sc.nextInt();
		c=a-b;
		System.out.println("subtraction ="+c);
	}
	void mul()
	{
		System.out.println("multiplication ="+(ans=n1*n2));
	}
	void div()
	{
		System.out.println("division ="+(ans=n1/n2));
	}
	void modulus()
	{
		System.out.println("modulus ="+(ans=n1%n2));
	}
	void cube()
	{
		System.out.println("cube ="+(n1*n1*n1));
		System.out.println("square ="+(n1*n1));
	}
	void cir()
	{
		System.out.println("Enter the radius=");
		r=Sc.nextDouble();
		System.out.println("Area of circle ="+(pi*r*r));
		System.out.println("Perimeter of circle ="+(2*pi*2));
	}
	void area()
	{
		System.out.println("Enter l:");
		System.out.println("Enter b:");
		b=Sc.nextInt();
		System.out.println("Area of rectangle ="+(l*b));
		System.out.println("Area of trianglr ="+(0.5*l*b));
		System.out.println("Enter S=");
		S=Sc.nextInt();
	}

	public static void main(String[] args) {
		Arithmeticdemo ad=new Arithmeticdemo();
		ad.add();
		ad.sub();
		ad.mul();
		ad.div();
		ad.modulus();
		ad.cube();
		ad.cir();
		ad.area();
	}

}
