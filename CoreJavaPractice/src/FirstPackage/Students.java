package FirstPackage;

public class Students {

	static String collageName;
	static int studentscount;
	int rollno;

	
	
	
	public static void main(String[] args) {
       
		Students Meghana=new Students(); //local ref variable
		Meghana.collageName="bvrit";
		System.out.println(Students.collageName);
		//System.out.println(studentscount);
		Meghana.rollno=1;
		System.out.println(Meghana.rollno);
		
		Students Swapna=new Students(); 
		System.out.println(collageName);
		//Swapna.rollno=2;
		System.out.println(Swapna.rollno);
		
	}
	
	public void localMethod()
	{
		int age=35; //local primitive variable
		System.out.println(age);
		
	}

}
