
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Overloading load=new Overloading();
        load.sum();
        load.sum(3);
        load.sum(6.0f, 7);
		
		
	}
	
	public int sum() {
		int a=1;
		int b=2;
		System.out.println(a+b);
		return a+b;
		
	}
	
	private void sum(int a)
	{
		int b=2;
		System.out.println(a+b);
	}
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sum(float b, int a)
	{
		System.out.println(a+2*b);
	}
	

}
