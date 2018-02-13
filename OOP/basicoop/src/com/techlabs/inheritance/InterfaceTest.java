package com.techlabs.inheritance;

interface Interface1 {
	abstract public void display();
}

class Interface2 implements Interface1 {
	public void display() {
		System.out.println("display method");
	}

}

public class InterfaceTest {
	public static void main(String[] args) {
		Interface2 t1 = new Interface2();
		t1.display();
	}

}
