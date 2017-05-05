
	import java.io.FileInputStream;
	import java.io.FileOutputStream;

	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.write.Label;
	import jxl.write.WritableSheet;
	import jxl.write.WritableWorkbook;

	public class DataTesting {
		
		FileInputStream fis;
		Workbook wb;
		Sheet ws;
		FileOutputStream fos;
		WritableWorkbook wwb;
		WritableSheet wws;
		Label lb;
		static String value;
		public  DataTesting(int r,int c,String s) throws Exception 
		{
		
			fis=new FileInputStream("src/Data.xls");
			wb=Workbook.getWorkbook(fis);
			ws=wb.getSheet(s);
			value=ws.getCell(r, c).getContents();
		 System.out.println(value);
					
		}
		void WriteData(int r,int c,String value) throws Exception
		{
			
			fos=new FileOutputStream("src/Data1.xls");
			wwb=Workbook.createWorkbook(fos);
			wws=wwb.createSheet("Output", 0);
			lb=new Label(r, c, value);
			wws.addCell(lb);
			wwb.write();
			wwb.close();
								
		}
		public static void main(String[] args) throws Exception {
			
			DataTesting r=new DataTesting(1,2,"Sheet1");
			
			r.WriteData(5,3,value);
		}//end of main


}//end of class
