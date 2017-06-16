package huynh;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.Sound;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

/** RobotCulminating.java
 * Detects the objects in front
 * @author Jimmy Huynh
 * June 16th, 2017
 */
public class TowardsObject implements Behavior {

	LightSensor light;
	UltrasonicSensor sonar;
	
	private boolean suppressed = false;

	public TowardsObject(LightSensor ls, UltrasonicSensor us){
		this.light = ls;
		this.sonar = us;
	}

	/** Takes control
	 * @param true or false
	 * @return true or false values
	 */ 
	@Override
	public boolean takeControl() {
		sonar.continuous();

		if (sonar.getDistance() < 50)
			return true;
		return false;
	}

	/** Scans the object's light value and compares to another
	 * @param no parameters
	 * @return does not return
	 */ 
	@Override
	public void action() {

		while (sonar.getDistance() >= 23) {
			Motor.A.forward();
			Motor.B.forward();
		}

		int x = light.getLightValue();

		Motor.A.backward();
		Motor.B.backward();

		Motor.A.rotate(200);

		int y = sonar.getDistance();
		while (y > 50) {
			Motor.A.rotate(40);
			y = sonar.getDistance();
		}

		int z = sonar.getDistance();
		while (z >= 23) {
			Motor.A.forward();
			Motor.B.forward();
			z = sonar.getDistance();
		}

		Motor.A.stop();
		Motor.B.stop();
		
		if (light.getLightValue() >= (x-5) && light.getLightValue() <= (x+5))
			Sound.beep();
		else 
			Sound.buzz();

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
