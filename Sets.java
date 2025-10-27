package collections;

import java.util.LinkedHashSet;
//import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

//1. Write a program to remove duplicate values from set of values and print in insertion order.

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<Integer> li=new LinkedHashSet<Integer>();
    li.add(89);
    li.add(78);
    li.add(80);
    li.add(78);
    System.out.println(li);
	}

}
