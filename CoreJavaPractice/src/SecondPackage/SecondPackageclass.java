package SecondPackage;

import FirstPackage.accessmodifiersclass;

public class SecondPackageclass {

	public static void main(String[] args) {
		
		

		accessmodifiersclass modify=new accessmodifiersclass();
		
		System.out.println(modify.publicvar);
        modify.publicmethod();
		//System.out.println(modify.protectvar);
        //System.out.println(modify.defaultvar);
	}

}
