package week2.day1;

public class SplitTheString {

	public static void main(String[] args) {
		String str= "Iam a software tester";
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);	
		}
}
}