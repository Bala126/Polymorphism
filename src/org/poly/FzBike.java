package org.poly;

public class FzBike extends KtmBike{
public void milage() {
	System.out.println("FZ Bike milege:30");
	super.milage();
}
	public void speed() {
		System.out.println("FZ Bike Speed :100");
		super.speed();
	}public static void main(String[] args) {
		FzBike m = new FzBike();
		m.milage();
		m.speed();
	}
}
