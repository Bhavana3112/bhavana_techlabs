package com.techlabs.basic;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.annotation.Documented;
import java.lang.NoSuchMethodException;


@Retention(RetentionPolicy.RUNTIME)
@interface correction
{
    String Developer(); 
    String Expirydate();
} 


class AppTest{

	@correction(Developer="Rahul", Expirydate="01-10-2020")
    public void method1()
    {
        System.out.println("Test method 1");
    }
 
    @correction(Developer="Anil", Expirydate="01-10-2021")
    public void method2()
    {
        System.out.println("Test method 2");
    }

    @correction(Developer="Anil", Expirydate="01-10-2021")
    public void method3(String x){
    	System.out.println("Test method 3 with string parameter:"+x);
    }


}

public class ReflectApp{

	@SuppressWarnings("rawtypes") //Important
	public static void main(String[] args) {

	//no paramater
	Class noparams[] = {}; //It is empty array of type Class

	//String parameter
	Class[] paramString = new Class[1]; //It is array of one element of type Class
	paramString[0] = String.class;


	try{
	        
		Class cls = Class.forName("AppTest"); //Stores class AppTest
		AppTest a = new AppTest(); //object on which invoke() is to be called

		Method method1 = cls.getDeclaredMethod("method1", noparams);
		method1.invoke(a);
		correction c1 = method1.getAnnotation(correction.class);
		System.out.println("Annotation Developer: "+c1.Developer());
		System.out.println("Annotation Expirydate: "+c1.Expirydate());

		System.out.println("\n\n");

		Method method2 = cls.getDeclaredMethod("method2", noparams);
		method2.invoke(a);
		correction c2 = method2.getAnnotation(correction.class);
		System.out.println("Annotation Developer: "+c2.Developer());
		System.out.println("Annotation Expirydate: "+c2.Expirydate());

		System.out.println("\n\n");

		Method method3 = cls.getDeclaredMethod("method3", String.class);
		method3.invoke(a,"abc");
		correction c3 = method3.getAnnotation(correction.class);
		System.out.println("Annotation Developer: "+c3.Developer());
		System.out.println("Annotation Expirydate: "+c3.Expirydate());



	}catch(Exception ex){
		ex.printStackTrace();
	}
   }
}