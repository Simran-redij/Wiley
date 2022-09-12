
public enum coffee {

	CAPUCCINO(3), LATTE(4), MOCHA(5), ESPRESSO(6);
	int coffeebeans;
	int cost;
	
	coffee(int coffeebeans){
		this.coffeebeans = coffeebeans;
	}
	
	public int getCoffeeCost() {
		return this.coffeebeans*100;
	}
	
	public void prepCoffee() {
		System.out.println("Hello! your coffee is being prepared");
	}
}
