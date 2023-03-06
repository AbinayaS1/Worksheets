package week3day1;

public class Android extends Mobile {
	public void takeVideo () {
		System.out.println("vedio feature added");
	}

	public static void main(String[] args) {
		Android obj1=new Android();
		obj1.sendMessage();
		obj1.makeCall();
		obj1.saveContact();
		obj1.takeVideo();
			
		
		

	}

}
