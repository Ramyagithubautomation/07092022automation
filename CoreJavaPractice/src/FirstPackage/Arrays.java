package FirstPackage;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {

		/*int[] array= {1,2,3,4,5,6,7,8,9,100};   //static initialization
		
		String[] names= {"ramya","Meghana"};
		
		int[] dynamicarray=new int[100]; //dynamic initialization
		
		int array1[]= {3,4,5};
		
		/*dynamicarray[0]=100;
		dynamicarray[1]=13;
		dynamicarray[2]=14;
		dynamicarray[3]=15;
		dynamicarray[4]=16;
		//dynamicarray[5]=17; //throws arrayindexoutofboundexception
		//dynamicarray[100]=16;
		
		Random random=new Random();
		
		for(int i=0;i<dynamicarray.length;i++)
		{
			
			dynamicarray[i]=random.nextInt(0,99);
		}

		
	   for(int i=0;i<dynamicarray.length;i++)  //i->0 ->1 ->2 ->3 ->4->5
	   {
		   System.out.println(dynamicarray[i]);   
	   }	*/
	   
		twodimarray();
		
	}
	
	
	public static void twodimarray()
	{
		
		int [][] array= {{1,2},{4,5,6},{7,8,9}};
		
		int [][] array1=new int[2][2];
		
        Random random=new Random();
		
		for(int i=0;i<2;i++)  //i->0 ->1
		{
			for(int j=0;j<2;j++)  //j->0 ->1   //j->0
			{
			
			array1[i][j]=random.nextInt(0,99);  //arrayi[1][0]=34
			System.out.println(array1[i][j]);
			}
		}
		
		
		
	}

}
