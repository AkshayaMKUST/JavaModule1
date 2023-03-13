package Strings;

public class TestString {

	public static void main(String[] args) {

		byte bytes[] = { 65, 66, 67, 68 };
		String str = new String(bytes);
		/*
		 * System.out.println(str.length()); System.out.println(str); str =
		 * "Welcome to UST"; bytes = str.getBytes(); for (byte b : bytes) {
		 * 
		 * System.out.println(b);
		 * 
		 * }
		 */
		/*
		 * char chars[] = { 'U', 'S', 'T', ' ', 'G' }; str = new String(chars);
		 * System.out.println(str); str.getChars(0, chars.length - 1, chars, 0); for
		 * (char c : chars) { System.out.println(c); }
		 */

		/*
		 * str=new String("She sells sea shells in a sea shore"); int count=0; for(int
		 * i=0;i<str.length();i++) { char c=str.charAt(i); if(c=='s'|c=='S') count++; }
		 * System.out.println("Count of s = "+count);
		 */

		str = new String("She sells sea.shells in sea shore");
		String words[] = str.split("[.]");
		System.out.println(words.length);
		for (String word : words) {
			System.out.println(word);
		}

		str = new String("cartoon");
		System.out.println(str.startsWith("car"));
		System.out.println(str.endsWith("on"));
		
		int apos=str.indexOf('a');
		int tpos=str.indexOf('t');
		
		String str2=str.substring(apos,tpos+1);//art
		str2=str.substring(tpos);//toon
		System.out.println(str2);
		
		str=new String("madamdam");
		int dpos=str.lastIndexOf('d');
		str2=str.substring(dpos,str.length());
		System.out.println(str2);
		
		String email= new String("akshaya.m.k@ust.com");
		int last=email.lastIndexOf('.');
		int last2=email.lastIndexOf('m');
		String res=email.substring(last, last2+1); //com
		System.out.println(res);
		
		String s1=new String("welcome");
		String s2=new String("WELCOME");
		boolean result=s1.equals(s2);
		System.out.println(result); //false
		
		s1=new String("welcome");
		s2=new String("welcome");
		result=s1.equals(s2);
		System.out.println(result); //true
		
		s1=new String("welcome");
		s2=new String("WELCOME");
		result=s1.equalsIgnoreCase(s2);
		System.out.println(result); //true
		
		int val=s2.compareTo(s1);
		System.out.println(val); //-32
		
		s2="heY HOW are YOU";
		System.out.println(s2.toLowerCase());
		System.out.println(s2);
		System.out.println(s2.toUpperCase());
		System.out.println(s2);
		
		
		
		String reg="16-11-477/6/A/3 Hyderabad 500036";
		int a=0,d=0,s=0,o=0,l=0,u=0;
		for(int i=0;i<reg.length();i++)
		{
			if(Character.isLetter(reg.charAt(i)))
			{
				a++;
			}
			else if(Character.isDigit(reg.charAt(i)))
			{
				d++;
			}
			else if(Character.isWhitespace(reg.charAt(i)))
			{
				s++;
			}
			else
				o++;
			
			if(Character.isLowerCase(reg.charAt(i)))
			{
				l++;
			}
			if(Character.isUpperCase(reg.charAt(i)))
			{
				u++;
			}
		
		}
		System.out.println("Number of letters = "+a);
		System.out.println("Number of digits = "+d);
		System.out.println("Number of white spaces = "+s);
		System.out.println("Number of special characters / - = "+o);
		System.out.println("Number of lower case letters = "+l);
		System.out.println("Number of upper case letters = "+u);
		
		
		
	}

}
