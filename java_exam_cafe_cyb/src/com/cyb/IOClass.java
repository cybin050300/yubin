package com.cyb;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.cyb.db.CafeClass;

public class IOClass {

	public IOClass() {
	}

	public static void makeHTML(String contents) {

		contents = contents.replaceAll("\n", "<br>");

		String tags = "<!doctype html>";
		tags += "<html>";
		tags += "<head>";
		tags += " <meta charset = \"utf-\">";
		tags += " <title>test file</title>";
		tags += "</head>";

		tags += "<body>";

		tags += contents;

		tags += "</body>";
		tags += "</html>";

		FileWriter fw = null;
		try {
			fw = new FileWriter("datas/cafe_list.html");
			fw.write(tags);
			fw.close();

			// System.out.println("success to HTML file");

		} catch (IOException ioe) {
			System.out.println("IOException ERR" + ioe.getMessage());
		}
	}

	   public static ArrayList<String> ReadFile(String filename, String extension) {
		      ArrayList<String> array = new ArrayList<String>();
		      try {
		         FileInputStream fis = new FileInputStream(filename + extension);
		         InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		         BufferedReader br = new BufferedReader(isr);
		         String temp = null;
		         while ((temp = br.readLine()) != null) {
//		        	 System.out.println(temp);
		            DataClass.cafe.add(new CafeClass(temp));
		         }

		         // 사용종료된 자원해제
		         br.close();
		         isr.close();
		         fis.close();

		      } catch (FileNotFoundException e) {
		         System.err.println("FileNotFoundException");
		      } catch (IOException e) {
		         System.err.println("IOException");
		      }

		      return array;
		   }
	   
}