package printing;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan =new Scanner(System.in);
		int n;
		System.out.println("enter size :");
		n=scan.nextInt();
		int[] arr=new int[n];
        
        for(int i=0;i<n;i++) {
        	arr[i]=scan.nextInt();
        }
        int ans=sumOfArr(arr,n);
        System.out.println(ans);
        reverseOfArr(arr);
        scan.close();
        
	}
	public static int sumOfArr(int a[],int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}return sum;
	}
    public static void reverseOfArr(int a[]) {
    	for (int i=a.length-1;i>=0;i--) {
    		System.out.print(a[i]+" ");
    	}
    }
}
