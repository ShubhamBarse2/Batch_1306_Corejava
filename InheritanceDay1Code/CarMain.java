package InheritanceDay1Code;

public class CarMain {

	public static void main(String[] args) {
		Bmw b = new Bmw();
		String bmwColor = b.color = "blue";
		String bmwModel = b.model = "BMW Q7";
		double bmwPrice = b.price = 6000000;
		System.out.println(bmwColor);
		System.out.println(bmwModel);
		System.out.println(bmwPrice);
		b.myEngine();
		b.myStering();
		b.autoPark();
		int maxBmwSpeed = b.maxSpeed = 250;
		System.out.println("Max Speed of BMW " + maxBmwSpeed);

		MgHector mg = new MgHector();

		// HomeWork
	}

}
