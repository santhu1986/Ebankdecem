package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		//Instance Class
		
		Library LB=new Library();
		
		LB.OpenApp("http://122.175.8.158/ranford2");
		LB.Admlgn("Admin","Te$ting@");
		
		//To get Test Data File
		
		FileInputStream Fis=new FileInputStream("E:\\MrngNovSel\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
		//Work Book
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//Sheets
		
		XSSFSheet WS=WB.getSheet("Rdata");
		
		//Row Count
		
		int Rcount=WS.getLastRowNum();
		System.out.println(Rcount);
		
		//Multiple Iterations
		
		for (int i=1;i<=Rcount;i++) 
		{
		   
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
			//Cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			
			XSSFCell WC2=WR.createCell(2);
			
			//Cell Values
			
			String Rname=WC.getStringCellValue();
			String Rty=WC1.getStringCellValue();
			
			String Res=LB.Role(Rname,Rty);
			System.out.println(Res);
			
			WC2.setCellValue(Res);
			
		}
		
		//Resuts

		FileOutputStream Fos=new FileOutputStream("E:\\MrngNovSel\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
		WB.write(Fos);
		WB.close();
		
			
		}
		
		}

