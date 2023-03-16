
public class Runner {

	public static void main(String[] args) {

		Car ford = new Car("Fiesta", "Red", 4, "Honk");
		Car tesla = new Car("Model x", "Blue", 4, "Beep");
		Motorbike yamaha = new Motorbike("YZF", "Black", 2, "Chirp");

		Garage homeGarage = new Garage();

		homeGarage.addItem(ford);
		homeGarage.addItem(tesla);
		homeGarage.addItem(yamaha);

		System.out.println(homeGarage.returnItems());

		System.out.println(homeGarage.getTypes());

	}

}
