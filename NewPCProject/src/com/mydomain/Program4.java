package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;

/** Program4.java
 * Rotates backwards and allows for interruption of rotation
 * May 27, 2017
 * @author Jimmy Huynh & Ethan Zhou
 */
public class Program4 {

	public static void main(String[] args) {

		System.out.println("Program 4");
		Button.waitForAnyPress();

		Motor.A.rotate(-1440, true);

		while (Motor.A.isMoving()) {
			System.out.println(Motor.A.getTachoCount());

			Button.waitForAnyPress();
			Motor.A.stop();
		}
		
	}
	
}
