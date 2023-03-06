package week3day1;

public class AxisBank extends BankInfo {
	public void Deposit() {
		System.out.println("The deposit value is 200 dollars");
	}
public static void main(String[] args) {
	AxisBank Accdetails =new AxisBank();
	Accdetails.fixed();
	Accdetails.saving();
	Accdetails.Deposit();
}
}
