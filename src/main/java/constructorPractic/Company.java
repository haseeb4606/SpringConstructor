package constructorPractic;

public class Company {

	Department dept;

	public Company(Department dept) {

		super();

		this.dept = dept;

	}

	public void companyInfo() {

		System.out.println("Hello welcome to GIT company, we are here to help you with anything you needed");
		dept.departmentInfo();
	}

}
