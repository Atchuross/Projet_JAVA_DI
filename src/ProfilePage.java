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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ProfilePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ProfilePage(String heroName ,String firstname, String lastname, String picture, Integer AID) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\cleme\\eclipse-workspace\\JAVA_DI local files\\img\\icons8-avengers-26.png"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 991, 552);
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
		if(AID == 1) {
			JButton mesMission = new JButton("Voir mes missions");
			mesMission.setBounds(112, 214, 220, 92);
			contentPane.add(mesMission);
			
			JButton btnMissing1 = new JButton("??");
			btnMissing1.setBounds(112, 355, 220, 92);
			contentPane.add(btnMissing1);
			
			JButton btnMissing2 = new JButton("??");
			btnMissing2.setBounds(376, 214, 220, 92);
			contentPane.add(btnMissing2);
			
			JButton btnMissing3 = new JButton("??");
			btnMissing3.setBounds(376, 355, 220, 92);
			contentPane.add(btnMissing3);
			
			JButton waitingMission = new JButton("3 Mission en attente");
			waitingMission.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					MissionAttente frame = new MissionAttente();
					frame.setVisible(true);	
				}
				
			});
			waitingMission.setBounds(634, 214, 220, 92);
			contentPane.add(waitingMission);
			
			JButton Litige = new JButton("3 Litige en cours");
			Litige.setBounds(634, 355, 220, 92);
			contentPane.add(Litige);
		}
		else {
		JButton mesMission = new JButton("Voir mes missions");
		mesMission.setBounds(154, 214, 220, 92);
		contentPane.add(mesMission);
		
		JButton btnMissing1 = new JButton("??");
		btnMissing1.setBounds(154, 355, 220, 92);
		contentPane.add(btnMissing1);
		
		JButton btnMissing2 = new JButton("??");
		btnMissing2.setBounds(572, 214, 220, 92);
		contentPane.add(btnMissing2);
		
		JButton btnMissing3 = new JButton("??");
		btnMissing3.setBounds(572, 355, 220, 92);
		contentPane.add(btnMissing3);
		}
	}
}
