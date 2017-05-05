
public class Thistest {
	int a1,a2,a3;
	void simple()
	{
		System.out.println("this is simple method.");
	}
	Thistest()
	{
		//this("mikki");
		this(10,10,10);
		//contructor calling must be the first statement in a constructor so 2 constructor can not be called in a constructor.
	System.out.println("this is simple constructor");
	//this.simple();
	this.a1=2;
	this.a2=2;
	this.a3=2;
	System.out.println("total value=  " +  this.a1*this.a2*this.a3);
	}
	Thistest(int a,int b,int c)
	{
	    this.a1=a;
		this.a2=b;
		this.a3=c;
		//System.out.println(a*b*c);
		System.out.println("total value=  " +  this.a1*this.a2*this.a3);
		
	}
	 public Thistest(String s)
	 {
		this.simple();
		System.out.println("mame is:= "+ s);
	}
	public static void main(String[] args)
	{
		Thistest t=new Thistest();
		Thistest t1=new Thistest(5,5,5);
		System.out.println(t.a1);
		System.out.println(t1.a1);
		Thistest t3=new Thistest("mikki");
		//t.simple();
	}//end of main

}//end of class.

