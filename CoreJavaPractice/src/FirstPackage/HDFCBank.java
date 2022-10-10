package FirstPackage;

public class HDFCBank extends RBIBank {

	public static void main(String[] args) {

		HDFCBank hdfc=new HDFCBank();
		//hdfc.hdfcmethod();
		
		//hdfc.secureinfo(); //not possible as method is private one
		
		hdfc.minimumloan();   //overriding
		
		hdfc.rules();
		
	//	HDFCBank hdfc1=new RBIBank();  // this scenario is not possible(child class object
		                               //reference can't create parent class object
		
		RBIBank rbi=new HDFCBank();   //overriding
		
		rbi.minimumloan();  //overriding
		
		//rbi.hdfcmethod(); //this is not possible scenario (parent class object reference
		                    //can't access method which is defined only only on child class
		
		
		RBIBank rbi1=new RBIBank();
		rbi1.minimumloan();
		
		
		
	}
	
	public void hdfcmethod()
	{
		System.out.println("this is hdfc method");
	}
	
	
	public RBIBank minimumloan()   //overriding method
	{
	   System.out.println("this is hdfc bank minimun loan and it is configured as 15000");
	   return null;
		
	}

}
