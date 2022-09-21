package Package1;

public class HDFCBank implements RBIInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCBank hdfc=new HDFCBank();
		hdfc.minimumLoanInterestPercent();
		hdfc.maxloanInterestPercent();
		//minloanintrate=20; not allowecoz this a var declared inside the interafce and it is 
		//by default public , sttaic , final
		//RBIInterface rbi=new RBIInterface(); not possible
		
		RBIInterface rbi=new HDFCBank(); //imp for framework
		
		
		
	}

	@Override
	public void minimumLoanInterestPercent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maxloanInterestPercent() {
		// TODO Auto-generated method stub
		
	}

	
	
}
