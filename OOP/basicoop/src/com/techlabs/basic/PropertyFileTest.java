package com.techlabs.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFileTest {
	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream(
					"datafolder\\file.properties");
			Properties p = new Properties();
			p.setProperty("id", "abc");
			p.setProperty("ide", "Eclipse");
			p.setProperty("article", "JavaProperties");
			p.store(out, "Exaample of Properties");

			InputStream in = new FileInputStream("datafolder\\file.properties");
			Properties p2 = new Properties();
			p2.load(in);
			System.out.println(p2.getProperty("name"));

			for (String property : p2.stringPropertyNames()) {
				String value = p2.getProperty(property);
				System.out.println(property + "=" + value);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
