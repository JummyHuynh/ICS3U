package huynh;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class ExitProgram implements Behavior{

	@Override
	public boolean takeControl() {
		if (Button.ESCAPE.isDown()) 
			return true;
		
		return false;
	}
	
	@Override
	public void action () {
		System.exit(0);
	}

	@Override
	public void suppress() {
		
	}

}
