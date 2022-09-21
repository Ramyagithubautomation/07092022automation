
public class ChildClass extends AbstractClasss{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass child=new ChildClass();
		child.method();
		child.method1();
		int num=child.number;
		
		
		//AbstractClasss class1=new AbstractClasss();
		
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("implemented method");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("implemented method1");
	}

}
