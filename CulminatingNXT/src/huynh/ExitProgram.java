package huynh;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

/** RobotCulminating.java
 * Closes the program
 * @author Jimmy Huynh
 * June 16th, 2017
 */
public class ExitProgram implements Behavior{

	/** Takes control
	 * @param true or false
	 * @return true or false values
	 */ 
	@Override
	public boolean takeControl() {
		if (Button.ESCAPE.isDown()) 
			return true;
		
		return false;
	}
	
	/** Exits program
	 * @param true or false
	 * @return does not return
	 */ 
	@Override
	public void action () {
		System.exit(0);
	}

	/** Suppresses program
	 * @param true or false
	 * @return does not return
	 */ 
	@Override
	public void suppress() {
		
	}

}
