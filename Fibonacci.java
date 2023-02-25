package week1.day2;

public class Fibonacci {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 1)For loop iteration flow
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int firstnum=0;                              // initialize int variables
		int Secondnum=1; 
		int sum;
		int i;
		System.out.print(firstnum);          // Print first number
		for(i=1;i<8;++i)                    // Iterate from 1 to the range
		{  
	
			sum =firstnum+Secondnum;          // add first and second number assign to sum
			
			firstnum=Secondnum;             // Assign second number to the first number
			Secondnum=sum ;                // Assign sum to the second number
      		System.out.print("  " +sum);  // print sum
		} 
	}
}
