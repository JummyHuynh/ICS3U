package huynh;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

public class Light implements Behavior {

	LightSensor light = new LightSensor(SensorPort.S3);

	private boolean suppressed = false;

	@Override
	public boolean takeControl() {
		return true;
	}

	@Override
	public void action() {
		suppressed = false;
		// red color
		if (light.getLightValue() > 50) {
			//grab
		}

		if (light.getLightValue() <= 50) {
			// grab
		}

		while (!suppressed) {
			Thread.yield();
		}

	}

	@Override
	public void suppress() {
		suppressed = true;
	}

}
