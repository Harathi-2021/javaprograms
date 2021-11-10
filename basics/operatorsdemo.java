package basics;

public class operatorsdemo
{
	int n1=10,n2=20,ans;
	void add()
	{
		System.out.println("n1 ="+n1);
		System.out.println("n2 ="+n2);
		System.out.println("sum ="+(ans=n1+n2));
	}
	void sub()
	{
		System.out.println("sub ="+(ans=n1-n2));
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

	public static void main(String[] args) {
		operatorsdemo od=new operatorsdemo();
		od.add();
		od.sub();
		od.mul();
		od.div();
		od.modulus();
	}

}
