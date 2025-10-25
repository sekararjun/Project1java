package oops;

//4. implement encapsulation using private field and public methods
class Salary{
	private double salarys;
	public void setSalary(double salary) {
		if(salary>0) {
			salarys=salary;
		}else {
			System.out.println("Salary is Invalid");
		}
	}
	public void getSalary() {
		System.out.println("Your salary is "+salarys);
	}
}
public class Enclapulation extends Salary{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Enclapulation s=new Enclapulation();
     s.setSalary(50000);
     s.getSalary();
	}

}
