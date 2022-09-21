package Package1;

public class Arrays {

	public static void main(String[] args) {
           
		//Single Dimensional array
		int[] array= {1,2,3,4,5};
		String[] cities= {"Hyderabad","chennai","Mumbai"};
		
		//customized array
		int[] array1= new int[10];
		
		//if you try to put more objects(>length of array) into an array -> it throws array index
		//out of bound exception
		//index of the array strts from 0
		//array1[0]=12;
		//array1[1]=13;
		//array1[10]=20;
		//System.out.println(array1[0] + "and" + array1[1] + "and" + array1[10]);
		int count=0;
		//initillizing the dynamic array
		for(int i=0;i<array1.length;i++)
		{
			
			
			array1[i]=count;
			count++;
			
		}
		
		//accessing the elements inside the array
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
		
		
		//2 dimesional arrays
		
		//static initialization
		int[][] twodimarray= {{1,2,3},{2,3,5}};
		//dynamic initialization
		int[][] twodimarray1=new int[2][3];
		int count1=0;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				twodimarray1[i][j]=count1;
				count1++;
			}
		}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(twodimarray1[i][j]);			}
		}
		}

}
