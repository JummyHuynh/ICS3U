package huynh;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class UltraSonic implements Behavior{

	UltrasonicSensor sonar = new UltrasonicSensor (SensorPort.S4);
	private boolean suppressed = false;

	@Override
	public boolean takeControl() {
		sonar.ping();
		Delay.msDelay(200);

		if (sonar.getDistance() >= 50)
			return true;	
		return false;
	}

	@Override
	public void action () {
		sonar.ping();
		Delay.msDelay(200);

		int x = sonar.getDistance();
		while (x >= 50) {
			Motor.A.rotate(50);

			sonar.ping();
			Delay.msDelay(200);
			x = sonar.getDistance();
		}

		Motor.A.rotate(50);

		sonar.continuous();
		x = sonar.getDistance();
		
		while (x >= 25) {
			Motor.A.forward();
			Motor.B.forward();
			
			x = sonar.getDistance();
		}

		Motor.A.stop();
		Motor.B.stop();
		
		Sound.beep();
		Sound.beep();
		
		while (!suppressed) {
			Thread.yield();
		}

	}

	@Override
	public void suppress() {
		suppressed = true;	
	}
}
