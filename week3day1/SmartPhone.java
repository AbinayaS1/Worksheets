package week3day1;

public class SmartPhone extends Android {

	public void connectWhatsapp() {
		System.out.println("add whatsapp feature");
	//polymorphism-overriding	}
	}
		public void takeVideo() {
		System.out.println("take video-method overridding");
	}
	
	public static void main(String[] args) {
		SmartPhone obj2 = new SmartPhone();
		obj2.makeCall();
		obj2.sendMessage();
		obj2.saveContact();
		obj2.takeVideo();
		obj2.connectWhatsapp();
		

	}

}
