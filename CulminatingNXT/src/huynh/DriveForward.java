package huynh;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class DriveForward implements Behavior{
	private boolean suppressed = false;

	@Override
	public boolean takeControl() {
		return true;
	}

	@Override
	public void action() {
		Motor.A.forward();
		Motor.B.forward();

		while (!suppressed) {
			Thread.yield();
		}
		
		Motor.A.stop();
		Motor.B.stop();
	}

	@Override
	public void suppress() {
		suppressed = true;	
	}
}
