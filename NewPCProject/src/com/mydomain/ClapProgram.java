package com.mydomain;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.util.Delay;

/**ClapProgram.java
 * Tests out the sound sensor and rotates when you clap
 * June 5, 2017
 * @author Jimmy Huynh & Ethan Zhou
 */
public class ClapProgram {

	public static void main(String[] args) {
		
		SoundSensor sound = new SoundSensor(SensorPort.S2, true);
		boolean x = false;
		do {
			int clap1 = sound.readValue();
			Delay.msDelay(400);
			int clap2 = sound.readValue();
			System.out.println(sound.readValue());
			if (clap1 > 70 && clap2 > 50){
				Motor.A.rotate(200);
				x = true;
			}
			
		} while (x == false);
		

	}

}
