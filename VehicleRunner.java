package demo;
import demo.Vehicle;
public class VehicleRunner {
	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.add("TVS");
		vehicle.displayDetails();
		vehicle.add("Starcity");
		vehicle.add("Pulsar");
		vehicle.add("Plantina");
		vehicle.add("Avenger");
		vehicle.add("CT100");
		vehicle.displayDetails();
	}

}

