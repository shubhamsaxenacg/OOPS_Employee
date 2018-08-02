package employee;
import java.util.Scanner;

/**
 * @author Shubham Saxena
 * 
 * Dashboard class creates object of Employee class 
 * The methods in this class gets input in param of called methods of Employee class
 */
public class Dashboard {
	
	Employee employee = new Employee();
	Scanner scanner = new Scanner(System.in);
	
	int id;
	String name;
	double monthlyBasic;
	
	/**
	 * Calls different functions to get values from user and calculate
	 */
	public void gui() {
		getEmployeeId();
		getEmployeeName();
		getMonthlySalary();
		calculateAmount();
	
		scanner.close();		
	}

	/**
	 * Input from user
	 * Pass value as param in setId method of Employee class
	 */
	private void getEmployeeId() {
		System.out.println("Enter employee ID:  ");
		id = scanner.nextInt();
		employee.setId(id);
	}
	
	/**
	 * Input from user
	 * Pass value as param in setId method of Employee class
	 */
	private void getEmployeeName() {
		System.out.println("Enter name:  ");
		name = scanner.next();
		employee.setName(name);
	}
	
	/**
	 * Input from user
	 * Pass value as param in setId method of Employee class
	 */
	private void getMonthlySalary() {
		System.out.println("Enter monthly Salary:  ");
		monthlyBasic = scanner.nextDouble();
		employee.setMonthlyBasic(monthlyBasic);
	}

	/**
	 * Calls function which do salary calculations 
	 */
	private void calculateAmount() {
		getAnnualBasic();
		getMonthlyGrossSalary();
		getAnnualGrossSalary();
		getMonthlyDeduction();
		getMonthlyTakeHome();
		getAnnualTakeHome();
	}

	
	/**
	 * Calls method from Employee class 
	 * Prints Annual basic Salary
	 */
	private void getAnnualBasic() {
		double annualBasic = employee.getAnnualBasic();
		System.out.println("Annual basic Salary: "+annualBasic);
	}
	
	/**
	 * Calls method from Employee class 
	 * Prints Monthly gross Salary
	 */
	private void getMonthlyGrossSalary() {
		double monthlyGrossSalary = employee.getMonthlyGrossSalary();
		System.out.println("Monthly gross Salary: "+monthlyGrossSalary);
	}

	/**
	 * Calls method from Employee class 
	 * Prints Annual Gross Salary
	 */
	private void getAnnualGrossSalary() {
		double annualGrossSalary = employee.getAnnualGrossSalary();
		System.out.println("Annual gross Salary: "+annualGrossSalary);
	}
	
	/**
	 * Calls method from Employee class 
	 * Prints Monthly Deduction amount
	 */
	private void getMonthlyDeduction() {
		double monthlyDeduction = employee.getMonthlyDeductions();
		System.out.println("Monthly deduction: "+monthlyDeduction);
	}

	/**
	 * Calls method from Employee class 
	 * Prints Monthly TakeHome Salary
	 */
	private void getMonthlyTakeHome() {
		double monthlyTakeHome = employee.getMonthlyTakeHome();
		System.out.println("Monthly TakeHome: "+monthlyTakeHome);
	}

	/**
	 * Calls method from Employee class 
	 * Prints Annual TakeHome Salary
	 */
	private void getAnnualTakeHome() {
		double annualTakeHome = employee.getAnnualTakeHome();
		System.out.println("Annual TakeHome: "+annualTakeHome);	
	}

}
