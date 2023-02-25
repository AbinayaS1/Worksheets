package week1.day2;

public class signcheck {

	public static void main(String[] args) {
		int a = 35;
		if(a<0) {
			System.out.println("The given number is negative"+ a);
		}
		else if(a>0) {
			System.out.println("The given number is positive:"+ a);
		}
		else {
			System.out.println("The given number is either negative or positive"  + a);
		}
	}
}
