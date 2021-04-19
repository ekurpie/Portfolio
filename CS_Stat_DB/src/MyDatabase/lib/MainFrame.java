package MyDatabase.lib;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	public MainFrame(String Title) {
		super(Title);
		
		// Set layout manager
		setLayout(new BorderLayout());
		
		
		// Create swing component
		JTextArea textArea = new JTextArea();
		JButton button = new JButton("Click me");
		
	}
}
