package week2.day1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,7,6,8};
		int n = arr.length +1;
		int Sum = (n*(n+1))/2;
		Arrays.sort(arr);
  	for (int i=0; i<arr.length; i++) 
		{
  		Sum=Sum-arr[i];
		}
	System.out.println("The missing number is:"+" "+Sum);
	
	}
}


