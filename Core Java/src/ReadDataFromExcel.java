import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ReadDataFromExcel {
	
	FileInputStream fis;
	Workbook wb;
	Sheet ws;
	FileOutputStream fos;
	WritableWorkbook wwb;
	WritableSheet wws;
	Label lb;
	
	public ReadDataFromExcel() throws Exception {
		
		fis=new FileInputStream("Data.xls");
		wb=Workbook.getWorkbook(fis);
		ws=wb.getSheet("Sheet1");
		System.out.println(ws.getCell(0, 0).getContents());
				
	}
	
	void WriteDataToExcel() throws Exception{
		
		
		fos=new FileOutputStream("Data1.xls");
		wwb=Workbook.createWorkbook(fos);
		wws=wwb.createSheet("Output", 0);
		lb=new Label(0, 2, "WritableData");
		wws.addCell(lb);
		wwb.write();
		wwb.close();
							
	}
	public static void main(String[] args) throws Exception {
		
		ReadDataFromExcel r=new ReadDataFromExcel();
		r.WriteDataToExcel();
	}

}
