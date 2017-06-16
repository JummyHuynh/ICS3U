package huynh;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

/** RobotCulminating.java
 * Searches for an object, runs towards it, and finds another object of the same color (will beep/buzz depending)
 * @author Jimmy Huynh
 * June 16th, 2017
 */
public class RobotCulminating {

	/** declares all the behaviours
	 * @param no parameters
	 * @return does not return
	 */ 
	public static void main(String[] args) {
		LightSensor light = new LightSensor(SensorPort.S3);
		UltrasonicSensor sonar = new UltrasonicSensor (SensorPort.S4);
		
		Behavior b3 = new ExitProgram();
		Behavior b1 = new UltraSonic(sonar);
		Behavior b2 = new TowardsObject(light, sonar);
		Behavior [] tasks = {b1, b2, b3};

		Arbitrator arb = new Arbitrator(tasks);
		arb.start();

	}

}
