
public class Overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading1 load=new Overloading1();
		
		load.sum(); //compile time polymorphysim or method overloading or static binding
		load.sum(4);
		load.sum(7, 10);
		
		
		
		
	}
	
	
	private int sum()
	{
		int a=2;
		int b=3;
		System.out.println(a+b);
		return a+b;
	}
	
	public void sum(int a)
	{
		int b=5;
		System.out.println(a+b);
	}
	
	public void sum(float a)
	{
		
	}
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void sum(float b,int a)
	{
		
	}

}
