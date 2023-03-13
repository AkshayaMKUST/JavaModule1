package ioserialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileToConsole {

	public static void main(String[] args) throws IOException {
		FileReader fw = new FileReader("D:\\ustcore\\ioserialization\\src\\ioserialization\\KeyboardToFile.java");
		BufferedReader b = new BufferedReader(fw);

		String data = b.readLine();
		while (data != null) {
			System.out.println(data);
			data=b.readLine();
		}
	}

}
