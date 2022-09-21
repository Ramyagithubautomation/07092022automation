package Package1;

public class Childclass extends Parentclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass child=new Childclass();
		System.out.println(child.parentclassvar);
		Parentclass parent=new Parentclass();
	//	parent.childclassmethod();
		
	}
	
	public void childclassmethod()
	{
		System.out.println("this is a child class method");
	}

}
