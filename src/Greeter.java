import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name;
		
name = JOptionPane.showInputDialog("What is Your Name?");
JOptionPane.showMessageDialog(null, "Nice to meet you " + name);
	}
}
