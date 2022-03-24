package employee;

public class main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee myNewEmployee1	= new Employee("Joseph", 25, 1000, "Toronto");
		Employee myNewEmployee2	= new Employee("Huzefa", 26, 1400, "India");
		myNewEmployee1.raiseSalary();
		System.out.println(myNewEmployee1.salary);		
		System.out.println(myNewEmployee2.salary);
		
	}

}
