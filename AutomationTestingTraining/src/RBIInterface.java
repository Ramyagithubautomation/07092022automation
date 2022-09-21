
public interface RBIInterface {

	//requirement specification
	
	 int minloanamount=1000; //by default thos var is public, static and final
	
	public void MinNoOfCustomers();
	
	public void loanInterestRate();
	
	public static void method()
	{
		System.out.println("this is static method defined in the interface");
	}
	
	default void method1()
	{
		System.out.println("this is the default method defined in the interface");
	}
	
	
	
	
	
	
	
	
}
