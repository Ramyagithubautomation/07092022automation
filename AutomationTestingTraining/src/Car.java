
public class Car {

	public int no_of_wheels=4;
	
	public static void speed()
	{
		System.out.println("the car speed lies between 0-200");
		 
	}
	
    public static Object engine()
	{
		System.out.println("this is car class engine method");
		return "random";
	}
	
	public static void main(String []args)
	{
		Car car=new Car();
		
		speed();
		
		
	}

}
