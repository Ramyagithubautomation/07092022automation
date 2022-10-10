package FirstPackage;

public class methods {

	public static void main(String[] args) {

		methods methodcalling=new methods();
		
		staticmethod();
		methodcalling.instancemethod();
		taxcalc(1000);
		
	}
	
	
	public static void staticmethod()  //return type-void,int type
	{
		
		System.out.println("this is a static method");
		
	}
	
	public void instancemethod()
	{
		System.out.println("this is an instance method");
	}
	
	public static int taxcalc(int salary)  //salary is an input parameter
	{
		int tax=salary/100;
		return tax;
		
	}

}
