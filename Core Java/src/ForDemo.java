
public class ForDemo {
	
	void table(int n)
	{
		
		for(int i=10;i>0;i--)
		{
		System.out.println(n + " * " + i + " = " + n*i); 
		}
	}
public static void main(String[] args) {
	ForDemo a = new ForDemo();
	a.table(8);
	a.table(6);
	a.table(3);
	a.table(5);
}
}
