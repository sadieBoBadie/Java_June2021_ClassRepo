package zooKeeper1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla cocoa = new Gorilla("Cocoa");
//		cocoa.displayEnergy();
//		
//		cocoa.throwSomething();
//		cocoa.throwSomething();
//		cocoa.throwSomething();
//		cocoa.displayEnergy();
//		
//		cocoa.eatBananas();
//		cocoa.eatBananas();
//		cocoa.displayEnergy();
//		
//		cocoa.climb();
//		cocoa.displayEnergy();
		
		Bat pinky = new Bat("Pinky");
		
		pinky.displayEnergy();
		pinky.attackTown();
		pinky.attackTown();
		pinky.attackTown();
		pinky.displayEnergy();
		
		pinky.eatHumans();
		pinky.eatHumans();
		pinky.eatHumans();
		pinky.eatHumans();
		pinky.displayEnergy();
		
		pinky.fly();
		pinky.eatHumans();
		pinky.fly();
		pinky.displayEnergy();
	}

}
