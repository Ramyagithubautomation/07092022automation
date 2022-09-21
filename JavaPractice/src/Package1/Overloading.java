package Package1;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading load=new Overloading();
		
		load.sum();
		load.sum(2, 3);
		load.sum(3, 4, 5);
		load.sum(2.0f,3);
	}
	
	
	private void sum()
	{
		int a=2;
		int b=3;
		System.out.println(a+b);
	}
	
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void sum(float b,int a)
	{
		System.out.println(a+b);
	}
	
	public void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

}
