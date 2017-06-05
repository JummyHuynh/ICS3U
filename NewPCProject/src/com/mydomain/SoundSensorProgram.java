package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;

/**SoundSensorProgram.java
 * Tests out the sound sensor
 * June 5, 2017
 * @author Jimmy Huynh & Ethan Zhou
 */
public class SoundSensorProgram {

	public static void main(String[] args) {

		SoundSensor sound = new SoundSensor(SensorPort.S2, true);
		int x = 10;
		Motor.A.setSpeed(x);
		Motor.B.setSpeed(x);

		//Motor.A.forward();
		//Motor.B.forward();

		do {

			System.out.println(sound.readValue() + ", " + x);

			if (sound.readValue() >= 70) {
				x = x + 20;
				Motor.A.setSpeed(x);
				Motor.B.setSpeed(x);
				
				Motor.A.forward();
				Motor.B.forward();
			}
			
			if (Button.ENTER.isPressed()) {
				Motor.A.stop();
				Motor.B.stop();
				break;
			}

		} while (x < 2700);
		
		System.out.println("The program has ended");
		Motor.A.stop();
		Motor.B.stop();

	}

}
