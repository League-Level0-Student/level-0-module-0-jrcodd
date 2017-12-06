import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Robot_Graffiti {

	public static void main(String[] args) {
		Robot robbie = new Robot("mini");
		robbie.setPenColor(255, 0, 0);
		robbie.setSpeed(20);
		robbie.penDown();
		robbie.turn(90);
		robbie.move(100);
		robbie.setAngle(-90);
		robbie.move(200);
		robbie.move(-100);
		robbie.turn(-90);
		robbie.move(250);
		robbie.turn(90);
		robbie.move(100);
		robbie.moveTo(750, 300);
		robbie.setPenColor(Color.GREEN);
		robbie.move(100);
		robbie.turn(-45);
		robbie.move(25);
		robbie.turn(-45);
		robbie.move(210);
		robbie.turn(-45);
		robbie.move(25);
		robbie.turn(-45);
		robbie.move(100);
		robbie.penUp();
		robbie.move(1000);
	}
}
