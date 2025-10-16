package printing;

/*1. Check if a number is odd or even using modulus operator
2. Write a program to calculate area of rectangle
3. Use relational and logical operators in conditional statements*/


public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddOrEven(5);
		areaOfRectangle(10,20);
		relationalOps(10,10);
		logicalOps(false,false);

	}
   public static void oddOrEven(int a) {
	   if(a%2==0) {
		   System.out.println("Even");
	   }
	   else {
		   System.out.println("Odd");
	   }
   }
   public static void areaOfRectangle(int a,int b) {
	   System.out.println(a*b);
   }
   public static void relationalOps(int a,int b) {
	   if(a<=b) {
		   System.out.println("A is greater than or equal to B");
	   }
	   else {
		   System.out.println("A is smaller than B");
	   }
   }
   public static void logicalOps(boolean a,boolean b) {
	   if(a&&b==true) {
		   System.out.println("True");
	   }
	   else {
		   System.out.println("False");
	   }
   }
   
}
