import javax.swing.JOptionPane;

public class Knock_Knock_Joke {

	public static void main(String[] args) {
		JOptionPane.showInputDialog("Knock-Knock");
		JOptionPane.showInputDialog("donut");
		JOptionPane.showMessageDialog(null, "Donut open it 'til Christmas! ");
		String answer;
		for (int i = 0;; i++) {

			answer = JOptionPane.showInputDialog("Do You want another knock-knock joke? (use lowercase)");
			if (answer != null && answer.equals("yes" )) {
				JOptionPane.showInputDialog("Knock-Knock");
				JOptionPane.showInputDialog("rabbit");
				JOptionPane.showMessageDialog(null, "Rabbit up carefully it's a present.");
				break;
			}

		}
	}

}
