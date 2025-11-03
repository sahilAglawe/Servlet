package kapilIt;

public class Employee {

	int empId;
	String empName;
	int age, salary;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, int age, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
