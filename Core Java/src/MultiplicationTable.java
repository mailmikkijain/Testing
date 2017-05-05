
public class MultiplicationTable

{
	
	public MultiplicationTable(int n) {

		for (int i = 0; i < 11; i++) {
			
			System.out.println(n +" * "+ i + " = "+ n*i );
			
		}
	}
	
	
	
public static void main(String[] args) {
	
	MultiplicationTable table=new MultiplicationTable(11);
	System.out.println("********************************************");
	MultiplicationTable table1=new MultiplicationTable(19);

}
}
