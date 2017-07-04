package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Demo01 {
 public static void main(String[] args) {
	
	/* String[] arr =new String[]{"A","B","C"};
	 String a=null;
	 
	 
	 for(String str :arr){
		 System.out.println(str);
		 a=str;
	 }*/
	 
	   //false
	 
	 int[] arr2=new int[]{1,3,5,7,9};
	 
	 for(int i:arr2){
		 
		 arr2[Arrays.binarySearch(arr2, i)]=i+1;
		 
	 }
	 
	 System.out.println(Arrays.toString(arr2));
	 
	 
	
	 
}
}
