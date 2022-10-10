package FirstPackage;

public class Taxcalculator {

	public static void main(String[] args) {

		
		
		//the concept of overloading or c-time poly
		Taxcalculator cal=new Taxcalculator();
		
		
		System.out.println(cal.taxcalc(1000));  //compile time poly or overloading
		
		
		
		
	}
	
	
	
	private int taxcalc(int salary)
	{
		int tax=salary/100;
		return tax;
	}
	
	private float taxcalc(float salary)
	{
		float tax=salary/100;
		return tax;
	}
	
	
	public int taxcalc(int salary, int pf)
	{
		int tax=(salary-pf)/100;
		return tax;
		
	}

	
}
