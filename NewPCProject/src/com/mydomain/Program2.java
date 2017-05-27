package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

/** Program2.java
 * Displays tachometer readings and moves
 * May 27, 2017
 * @author Jimmy Huynh & Ethan Zhou
 */
public class Program2 {

	public static void main(String[] args) {

		System.out.println("Program 2");

		Motor.A.setSpeed(720);
		Motor.A.forward();
		Delay.msDelay(2000);

		System.out.println(Motor.A.getTachoCount());
		Motor.A.stop();
		System.out.println(Motor.A.getTachoCount());

		while (Motor.A.getTachoCount() >= 0) {
			Motor.A.backward();
		}

		Motor.A.stop();

		System.out.println(Motor.A.getTachoCount());
		Button.waitForAnyPress();

	}

}
