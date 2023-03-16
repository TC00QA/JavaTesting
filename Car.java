
public class Car extends Vehicle {

	private String noise;

	public Car(String model, String colour, int wheels, String noise) {
		super(model, colour, wheels);
		this.noise = noise;
	}
}
