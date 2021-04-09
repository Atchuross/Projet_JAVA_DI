import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;


public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setTitle("CRMvenger | connexion");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\cleme\\eclipse-workspace\\JAVA_DI local files\\img\\icons8-avengers-26.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usernameField = new JTextField();
		usernameField.setBounds(347, 102, 158, 40);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(224, 107, 78, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mot de passe");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(224, 176, 113, 27);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="select * from users where username=? and password=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, usernameField.getText());
					pst.setString(2, passwordField.getText());
					
					ResultSet rs=pst.executeQuery();
					String heroName = rs.getString("nomHero");
					String firstname = rs.getString("firstname");
					String lastname = rs.getString("lastname");
					String picture = rs.getString("icon");
					Integer AID = rs.getInt("AID");
					int count=0;
					while(rs.next()) {
						count++;
					}
					if(count == 1) {
						ProfilePage page=new ProfilePage(heroName, firstname, lastname, picture, AID);
			            page.setVisible(true);
			            JLabel label = new JLabel("Welcome: ");
			            page.getContentPane().add(label);
			            setVisible(false); //you can't see me!
			            dispose();
					}else if(count > 1) {
						JOptionPane.showMessageDialog (null, "Désolé vos identifiant sont identique a un autre contacter le support");
					}else {
						JOptionPane.showMessageDialog (null, "Nom d'utilisateur ou mot de pass incorrect, Réessayer");
					}
				}catch(Exception e) {
					JOptionPane.showMessageDialog (null, e);
				}
			}
		});
		btnNewButton.setBounds(224, 288, 113, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(22, 69, 160, 171);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(347, 171, 158, 40);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(22, 78, 158, 162);
		contentPane.add(lblNewLabel_3);
		
		connection=sqliteConnection.dbConnector();
	}
}
