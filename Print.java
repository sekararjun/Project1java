package printing;

import java.util.Scanner;

//Create a Program to print Student details like Student Name, Roll No, 
//Subject,Total Marks.

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
       System.out.println("Enter Student Name");
       String sname=scan.next();
       System.out.println("Enter Roll No");
       int rollNo=scan.nextInt();
       System.out.println("Enter Subject");
       String subject=scan.next();
       System.out.println("Enter total mark");
       int mark=scan.nextInt();
       System.out.println("Student Name :  "+sname);
       System.out.println("Roll No : "+rollNo);
       System.out.println("Subject :"+subject);
       System.out.println("Total Mark :"+mark);
       scan.close();
	}

}
