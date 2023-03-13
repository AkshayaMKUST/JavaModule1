package source;

public class SubClass extends Parent {
	
	public SubClass() {
		//System.out.println(a); since it is private we cannot inherit
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
