
public class Variables {
	
	
	public static String collegename="vnr";//stored in method area
	
	int rollno; //instance variable -> heap memory area

	public static void main(String[] args) {
		
		int value1=1;  //primitive variable //stack memory
		System.out.println(value1);
		Variables Suresh=new Variables(); //reference variable
		System.out.println(collegename);
		//Suresh.rollno=1;
		System.out.println(Suresh.rollno);
		
		Variables Naresh=new Variables();
		
		System.out.println(collegename);
		Naresh.rollno=2;
		System.out.println(Naresh.rollno);

	}
	
	
	public void method()
	{
		System.out.println(collegename);
		System.out.println(rollno);
	}

}
