package Package1;

public class FlowControlstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlowControlstatements flow=new FlowControlstatements();
		System.out.println(flow.allocatetexpercentage(200000));
		String[] array= {"apple","ball","cat","dog"};
		int i=0;
		for(i=0;i<array.length;i++) //i-> 0->1->2->3->4
		{
			System.out.println(array[i]);
		}
		int j=0;
		while(j<array.length)
		{
			System.out.println(array[j]);
			j++;
		}
		
		int k=0;
		
		do {
			System.out.println(array[k]);
			k++;
			
		}while(k<array.length);
		
		
	}
	
	
	public int allocatetexpercentage(int salary)
	{
		if(salary>1000 && salary<100000)  //the return type of the condistion is alwasy true or false
		{
			return 10;
			
		}
		
		if(salary>100000)
		{
			return 20; 
		}
		return 0;
	}

}
