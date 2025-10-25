package oops;

//3. Create Interface and implement it in subclass.

public class Employees implements Employers{

	@Override
	public void salary() {
		System.out.println("Salary is credited");
	}
	public static void main(String[] args) {
		Employers se=new Employees();
		se.salary();
		
	}
}