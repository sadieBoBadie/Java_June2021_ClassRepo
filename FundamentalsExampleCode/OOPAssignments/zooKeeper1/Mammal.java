package zooKeeper1;

public class Mammal {
	
	protected int energyLevel;
	protected String name;
	
	public Mammal(String name) {
		energyLevel = 100;
		this.name = name;
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
		return;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		return;
	}
	public void displayEnergy() {
		System.out.printf("%s's Engergy level is %s\n", name, energyLevel);
	}
	
	
}
