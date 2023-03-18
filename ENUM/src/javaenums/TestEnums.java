package javaenums;

public class TestEnums {
	
	public static void main(String[] args) {
		
		DayOfWeek today = DayOfWeek.SATURDAY;
		System.out.println("Today is "+ today.getName());
		
		switch(today) {
		case MONDAY :
			System.out.println("Work Hard");
			break;
		case TUESDAY :
			System.out.println("Work little more");
			break;
		case WEDNESDAY :
			System.out.println("Work work little more");
			break;
		case THURSDAY :
			System.out.println("Work Work more, Weekend is arrived");
			break;
		case FRIDAY :
			System.out.println("Weekend has arrived, YaY!!!");
			break;
		case SATURDAY :
			System.out.println("Enjoy morning coffee, go for shopping");
			break;
		case SUNDAY :
			System.out.println("Do all cleaning work, snoozzzze");
			break;
		}
		
	}

}


