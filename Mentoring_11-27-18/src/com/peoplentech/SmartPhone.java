package com.peoplentech;

public class SmartPhone {
	// final String TYPE="Smart Phone";
	String OS = "MicroSoft";
    int imei = 1010101;
    int displaySize = 4;

	String brand = "Generic";
	int memory;
	String model;

	public SmartPhone() {
	}

	public SmartPhone(String brand, int memory) {
		this.brand = brand;
		this.memory = memory;
	}

	public SmartPhone(String brand, int memory, String model) {
		this.brand = brand;
		this.memory = memory;
		this.model = model;
	}

	// public void getType() {System.out.println(TYPE);}
	public void getOs() {
		System.out.println(OS);
	}

	public int getImei(int serialNumber) {
		System.out.println(serialNumber);
		return imei;
	}

	public void getDisplaySize() {
		System.out.println(displaySize);
	}

	public void getBrand() {

		System.out.println(brand);
	}

	public int getMemory() {
		System.out.println(memory);
		return memory;
	}

	public void getModel() {
		System.out.println(model);
	}
}

// public static void main(String [] args) {
// SmartPhone.getOs();
// System.out.println(OS);}}
// OS="google";
// System.out.println(OS);
// System.out.println(TYPE);
// TYPE="landphone";
