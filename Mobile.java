package week1.day1;

public class Mobile {

	public void makeCall(){
		System.out.println("Make a call incase of emergency");
	}

	public void sendMsg(){
		System.out.println("Leave a Msg incase of unattended calls");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile Phone = new Mobile();
		Phone.makeCall();
		Phone.sendMsg();

	}

}
