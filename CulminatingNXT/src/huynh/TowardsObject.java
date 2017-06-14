package huynh;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

public class TowardsObject implements Behavior {

	LightSensor light = new LightSensor(SensorPort.S3);
	UltrasonicSensor sonar = new UltrasonicSensor (SensorPort.S4);

	private boolean suppressed = false;


	@Override
	public boolean takeControl() {
		sonar.continuous();

		if (sonar.getDistance() <= 25)
			return true;
		return false;
	}

	@Override
	public void action() {

		Sound.buzz();

		int x = light.getLightValue();

		Motor.A.backward();
		Motor.B.backward();
		
		Motor.A.rotate(50);

		
		while (sonar.getDistance() > 50) {
			Motor.A.rotate(10);	
		}

		sonar.continuous();
		while (sonar.getDistance() <= 25) {
			Motor.A.forward();
			Motor.B.forward();
		}
		
		Motor.A.stop();
		Motor.B.stop();

		if (light.getLightValue() == x) {
			Sound.buzz();
			Sound.buzz();
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
