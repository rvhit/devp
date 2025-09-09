package sampleCodes;
import java.util.ArrayList;
import java.util.List;

//The array-form of an integer num is an array representing its digits in left to right order.
//
//For example, for num = 1321, the array form is [1,3,2,1].
//Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
public class runCat {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");
		Cattling.runCat();
//		int[] arr= {9,9,9,9,9,9,9,9,9,9};
//		List<Integer> arr2=addToArrayForm(arr, 1);
//		System.out.println(arr2);]
	}
	
	 public static List<Integer> addToArrayForm(int[] num, int k) {
		 List<Integer> arr= new ArrayList<Integer>();
		 String numString="";
		 int numInt=0;
		 for(int i :num)
		 {
			 numString=numString+i;
		 }
		 numInt = numInt+k;
		 System.out.println(numInt);
		 numString=String.valueOf(numInt);
		 int lengthOfString=numString.length();
		for(int i=0;i<lengthOfString;i++)
			
		{
			char c= numString.charAt(i);
			int l=Character.getNumericValue(c); 			
			arr.add(l);
		}
		return arr;
	        
	    }
}
