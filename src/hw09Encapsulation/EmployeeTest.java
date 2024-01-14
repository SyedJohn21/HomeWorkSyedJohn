package hw09Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("John");
		employee.setAge(34);
		employee.setSex('M');
		employee.setCitizen(false);

		System.out.println("Employee Name: " + employee.getName() + "\nEmployee Age: " + employee.getAge()
				+ "\nEmployee Sex: " + employee.getSex() + "\nEmployee Citizen: " + employee.isCitizen());

	}

}
