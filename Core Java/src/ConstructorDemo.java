
public class ConstructorDemo {
	String s;
	//name of the cons is the same as class name.
	//constructor does not support return type
	//constructor call itself at run time.
	void shop(){
		System.out.println("I am not a constructor");
	}
	
	public ConstructorDemo() {
		
		this("swasti");
		shop();
		System.out.println("this is a constuctor.");
		// TODO Auto-generated constructor stub
	}
	ConstructorDemo(String s){
		
		this.s=s;
		System.out.println("the name is:" + this.s);
		
	}
public static void main(String[] args) {
	ConstructorDemo demo=new ConstructorDemo();
	//ConstructorDemo demo1=new ConstructorDemo();
	
	
}
}
