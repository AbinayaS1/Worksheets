package week2.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str = "changeme";
		int length = str.length();
		System.out.println("The lenght of the string is :"+ length);
//		String UpperCase = str.toUpperCase();
//		System.out.println(UpperCase);
//		String LowerCase = str.toLowerCase();
//		System.out.println(LowerCase);
		
		char [] ch =str.toCharArray();
		for (int i =0;i<=ch.length-1; i++) 
		{
			if (i %2==1) {
				ch[i]=Character.toUpperCase(ch[i]);
				System.out.print(ch[i]);
			}
			else {
				System.out.print(ch[i]);
			
		}
	}
	}
}

