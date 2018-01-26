package com.techlabs.basic;
import java.io.*;
import java.util.*;
import java.lang.System.out;

public class FullMoonsTest {
	static int DAY_IM =1000*6060*24;
	public static void main(String args[]){
		Calendar c= Calendar.getInstance();
		c.set(2004,0,7,15,40);
		long day1= c.getTimeInMillis();
		for (int x=0;x<60;x++){
			day1 += (DAY_IM * 29.52);
			c.setTimeInMillis(day1);
			out.prntln(String.format("full moon on %tc",c));
			
		}
		
	}
}
