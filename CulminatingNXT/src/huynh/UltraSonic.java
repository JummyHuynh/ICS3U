package huynh;

import lejos.nxt.Motor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

/** RobotCulminating.java
 * Rotates while there isn't an object in front
 * @author Jimmy Huynh
 * June 16th, 2017
 */
public class UltraSonic implements Behavior{

	UltrasonicSensor sonar;
	private boolean suppressed = false;

	public UltraSonic(UltrasonicSensor sonar){
		this.sonar = sonar;
	}
	
	/** Takes control
	 * @param true or false
	 * @return true or false values
	 */ 
	@Override
	public boolean takeControl() {
			return true;
	}

	/** Rotates while there is not object in front of the robot
	 * @param no parameters
	 * @return does not return
	 */ 
	@Override
	public void action () {

		sonar.continuous();
		while (sonar.getDistance() >= 50) {
			Motor.A.rotate(50);
		}
		
		Motor.A.rotate(120); // rotates more as it senses the edge

		Motor.A.stop();

		while (!suppressed) {
			Thread.yield();
		}

	}

	/** Suppresses program
	 * @param true or false
	 * @return does not return
	 */ 
	@Override
	public void suppress() {
		suppressed = true;	
	}
}
