package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Main entered");
		String data = null;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		// BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw=new FileWriter("NammadaFile.txt");//
		System.out.println("Enter a text :");
		data = br.readLine();
		while (!data.equals("quit")) {//
			//System.out.println("You have entered .. " + data);
			fw.write(data);
			data = br.readLine();
			
		}
		fw.flush();
		fw.close();
		br.close();
		System.out.println("Main exited");

	}

}
