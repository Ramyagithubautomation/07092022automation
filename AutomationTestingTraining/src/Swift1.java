
public class Swift1 extends Car1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car1 car=new Car1();
		car.engine();
		car.seatbelt();
		
		
		
		
		Swift1 swift1=new Swift1();
		swift1.engine();
		swift1.seatbelt();
		
		
		
		
		Car1 car2=new Swift1(); //run time poly or overriding
		car2.engine();//overriding
		car2.seatbelt();
		//car2.autodriving();
		
		
	}
	
	
	public Throwable engine() //overriding method
	{
		System.out.println("This is swift class engine method");
		return null;
	}
	
	public void autodriving()
	{
		System.out.println("this is autodriving method");
	}

}
