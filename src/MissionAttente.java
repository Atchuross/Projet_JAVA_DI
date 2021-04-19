import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class MissionAttente extends JFrame {

	private JPanel contentPane;
	Connection connection=null;
	private JList listName;
	private JPanel paneTest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MissionAttente frame = new MissionAttente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	private void loadList() {
			
			DefaultListModel m = new DefaultListModel();
			try {
				String query="SELECT * FROM mission";
				PreparedStatement pst=connection.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				rs=pst.executeQuery();
				
				while(rs.next()) {
					m.addElement(rs.getString("titre"));
				}
				listName.setModel(m);
				System.out.print(m);
				pst.close();
				rs.close();
			}catch(Exception e) {
				JOptionPane.showMessageDialog (null, e);
			}
		}
	
	private void testList() {
		int j = 0;
		for(int i=0;i<20;i++) {
			paneTest = new testPannel();
			contentPane.add(paneTest);
			paneTest.setBounds(10, j, 450, 90);
			j = j + 120;			
		}
	}

	/**
	 * Create the frame.
	 */
	public MissionAttente() {
		connection=sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*listName = new JList();
		listName.setBounds(10, 11, 392, 239);
		contentPane.add(listName);
		listName.setFixedCellHeight(50);*/
		
		
		
		
		/*JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 239);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(listName);*/
		
		
		testList();
		//loadList();
	}
}
