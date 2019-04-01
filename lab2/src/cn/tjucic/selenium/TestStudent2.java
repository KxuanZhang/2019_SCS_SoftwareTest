package cn.tjucic.selenium;


import java.util.regex.Pattern;
import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


@RunWith(Parameterized.class)

public class TestStudent2 {
	
	  private static WebDriver driver;
	  private static String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  public static  ArrayList<Student> allStu = new ArrayList<Student> ();
	  public static int len = 0;
	  private String nameTrue ;
	  private String gitUrlTrue;
	  private String nameWeb;
	  private String gitUrlWeb;
	  
	  public TestStudent2(String nameTrue,String nameWeb, String gitUrlTrue,String gitUrlWeb)
	  {
		  this.nameTrue = nameTrue;
		  this.gitUrlTrue = gitUrlTrue;
		  this.nameWeb = nameWeb;
		  this.gitUrlWeb = gitUrlWeb;
	  }
	  

	  @BeforeClass
	  public static void setup()
	  {

	  }
	  
	 @Parameters
	 public static Collection<Object[]>getData()
		{
		 Object [] [] arr = null ;
		 try {
		 //创建输入流
	        FileInputStream fis = new FileInputStream(new File("result.xlsx"));
	        //由输入流得到工作簿
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        //得到工作表
	        XSSFSheet sheet = workbook.getSheetAt(0);
	        //得到行,0表示第一行
	        XSSFRow row = sheet.getRow(1);
	        //创建单元格行号由row确定,列号作为参数传递给createCell;第一列从0开始计算
	        
	        //给单元格赋值
	        
			 arr = new Object[sheet.getPhysicalNumberOfRows()-1][];
			 
	        for ( int j = 1 ; j< sheet.getPhysicalNumberOfRows() ; j++)
	        {	int i = j - 1;
	        	arr[i] = new Object [4];
	        	row = sheet.getRow(j);
	        	XSSFCell cell0 = row.getCell(0);
	        	XSSFCell cell1 = row.getCell(1);
	        	XSSFCell cell2 = row.getCell(2);
	        	XSSFCell cell3 = row.getCell(3);
	        	if (cell0 != null)
		        {
		        	cell0.setCellType(CellType.STRING);
		        	arr[i][0] = cell0.getStringCellValue();
		        	
		        }
		        if (cell1 != null)
			        {
			        	cell1.setCellType(CellType.STRING);
			        	arr[i][1] = cell1.getStringCellValue();
			        	
			        }
		        if (cell2 != null)
		        {
		        	cell2.setCellType(CellType.STRING);
		        	arr[i][2] = cell2.getStringCellValue();
		        }
		        if (cell3 != null)
		        {
		        	cell3.setCellType(CellType.STRING);
		        	arr[i][3] = cell3.getStringCellValue();
		        }
		        
	        }
	        
		 
		  workbook.close();
	        fis.close();
	        
		 }
		 catch (Exception e)
		 {
			 e.printStackTrace();
		 }
		 return Arrays.asList(arr);
		 

		}
	 
	 
	
	  
	@Test
	  public  void test()
	  {
//		System.out.println(this.nameTrue.equals(this.nameWeb ) );
		System.out.println(this.nameTrue + this.gitUrlTrue.equals(this.gitUrlWeb ) );

		 assertEquals(this.nameTrue , this.nameWeb);
		  assertEquals(this.gitUrlTrue, this.gitUrlWeb);

	  }
	  
	
	

}
