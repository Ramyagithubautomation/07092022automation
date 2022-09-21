
public class FlowControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if-else condition
		int a=12;
		//System.out.println(a);
		if(a>10) //a>10 means,> ,<, ==, !=,<=,>=  -> conditional operators
		{
			System.out.println(a);
			
		}
		else
		{
			System.out.println("a is not greater than 10");
		}
		
		//if you are performing any repeated actions-> for loop,while loop or do while loop
		//link1.clcik(); //link2.click()
		
		/*for(int i=0;i<100;i++)  //i->0,1,2,3,4....99  ++,--
		{
			System.out.println(i);
		}
		int i=0;
		while(i<100)
		{
			System.out.println(i);
			i++;
		}
		
		do
		{
			System.out.println(i);
			i++;
		}while(i<100);
		
		
		char charcater='a';
		
		switch(charcater)
		{
		case 'a': System.out.println("case 1");
		default: System.out.println("case 2");
		}*/
		
		//break and continue statements are always used inside the loops only
		
		for(int i=0;i<100;i++)
		{
			if(i==98)
			{
				//break;
				continue;
			}
			System.out.println(i);
			
		}
		
		

	}

}
