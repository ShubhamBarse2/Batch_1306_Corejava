package AbstractClassCode;

public abstract class Bank implements Rbi {

	public abstract void rateOfInterst();

	public void bankName(String bName) {
		System.out.println("Bank Name is " + bName);
	}

}
