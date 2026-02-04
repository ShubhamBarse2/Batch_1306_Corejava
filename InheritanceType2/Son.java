package InheritanceType2;

public class Son extends Father {

	public void myVilla() {
		System.out.println("1CR Son Property ... ! ");
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.myVilla();
		s.myHouse();
		s.myProperty();
	}

}
