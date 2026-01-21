package com.tka;

public class D {

	// with return type
	public int m1() {
		return 12345;
	}

	public byte m2() {
		return 12;
	}

	public short m3() {
		return 123;
	}

	public float m4() {
		return 12.55f;
	}

	public double m5() {
		return 123.45;
	}

	public char m6() {
		return '@';
	}

	public long m7() {
		return 123452345678l;
	}

	public boolean m8() {
		return true;
	}

	public String m9() {
		return "my Name is Amit";
	}

	public static void main(String[] args) {
		D d = new D();

		System.out.println(d.m1());
		System.out.println(d.m2());
		System.out.println(d.m3());
		System.out.println(d.m4());
		System.out.println(d.m5());
		System.out.println(d.m6());
		System.out.println(d.m7());
		System.out.println(d.m8());
		System.out.println(d.m9());

	}

}
