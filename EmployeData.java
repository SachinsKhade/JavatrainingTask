package Oops;

public class EmployeData {
	private int ssn;
	private String emplName;
	private int empAge;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeData emp = new EmployeData();
		emp.setEmplName("Tom Harry");
		emp.setEmpAge(27);
		emp.setSsn(1234567);
		System.out.println("Employee Name is :" + emp.getEmplName());
		System.out.println("Employee Age is :" + emp.getEmpAge());
		System.out.println("Employee SSN is :" + emp.getSsn());
	}
	// getter And Setter Methods

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmplName() {
		return emplName;
	}

	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
