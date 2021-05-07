import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class testPannel extends JPanel {

	/**
	 * Create the panel.
	 */
	public testPannel() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Test");
		lblNewLabel.setBounds(10, 37, 46, 14);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("x2 Test");
		btnNewButton.setBounds(336, 33, 89, 23);
		add(btnNewButton);

	}
}
