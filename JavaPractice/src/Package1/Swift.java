package Package1;

public class Swift extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Swift swift=new Swift();
		swift.engine();
		
		Car car=new Swift(); //overriding
		car.engine();
		
		
	}
	
	public Childclass engine()
	{
		System.out.println("this is swift class engine method");
		return null;
	}

}
