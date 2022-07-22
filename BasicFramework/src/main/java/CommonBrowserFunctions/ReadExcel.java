package CommonBrowserFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.openqa.selenium.By;

import com.google.common.base.Verify;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel

{
	String uname;
	String password;
	String[] NameArray;
	
	int i,j;
	
	public String[] ReadfromExcel() throws Exception
	{
			FileInputStream fis=new FileInputStream("C:\\Users\\SayaliJunawane\\Desktop\\LoginDetailofcompany.xls");
			//workbook>>sheets>>cells>>content
			Workbook workbook=Workbook.getWorkbook(fis);
			Sheet sheet=workbook.getSheet(0);

			int row=sheet.getRows();
			int col=sheet.getColumns();

			
			System.out.println("row is"+row);
			System.out.println("col is"+col);
			
			String user1 = "";
			String value = null;
			for(int i=1;i<row;i++)  //row
			{
				user1 = "";
				for(int j=0;j<col;j++) //col
				{
					Cell c=sheet.getCell(j,i);	
					value=c.getContents();
					user1=user1+" "+value;
				}
	
			System.out.println(user1.trim());
			 NameArray = user1.split(" ");
			uname=NameArray[1];
			password=NameArray[2];
			System.out.println(NameArray[1]+"location is"+i);
			System.out.println(NameArray[2]+"location is"+j);
			//FullArray=NameArray;
			//System.out.println("full array is"+Arrays.toString(FullArray));
			//return NameArray;
			}
			//System.out.println("array is"+NameArray);
			return NameArray;		
	}
}
