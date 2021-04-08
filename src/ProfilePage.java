import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class ProfilePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProfilePage(String heroName ,String firstname, String lastname, String picture) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\cleme\\eclipse-workspace\\JAVA_DI local files\\img\\icons8-avengers-26.png"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource(picture)).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(67, 35, 114, 127);
		contentPane.add(lblNewLabel);
		
		JLabel nameField = new JLabel(heroName + " - " + firstname + " " + lastname);
		nameField.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		nameField.setBounds(168, 64, 265, 40);
		contentPane.add(nameField);
		
		JLabel missionLabel = new JLabel("Nmbr de mission : ");
		missionLabel.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
		missionLabel.setBounds(168, 107, 170, 20);
		contentPane.add(missionLabel);
		
		JLabel lblNewLabel_1 = new JLabel("100");
		lblNewLabel_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(331, 107, 53, 25);
		contentPane.add(lblNewLabel_1);
	}
}
