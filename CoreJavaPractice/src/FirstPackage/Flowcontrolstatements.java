package FirstPackage;

public class Flowcontrolstatements {

	public static void main(String[] args) {

		
		//System.out.println(tax(20000));
		//forloop();
		whileloop();
		//switchdemo();
		
		
		
	}
	
	
	public static int tax(int salary)
	{
		int taxpercentage=0;
		
		if(salary>0 && salary<10000)
		{
			taxpercentage=5;
			
		}
		
		else
		{
			taxpercentage=10;
		}
		
		return taxpercentage;
	}
	
	public static void switchdemo()
	{
		char c=1;
		switch('a')
		{
		case 'a': System.out.println("we are in case a");
			
		case 1: System.out.println("we are in case b");
			
	    //default: System.out.println("this is default case");
				
		
		
		
		}
		
		
		
		
		
		
	}
	
	
	public static void forloop() {
		
		int[] studentrollnoarray=new int[100];
		
		for(int i=1;i<studentrollnoarray.length;i++)  //i->1 ->2 
		{
			
			if(i==10)
			{
			break;
			}
			
			
			studentrollnoarray[i]=i;
			System.out.println(studentrollnoarray[i]);

		}
		
		
		
	}
	
	
  public static void whileloop() {
		
		int[] studentrollnoarray=new int[100];
		int i=1;
		while(i<studentrollnoarray.length)  //i->1 ->2 
		{
			if(i>=90 && i<=99)
			{
			  continue;
			}
			studentrollnoarray[i]=i;
			System.out.println(studentrollnoarray[i]);	
			i++;
			
		}
		
		do
		{
			
			
			
			
		}while(i<10);
		
		
		
	}
	

}
