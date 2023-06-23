package ch08.a_abstract.bad;

public class HorseCart extends Vehicle{
// The type HorseCart must implement the inherited 
	// abstract method Vehicle.addFuel()
	
	public void addFuel() {
		System.out.println("말은 건초를 주자!!");
	}
}
