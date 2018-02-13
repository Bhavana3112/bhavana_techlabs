package com.techlabs.inheritance;

abstract class MyAbstractClass{
	public void display(){
		System.out.println("Hello");
	}
	
	abstract public void display2();
	
}
class AbstractClassTest extends MyAbstractClass{
	public void display2(){
		System.out.println("Overriding abstract method");
	}
	
	public static void main(String [] args){
		MyAbstractClass a = new AbstractClassTest();
		a.display2();
		a.display();
	}

}
