import snippet.DebugTest2;
import snippet.Snippet;


public class DebugTest1 {
	
	
	DebugTest2 d;
	Snippet s;
	
	DebugTest1(){
		
		System.out.println("I am in DebugTest");
		d=new DebugTest2();
		s=new Snippet();
		
	}

	public static void main(String[] args) {
		DebugTest1 t1=new DebugTest1();
	}
}
