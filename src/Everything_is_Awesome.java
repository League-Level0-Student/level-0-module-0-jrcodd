import javax.swing.JOptionPane;

public class Everything_is_Awesome {
	
	public static void main(String[] args) {
		
		String answer;
		answer = JOptionPane.showInputDialog("What Do You Like?");
		JOptionPane.showMessageDialog(null, answer + " is awesome");
	}
}
