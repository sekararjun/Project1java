package oops;

/*
1. Implement inheritance with Employer (Parent) and Employee(Child) class.
2. Demostrate method overriding
*/

class Employer{
	
	String Name;
	
	void breaks() {
		 System.out.println(Name+" is in Break");
	}
	void leave() {
		System.out.println("he is in on leave");
	}
}
public class OopsAdv extends Employer{
	@Override
	void breaks() {
		 System.out.println(Name+" is in break");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopsAdv c=new OopsAdv();
		c.Name="sekar";
		c.leave();
		c.breaks();

	}

}
