package employee;

/**
 * @author Shubham Saxena
 * 
 * Contains getter and Setters for the attributes
 * Contains Salary calculating functions
 */
public class Employee {
	private int id;
	private String name;
	private double monthlyBasic;
	private static  double hraPercentage = 50;
	private static  double pfPercentage = 10;
	private static  double esicPercentage = 4.75;
	private static final double medicalAllowance = 1250;
	private static final double conveyanceAllowance = 800;
	
	
	/**
	 * Getter and Setter functions
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlyBasic() {
		return monthlyBasic;
	}
	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	public static double getPfPercentage() {
		return pfPercentage;
	}
	public static void setPfPercentage(double pfPercentage) {
		Employee.pfPercentage = pfPercentage;
	}
	
		
	/**
	 * @return annualBasics
	 * calculates the annualBasic from monthlyBasic
	 */
	public double getAnnualBasic()
	{
		double annualBasic = 12 * monthlyBasic;
		return annualBasic;
	}
	
	/**
	 * @return hra
	 * Calculation of hra using hraPercentage and monthlyBasic
	 */
	public double hraCalculate()
	{
		double hra = hraPercentage * monthlyBasic /100;
		return hra;
	}
	
	/**
	 * @return getPf
	 * Calculation of pf using pfPercentage and monthlyBasic
	 */
	public double getPf()
	{
		double pf = pfPercentage * monthlyBasic /100;
		if(pf>6500)
		{
			pf = 6500;
		}
		return pf;
	}
	
	/**
	 * @return esic
	 * Calculates esic if the monthlyBasic exceed minimum limit
	 */
	public double getEsic()
	{
		double esic;
		if(monthlyBasic<=5000)
		{
			esic = esicPercentage * monthlyBasic /100;
		}
		else
		{
			esic = 0.0;
		}
		return esic;
	}
	
	/**
	 * @return profTax
	 * Calculates the profTax on the basis of monthlyGross
	 */
	public double getProfTax()
	{
		double profTax;
		double monthlyGross = getMonthlyGrossSalary();
		if(monthlyGross<=10_000)
		{
			profTax = 50;
		}
		else
			profTax = 100;
		
		return profTax;
	}
	
	/**
	 * @return monthlyGrossSalary
	 * Calls hraCalculate method for calculation
	 */
	public double getMonthlyGrossSalary()
	{
		double hra = hraCalculate();
		double monthlyGrossSalary = monthlyBasic + hra + medicalAllowance + conveyanceAllowance;
		return monthlyGrossSalary;
	}

	/**
	 * @return annualGrossSalary
	 * Calls getMonthlyGrossSalary method
	 */
	public double getAnnualGrossSalary()
	{
		double monthlyGrossSalary = getMonthlyGrossSalary();
		double annualGrossSalary = 12 * monthlyGrossSalary;
		return annualGrossSalary;
	}

	/**
	 * @return monthlydeductions
	 * Calculates monthly Deductions amount
	 */
	public double getMonthlyDeductions()
	{
		double pf = getPf();
		double esic = getEsic();
		double profTax = getProfTax();
		
		double monthlydeductions = pf + esic + profTax;
		return monthlydeductions;
	}
	
	/**
	 * @return monthlyTakeHome
	 * Calculates using getMonthlyGrossSalary() and getMonthlyDeductions()
	 */
	public double getMonthlyTakeHome()
	{
		double monthlyGrossSalary = getMonthlyGrossSalary();
		double monthlyDeductions = getMonthlyDeductions();
		
		double monthlyTakeHome = monthlyGrossSalary - monthlyDeductions;
		return monthlyTakeHome;
	}
	
	/**
	 * @return annualTakeHome
	 * Calculates using getMonthlyTakeHome() method
	 */
	public double getAnnualTakeHome()
	{
		double monthlyTakeHome = getMonthlyTakeHome();
		double annualTakeHome = 12 * monthlyTakeHome;
		return annualTakeHome;
	}

}
