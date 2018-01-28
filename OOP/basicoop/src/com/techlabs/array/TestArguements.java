package com.techlabs.array;

public class TestArguements {
	public static void main(String[] developerNames) {
		//System.out.println("inside main");
		//int a = developerNames.length;
	//	System.out.println(a);
		if (developerNames.length != 0) {
			//for (int index = 0; index < developerNames.length; index++) {
			for(String name : developerNames){
				System.out.println("Hello " +name);

			}
		} else {
			System.out.println("No parameters found");

		}
	}

}
