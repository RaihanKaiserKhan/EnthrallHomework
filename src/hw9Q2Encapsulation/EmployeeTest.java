package hw9Q2Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Raihan");
		employee.setAge(31);
		employee.setSex('M');
		employee.setUsCitizen(true);
		System.out.println("Employee Name: " + employee.getName() + "\nAge: " + employee.getAge() + "\nSex: "
				+ employee.getSex() + "\nUSA Citizen: " + employee.isUsCitizen());
	}
}
