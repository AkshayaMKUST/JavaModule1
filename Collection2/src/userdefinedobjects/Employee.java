package userdefinedobjects;

import java.util.Objects;

public class Employee extends Person implements Comparable {
	
	private long empid;
	private String dept;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(String name, String gender, int age, long empid, String dept, double salary) {
		super(name, gender, age);
		this.empid=empid;
		this.dept = dept;
		this.salary = salary;
	}
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", dept=" + dept + ", salary=" + salary + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, empid, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && empid == other.empid
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public int compareTo(Object o) {
		Employee ref=null;
		if(o!=null) {
			ref=(Employee)o;
			
		}
		if(this.empid > ref.getEmpid())
			return 1; // for descending order +1
		else if(this.empid<ref.getEmpid())
			return -1; //for ascending order -1
		else
		return 0;
	}
	
	/*public boolean equals(Object obj) {
		Employee ref=null;
		if(obj!=null)
			ref=(Employee)obj;
		
		if(this.empid==ref.empid && 
				ref.getName().equals(this.getName())&& 
				ref.getDept()==this.dept)
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		int code=this.hashCode()
				* 32 *
				((int)this.empid)*
				(this.getName().length())*
				this.dept.length();
		return super.hashCode();
	}*/
	
	
}




	
	
	
	

	

