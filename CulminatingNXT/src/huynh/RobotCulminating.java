package huynh;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class RobotCulminating {

	public static void main(String[] args) {
		Behavior b4 = new ExitProgram();
		Behavior b0 = new DriveForward();
		Behavior b2 = new UltraSonic();
		Behavior b3 = new TowardsObject();
		//Behavior b2 = new Light(); b2,
		//Behavior b3 = new FollowLine(); b3,
		Behavior [] tasks = {b0, b2, b3, b4};

		Arbitrator arb = new Arbitrator(tasks);
		arb.start();

	}

}
