package com.techlabs.annotate;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface NeedRefactoring {
	String colors();

	String colors2();
}

class Annotate {
	@NeedRefactoring(colors = "red", colors2 = "blue")
	public void method1() {
		System.out.println("Test method1");
	}

	@NeedRefactoring(colors = "black", colors2 = "yellow")
	public void method2() {
		System.out.println("Test method2");
	}

}

public class AnnotateTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args)throws NoSuchMethodException {
		try{
			Annotate a = new Annotate();
			
			Class cls = a.getClass();
			Method m1 = cls.getDeclaredMethod("method1");
			m1.invoke(a);
			NeedRefactoring n1 = m1.getAnnotation(NeedRefactoring.class);
			System.out.println("color = "+n1.colors());
			System.out.println("color2 = "+n1.colors2());

			
			Method m2 = cls.getDeclaredMethod("method2");
			m2.invoke(a);
			NeedRefactoring n2 = m2.getAnnotation(NeedRefactoring.class);
			
			System.out.println("color = "+n2.colors());
			System.out.println("color2 = "+n2.colors2());
			
			
			

		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
