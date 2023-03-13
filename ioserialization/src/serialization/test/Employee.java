package serialization.test;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empno;
	private String name;
	private double salary;
	transient private double password;

	public Employee() {
	}

	public Employee(int empno, String name, double salary, double password) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.password=password;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public double getPassword() {
		return password;
	}

	public void setPassword(double password) {
		this.password = password;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", password=" + password + "]";
	}
	

}
