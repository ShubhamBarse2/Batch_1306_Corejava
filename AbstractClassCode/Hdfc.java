package AbstractClassCode;

public class Hdfc extends Bank {

	@Override
	public void rateOfInterst() {
		System.out.println("HDFC ROI is 6%");

	}

	@Override
	public void balance(double amt) {
		System.err.println("this is final Amount " + amt);

	}

}
