package zooKeeper1;

import java.util.ArrayList;
import java.util.Random;

public class Bat extends Mammal {

	public Bat(String name) {
		super(name);
		this.setEnergyLevel(300);
		// TODO Auto-generated constructor stub
	}
	
//	 For the fly() method, print the sound a bat taking off 
//	and decrease its energy by 50.
	public void fly() {
		System.out.printf("%s takes off in flight. fffwoosh!!\n", name);
		energyLevel -= 50;
		return;
	}
	
	
//	 ● For the eatHumans() method, print the so- well, 
//	never mind, just increase its energy by 25.
	public void eatHumans() {
		
		ArrayList<String> randomPeople = new ArrayList<String>();
		randomPeople.add("tasty little blond girl");
		randomPeople.add("wholesome young couple in love");
		randomPeople.add("nice old grandma");
		
		Random seed = new Random();
		int idx = seed.nextInt(3);
		
		System.out.printf("%s has found a %s to eat. CRUNCH... AAAAAAAH!\n", name, randomPeople.get(idx));
		energyLevel += 25;
		return;
	}
//	 ● For the attackTown() method, print the sound of a town 
//	on fire and decrease its energy by 100.
	
	public void attackTown() {
		ArrayList<String> randomTown = new ArrayList<String>();
		randomTown.add("Haverton. The sounds of terror and \n shrieking fill the night\n");
		randomTown.add("Shandy Bryer. The town burns in bright flames.\n");
		randomTown.add("the Lost. Smoke fills the night sky.\n");
		
		Random seed = new Random();
		int idx = seed.nextInt(3);
		System.out.printf("%s attacks the township of %s", name, randomTown.get(idx));
		energyLevel -= 100;
		return;
	}

}
