package week1.day2;

public class Factorial {
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)for loop iteration flow
	 * 2)logic flow
	 * 
	 * 
	 */	
	public static void main(String[] args) {
	 int a =5;                          // Declare your input as 5
    int fact =1;                       // Declare an integer variable fact as 1
     int i;
     for (i=1;i<=a;i++)               // Iterate from 1 to your input 
     fact =fact*i;                   // Within the loop: Multiply fact with the iterator variable
     System.out.println(fact);      // Print factorial (fact)
     
	}

}
