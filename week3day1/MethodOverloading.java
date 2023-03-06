package week3day1;

public class MethodOverloading {
	public int add (int a,int b) {
		return a+b;
	
		}
	
	public int add (int a,int b,int c){
		return (a+b+c);
		
	}
public double sub(double a,double b) {
	return a-b;
}
public int sub(int a,int b) {
	return a-b;
	
}
public void mul(int a,int b) {
	System.out.println(a*b);
}
public void mul(double a,int b) {
	System.out.println( a*b);
}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.add(5, 6));
	System.out.println(obj.add(5, 9, 8));
		System.out.println(obj.sub(8, 5));
		System.out.println(obj.sub(70.256,78.650));
		obj.mul(5, 9);
		obj.mul(56.216, 9);

	}

}
