package constructorPractic;

public class Department {

	private Employee emp;

	public void departmentInfo() {

		System.out.println("this is the finanace department where all the comany financial being calculated");

		emp.workEnvoirment();
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

}
