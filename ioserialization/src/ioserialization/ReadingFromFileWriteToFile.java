package ioserialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFromFileWriteToFile {
	public static void main(String[] args) throws IOException {
		
		FileReader fw = new FileReader("D:\\ustcore\\ioserialization\\src\\ioserialization\\KeyboardToFile.java");
		BufferedReader br=new BufferedReader(fw); 
		FileWriter f=new FileWriter("Copy.txt");
		String data=null;
		while((data=br.readLine())!=null) {
			f.write(data+"\n");
		}
		f.flush();
		f.close();
		fw.close();
		br.close();
	}
	

}
