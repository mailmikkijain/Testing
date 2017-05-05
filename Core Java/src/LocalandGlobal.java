
public class LocalandGlobal {
	String s;//global string
	int age = 16;
	void show()
	{
		s = "swasti";
		String name = "chops";//laocal string
		System.out.println(s.length());
	}
	void display()
	{
		System.out.println(s);
	}
public static void main(String[] args)
{
	LocalandGlobal lg = new LocalandGlobal();
	lg.show();
	lg.display();
}
}
