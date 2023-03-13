package oopsday4.inheritance;

public class CompanyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Emp1=new Employee("John Doe","Male",24,101,"Research",50000);
		System.out.println(Emp1);
		
		Employee Emp2=new Employee("James Doe","Male",24,102,"Sales",70000);
		System.out.println(Emp2);
		
		Employee Emp3=new Employee("Jenny Doe","Female",23,105,"Accounting",90000);
		System.out.println(Emp3);
		
		Employee Emp4=new Employee("Jim Doe","Male",26,106,"Research",50000);
		System.out.println(Emp4);
		
		Employee Emp5=new Employee("John Doe","Male",24,101,"Research",50000);
		System.out.println(Emp5);
		
		if(Emp1.equals(Emp5)) {
			System.out.println("The objects are same");
		}
		else
			System.out.println("The objects are not same");
	}

}
