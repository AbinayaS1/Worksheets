package week2.day1;

public class ReverseEvenPositionOfWords {

	public static void main(String[] args) {
		String str = "Iam a software tester";
		String [] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				char ch[]=split[i].toCharArray();	
				String reverse =" ";		
				for (int j = ch.length-1; j >=0; j--) {
					reverse = reverse + ch[j];
				}
				System.out.println(reverse +" ");
			}
			else 
			{
				System.out.println(split[i]+ " ");
			}

		}

	}	
}



