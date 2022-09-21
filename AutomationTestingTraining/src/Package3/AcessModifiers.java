package Package3;

public class AcessModifiers {

	public int number=12;
	protected int number1=13;
	static int number3=14;
	private int number4=12;
	
	static final int number5=20;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final int number6=30;
		method();
		AcessModifiers modify=new AcessModifiers();
		modify.method1();


		//number5=21;
	}
	
	public static final void method()
	{
		
		System.out.println("this is a static method");
		
	}
	
	public void method1()
	{
		System.out.println("this is an instance method");
	}

}
