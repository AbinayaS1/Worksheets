package week1.day2;

public class Convertanegativenumbertopositivenumber {

	public static void main(String[] args) {
		int a=-45;
		if (a<0)
		{
			a=-a;
			System.out.println("The given number is converted to positive number"+a);
		}
		else if(a>0)
		{
			System.out.println("The given number is positive number"+a);
		}
		else {
			System.out.println("The given number is either positive or negative number"+a);
		}
	}
}