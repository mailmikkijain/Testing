
public class ExceptionsDemo {
	
	
	void display() {
		
		int x=7;
		String s=new String("hello");
		
		
		try{
			System.out.println(x/0);
			System.out.println("This line must not execute");
			
		}catch(Exception e){
			
			System.out.println("Issue with x/0");
			e.printStackTrace();
			
		}finally{
			
			System.out.println("I never fail");
		}
		
	}
public static void main(String[] args) {
	
	ExceptionsDemo ex=new ExceptionsDemo();
	ex.display();
}
}
