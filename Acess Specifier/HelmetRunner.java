package test;
import test.Helmet;
public class HelmetRunner {
	public static void main(String[] args) {

		Helmet helmet = new Helmet();
		helmet.add("Quest");
		helmet.add("Pista");
		helmet.add("vega");
		helmet.add(null);
		helmet.add("Alpha");
		helmet.add("FastZone");
		helmet.displayDetails();
	}

}
