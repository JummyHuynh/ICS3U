package com.mydomain;

import lejos.nxt.Motor;
import lejos.util.Delay;

/** Program5.java
 * Regulates the motor speed to match each other
 * May 27, 2017
 * @author Jimmy Huynh & Ethan Zhou
 */
public class Program5 {

	public static void main(String[] args) {

		System.out.println("Program 5");

		Motor.A.setSpeed(720);
		Motor.B.setSpeed(720);

		Motor.A.rotate(720, true);
		Motor.B.rotate(720, true);
		
		for (int i = 0; i < 8; i++) {
			Delay.msDelay(200);
			System.out.print(Motor.A.getTachoCount() + ", ");
			System.out.println(Motor.B.getTachoCount());
		}
		
		Motor.B.stop();
		Motor.A.stop();
		
	}

}
