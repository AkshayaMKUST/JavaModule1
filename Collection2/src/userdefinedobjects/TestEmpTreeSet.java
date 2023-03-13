package userdefinedobjects;

import java.util.TreeSet;
import java.util.Iterator;


public class TestEmpTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Employee> empTreeset= new TreeSet<>();
		Employee Emp1=new Employee("John Doe","Male",24,101,"Research",50000);
		
		Employee Emp2=new Employee("James Doe","Male",24,102,"Sales",70000);
		
		Employee Emp3=new Employee("Jenny Doe","Female",23,105,"Accounting",90000);
		
		Employee Emp4=new Employee("Jim Doe","Male",26,106,"Research",50000);
		
		Employee Emp5=new Employee("John Doe","Male",24,101,"Research",50000);
		
		empTreeset.add(Emp1);
		empTreeset.add(Emp2);
		empTreeset.add(Emp3);
		empTreeset.add(Emp4);
		empTreeset.add(Emp5);
		
		System.out.println(empTreeset);
		System.out.println(empTreeset.size());
		
		
	}

}
