package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;

/**UltrasonicSensorProgram.java
 * Tests out the ultrasonic sensor
 * June 5, 2017
 * @author Jimmy Huynh & Ethan Zhou
 */
public class UltrasonicSensorProgram {

	public static void main(String[] args) {

		UltrasonicSensor ultra = new UltrasonicSensor (SensorPort.S4);
		Motor.A.setSpeed(150);
		Motor.B.setSpeed(150);

		ultra.ping();
		Delay.msDelay(20);

		System.out.println("Starting: " + ultra.getDistance());
		
		while (ultra.getDistance() >= 40) {	

			Motor.A.forward();
			Motor.B.forward();
			
			ultra.continuous();
			System.out.println(ultra.getDistance());


			while (ultra.getDistance() < 40) {
			
				System.out.println("Rotating: " + ultra.getDistance());
				
				Motor.A.stop();
				Motor.B.stop();

				Motor.B.rotate(250);	
			
			}
		
			ultra.ping();
			Delay.msDelay(20);
			
			System.out.println("Restart: " + ultra.getDistance());			

		}

		Motor.A.stop();
		Motor.B.stop();
		System.out.println("The program has ended");
		
	}

}
