import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint{
public static void main(String[] args) {
	String color;
	color = JOptionPane.showInputDialog("What is your favorite color");
 JOptionPane.showMessageDialog(null, color + " is also my favorite color");
Robot robbie = new Robot();
robbie.setSpeed(10);
robbie.penDown();
robbie.turn(30);

for (int i = 0; i < 3; i++) {
	robbie.move(100);
	robbie.turn(120);
	
}
}


}


