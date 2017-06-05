package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;

/**LightSensorProgram.java
 * Tests out the light sensor
 * June 5, 2017
 * @author Jimmy Huynh & Ethan Zhou
 */
public class LightSensorProgram {

	public static void main(String[] args) {

		LightSensor torch = new LightSensor (SensorPort.S3);
		Motor.A.setSpeed(400);
		Motor.B.setSpeed(400);

		while (torch.getLightValue() < 50) {

			Motor.A.forward();
			Motor.B.forward();

			System.out.println("Black: " + torch.getLightValue());

			while (torch.getLightValue() >= 50) {

				Motor.A.stop();
				Motor.B.stop();

				Motor.B.rotate(250);	

				System.out.println("White: " + torch.getLightValue());

			}

			if (Button.ENTER.isPressed()) {
				Motor.A.stop();
				Motor.B.stop();
				break;
			}
		}

		Motor.A.stop();
		Motor.B.stop();

	}

}
