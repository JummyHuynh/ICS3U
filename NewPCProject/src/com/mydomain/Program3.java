package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;

/** Program3.java
 * Rotates the motors and displays tachometer readings
 * May 27, 2017
 * @author Jimmy Huynh & Ethan Zhou
 */
public class Program3 {

	public static void main(String[] args) {

		System.out.println("Program 3");
		Button.waitForAnyPress();

		Motor.A.rotate(1440);

		System.out.println(Motor.A.getTachoCount());

		Motor.A.rotateTo(0);

		System.out.println(Motor.A.getTachoCount());
		Button.waitForAnyPress();


	}

}
