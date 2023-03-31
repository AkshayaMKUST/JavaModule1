package listdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitQues {
	
	public static void main(String[] args) {
		
		SplitQues s=new SplitQues();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount : ");
		int n=sc.nextInt();
		System.out.println("Enter the number of persons to split with : ");
		int p=sc.nextInt();
		ArrayList person[]=new ArrayList[p];
		s.split(n);
		
		
		
	}

	private static void split(int n) {
//		for(int i=0;i<p;i++) {
//			int moneyforeach=sc.nextInt();
//			person.add(moneyforeach);
		
		
	}
	
}
