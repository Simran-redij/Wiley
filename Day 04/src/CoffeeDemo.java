
public class CoffeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		coffee Coffee = coffee.ESPRESSO;
		Coffee.prepCoffee();
		int cost = Coffee.getCoffeeCost();
		System.out.println(Coffee+" cost is "+cost);
		
	}

}
