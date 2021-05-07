import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

	Main(){
		
	}
	
	public static void main(String[] args) {
		LoginForm frame = new LoginForm();
		frame.setVisible(true);
    }
	
	@Override
    public void actionPerformed(ActionEvent ae) {
    }
}
