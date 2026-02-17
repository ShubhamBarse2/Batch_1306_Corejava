package AbstractClassCode;

public class BankTest {

	public static void main(String[] args) {

//		Bank b;
//		b = new Sbi("shubham", "pune");
//		b.m1();
//		b.m2();    // Upcasting 
//
//		((Sbi) b).m3();  // Downcasting 

		Bank b;
		b = new Sbi();
		b.bankName("SBI");
		b.rateOfInterst();
		b.balance(12000);

		Bank b1;
		b1 = new Hdfc();
		b1.bankName("HDFC");
		b1.rateOfInterst();
		b1.balance(34000);

	}

}
