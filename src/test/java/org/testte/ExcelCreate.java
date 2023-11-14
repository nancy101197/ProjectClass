package org.testte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreate {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\sound\\eclipse-workspace\\JunitSample\\src\\test\\resources\\A.xlsx");
		
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("Datas");
		for(int i=0;i<25;i++)
		{
		Row r = s.createRow(i);
		}
//		Cell cell = r.createCell(0);
//		cell.setCellValue("Product Name");
//		Cell c = r.createCell(1);
//		c.setCellValue("Price");
		
//		for(int i=0;i<25;i++)
//		{
//			Cell c1=r.createCell(i);
//			c1.setCellValue("APPLE iPhone 14 (Blue, 128 GB)");
//			
//		}
//		Row rr = s.createRow(1);
//		Cell ce= rr.createCell(1);
//		ce.setCellValue("APPLE iPhone 14 (Blue, 128 GB)");
//		Cell c1 = r.createCell(2);
//		c1.setCellValue("₹57,999");
		
		Map<String, Integer> mp = new TreeMap<String, Integer>(); 

         mp.put(  "APPLE iPhone 14 (Blue, 128 GB)", 57999); 
         mp.put(  "APPLE iPhone 14 (Starlight, 128 GB)", 58499); 
         mp.put(  "APPLE iPhone 14 Plus (Blue, 128 GB)", 64999); 
         mp.put(  "APPLE iPhone 14 (Midnight, 128 GB)", 58999); 
         mp.put(  "APPLE iPhone 14 Plus (Starlight, 128 GB)", 63999); 
          
         mp.put(  "APPLE iPhone 14 Plus (Midnight, 128 GB)", 64999); 
         mp.put(  "APPLE iPhone 14 Plus (Purple, 128 GB)", 64999); 
         mp.put(  "APPLE iPhone 14 (Purple, 128 GB)", 58999); 
        
         mp.put(  "APPLE iPhone 14 (Starlight, 256 GB)", 67999); 
         mp.put(  "APPLE iPhone 14 (Blue, 256 GB)", 67999); 
         mp.put(  "APPLE iPhone 14 (Midnight, 256 GB)", 68999); 
         mp.put(  "APPLE iPhone 14 (Purple, 256 GB)", 68999); 
   
         mp.put(  "APPLE iPhone 14 ((PRODUCT)RED, 128 GB)", 58999);
         mp.put(  "APPLE iPhone 14 (Midnight, 512 GB)", 88999);
         mp.put(  "APPLE iPhone 14 (Starlight, 512 GB)", 88999);
         mp.put(  "APPLE iPhone 14 ((PRODUCT)RED, 512 GB)", 88999);
    
    
         mp.put(  "APPLE iPhone 14 (Blue, 512 GB)", 88999);
         mp.put(  "APPLE iPhone 14 (Purple, 512 GB)", 88999);
         mp.put(  "APPLE iPhone 14 Pro Max (Silver, 128 GB)", 127999);
         mp.put(  "APPLE iPhone 14 Plus (Blue, 512 GB)", 94999);
         
         mp.put(  "APPLE iPhone 14 Plus (Starlight, 512 GB)", 94999);
         mp.put(  "APPLE iPhone 14 Pro (Space Black, 256 GB)", 129900);
         mp.put(  "APPLE iPhone 12 (White, 64 GB)", 39999);
         mp.put(  "APPLE iPhone 12 (Blue, 64 GB)", 39999);
        Set<String> keyid = mp.keySet(); 
        Set<Entry<String,Integer>>i=mp.entrySet();
    
         int rowid = 0; 

         

        for (String key : keyid) { 
    	Row  r = s.createRow(rowid++); 
         Integer o = mp.get(key); 
         int cellid = 0; 

         for(Entry<String, Integer> x:i) { 
        	 
             Cell c1 = r.createCell(cellid++); 
             c1.setCellValue(o); 
         } 
      
    }
		FileOutputStream fo=new FileOutputStream(f);
		w.write(fo);
		
		System.out.println("---DONE---");
		
		
		
		
	}
}
