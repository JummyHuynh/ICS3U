package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;

/** Program1.java
 * Moves and waits for button to change direction or stop
 * May 27, 2017
 * @author Jimmy Huynh & Ethan Zhou
 */
public class Program1 {

	public static void main(String[] args) {
		
		System.out.println("Program 1");
		
		Button.waitForAnyPress();
		Motor.A.forward();
		System.out.println("Forward");
		
		Button.waitForAnyPress();
		Motor.A.backward();
		System.out.println("Backward");
		
		Button.waitForAnyPress();
		Motor.A.stop();
		
	}

}
