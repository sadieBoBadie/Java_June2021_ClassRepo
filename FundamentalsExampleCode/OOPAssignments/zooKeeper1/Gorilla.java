package zooKeeper1;

public class Gorilla extends Mammal{

	public Gorilla(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void throwSomething() {
		System.out.printf("%s picks up something and throws it.\n", name);
		energyLevel -= 5;
		return;
	}
	
	public void eatBananas() {
		System.out.printf("%s exclaims 'Mmmmm, me like eat bananas!!'\n", name);
		energyLevel += 10;
		return;
	}
	
	public void climb() {
		System.out.printf("%s climbs a tree. Tree breaks. %<s is exhausted\n", name);
		energyLevel -= 10;
		return;
	}
	
}
