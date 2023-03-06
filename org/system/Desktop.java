package org.system;

public class Desktop extends Computer {
public void desktopSize() {
	System.out.println("Desktop size is 15 inch");
}
	public static void main(String[] args) {
		Desktop features = new Desktop();
		features.desktopSize();
		System.out.println(features.computerModel());

	}

}
