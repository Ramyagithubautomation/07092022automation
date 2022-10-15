package FirstPackage;

public class MergeArrays {

	public static void main(String[] args) {

		int []array1= {1,5,6,3};
		int [] array2= {9,2,10,2,1};
		int []array3=new int[array1.length+array2.length];
		int tmpindex=0;
		int temp=0;
		for(int i=0;i<array1.length;i++)
		{
			array3[i]=array1[i];
			tmpindex=i;
		}
		
		
		
		for(int i=0;i<array2.length;i++)
		{
			array3[tmpindex+i+1]=array2[i];
			
		}
		
		
		for(int i=0;i<array3.length;i++)
		{
			for(int j=i+1;j<array3.length;j++)
			{
				if(array3[i]>array3[j])
				{
					temp=array3[i];
					array3[i]=array3[j];
					array3[j]=temp;
				}
			}
		}
		
		for(int i=0;i<array3.length;i++)
		{
			System.out.println(array3[i]);
		}
		
		
		
	}

}
