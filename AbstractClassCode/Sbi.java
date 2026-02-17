package AbstractClassCode;

public class Sbi extends Bank {

	@Override
	public void rateOfInterst() {
		System.out.println("Sbi Provide ROI 7%");

	}

	@Override
	public void balance(double amt) {
		System.err.println("this is final Amt " + amt);

	}

//	Sbi(String name, String city) {
//		System.out.println(name + "  " + city);
//	}

}
