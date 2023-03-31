package Strings;

import java.util.Scanner;

public class StringQues {

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input : ");
		int a=sc.nextInt();
		String s=sc.nextLine();
		String c=s.substring(0, 1).toUpperCase();
		String d=s.substring(1);
		
		for(int i=0;i<d.length();i++)
		{
			if(d.charAt(i)==' ')
			{
				c+=" "+d.substring(i+1,i+2).toUpperCase();
				i++;
			}	
			else if(d.charAt(i)!=' ') 
			{
				c=c+d.charAt(i);
			}
		}
		System.out.println(c);
	}
}
