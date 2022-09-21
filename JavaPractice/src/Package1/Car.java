package Package1;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Car car=new Swift(); //overriding
		car.engine();
	}
	
	
	public Childclass engine()
	{
		System.out.println("this is car class engine method");
		return null;
	}

}
