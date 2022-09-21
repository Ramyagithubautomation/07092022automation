package Package1;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Methods method=new Methods();
      method.sum(); //method calling
      sum1(2,3); //passing the attributes while calling the method
      System.out.println(method.sum2());
      
	}
	
	//instance method //method definition
	public void sum()
	{
		
		int a=1;
		int b=2;
		System.out.println(a+b);
	}

	
	public static void sum1(int a, int b)
	{
		System.out.println(a+b);
	}
	
	
	//return type in a method
	
	public int sum2()
	{
		int a=3;
		int b=4;
		int c =a+b;
		return c;
	}
	
	
	
}
