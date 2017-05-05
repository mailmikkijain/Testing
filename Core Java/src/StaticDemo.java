
public class StaticDemo {
	
	/*  static is a keyword in java applied to variables and methods
	 * 
	 *  static method accept only static variables
	 *  static members can be called directly without object
	 */

	
	static String name="John Smith";
	int age=20;
	
	static void staticMethod(){
		
		System.out.println(name);
	}
	
	void nonStaticMethod(){
		
		System.out.println("Name is :"+ name + "age is: "+ age);
	}
	
	public static void main(String[] args) {
		
		StaticDemo st=new StaticDemo();
		staticMethod();
		st.nonStaticMethod();
				
		
	}
}
