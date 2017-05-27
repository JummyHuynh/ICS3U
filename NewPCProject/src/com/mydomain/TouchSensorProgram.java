package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

/** TouchSensorProgram.java
 * Moves backwards and changes direction once the touch sensor is pressed
 * May 27, 2017
 * @author Jimmy Huynh & Ethan Zhou
 */
public class TouchSensorProgram {

	public static void main(String[] args) {

		TouchSensor touch = new TouchSensor(SensorPort.S1);
		
		Button.waitForAnyPress();

		Motor.A.setSpeed(200);
		Motor.B.setSpeed(200);

		Motor.A.backward();
		Motor.B.backward();

		while (Motor.A.isMoving() && Motor.B.isMoving()) {
			if (touch.isPressed()) {

				Motor.A.stop();
				Motor.B.stop();

				Motor.A.forward();
				Motor.B.forward();

			}	
		}
	}
}

