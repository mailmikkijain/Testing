
public class Inheritancedemo extends Thistest{
	String s;
	int a1,b1;
	public Inheritancedemo()
	{
		super();
		//we can call the parent class contructor through super keyword in child class constructor.
		System.out.println("this is defult cons");
	}
	Inheritancedemo(String s)
	{
		this.s=s;
		System.out.println("the name of s=" + this.s);
	}
	Inheritancedemo(int a , int b)
	{
		this.a1=a;
		this.a1=b;
	}
}
