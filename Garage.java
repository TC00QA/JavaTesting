import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> storage = new ArrayList<Vehicle>();

	public Garage() {
	}

	public boolean addItem(Vehicle v) {

		this.storage.add(v);

		return true;
	}

	public boolean removeItem(Vehicle rm) {

		for (int i = 0; i < this.storage.size(); i++) {

			if (this.storage.get(i) == rm) {

				this.storage.remove(i);

				return true;
			}
		}
		return false;
	}

	public ArrayList<String> returnItems() {

		ArrayList<String> output = new ArrayList<String>();

		for (int i = 0; i < this.storage.size(); i++) {
			Vehicle currentIteration = this.storage.get(i);
			output.add(currentIteration.getModel());

		}

		return output;
	}

	public String getTypes() {

		int cars = 0;
		int motorbikes = 0;

		for (int i = 0; i < this.storage.size(); i++) {

			Vehicle currentIteration = this.storage.get(i);

			if (currentIteration instanceof Car) {
				cars++;
			} else if (currentIteration instanceof Motorbike) {
				motorbikes++;
			}

		}

		return ("Cars: " + cars + "Motorbikes: " + motorbikes);
	}

}
