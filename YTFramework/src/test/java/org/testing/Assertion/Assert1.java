package org.testing.Assertion;

public class Assert1 {

	public static void assertion(String actual, String Expected) {
		
		if (actual.equals(Expected)) {
			System.out.println("Assetion is passed");
		}
		else {
			System.out.println("Assetion is failed");
		}
	}
}
