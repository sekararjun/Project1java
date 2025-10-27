package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 3. Write a program to allow duplicate value and print in order.
public class Lists {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	List<Integer> li=new ArrayList<Integer>();
   int i=0;
	while(i!=-1) {
		System.out.println("Enter the values or enter -1 for exit");
		i=scan.nextInt();
		if(i!=-1) {
		li.add(i);
		
		}
		
	}
	li.add(12);
	li.add(34);
	li.add(35);
	li.add(12);
		System.out.println(li);
		scan.close();
}
	
}
