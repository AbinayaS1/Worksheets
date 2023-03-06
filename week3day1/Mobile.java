package week3day1;

public class Mobile {
	
public void sendMessage() {
	System.out.println("message feature");
	}

public void makeCall() {
	System.out.println("call feature");
}

public void saveContact() {
	System.out.println("save contact feature");
}
	public static void main(String[] args) {
	 Mobile obj = new Mobile();
	 obj.sendMessage();
	 obj.makeCall();
	 obj.saveContact();
	}

}
