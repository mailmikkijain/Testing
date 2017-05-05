import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
	
	FileInputStream fis;
	FileOutputStream fos;
	Properties p;
	
	void readDataFromProperties() throws Exception{
	
		fis=new FileInputStream("data.properties");
		p=new Properties();
		p.load(fis);
		System.out.println(p.getProperty("url"));
		
				
	}

	void createNewPropFile() throws Exception{
		fos=new FileOutputStream("data1.properties");
		p.setProperty("address", "12344jxisuh");
		p.store(fos, null);
	fos.close();
	
		
	}
	
	public static void main(String[] args) throws Exception {
	PropertiesDemo p1=new PropertiesDemo();
	p1.readDataFromProperties();
	p1.createNewPropFile();
}
}
