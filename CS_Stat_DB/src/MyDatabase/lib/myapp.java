package MyDatabase.lib;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

public class myapp {

	private JFrame frame;
	private JTextField txtUrl;
	private JTextField txtDatabaseName;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myapp window = new myapp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1399, 888);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		txtUrl = new JTextField();
		txtUrl.setText("URL");
		GridBagConstraints gbc_txtUrl = new GridBagConstraints();
		gbc_txtUrl.insets = new Insets(0, 0, 5, 0);
		gbc_txtUrl.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUrl.gridx = 0;
		gbc_txtUrl.gridy = 0;
		frame.getContentPane().add(txtUrl, gbc_txtUrl);
		txtUrl.setColumns(10);
		
		txtDatabaseName = new JTextField();
		txtDatabaseName.setText("Database name");
		GridBagConstraints gbc_txtDatabaseName = new GridBagConstraints();
		gbc_txtDatabaseName.insets = new Insets(0, 0, 5, 0);
		gbc_txtDatabaseName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDatabaseName.gridx = 0;
		gbc_txtDatabaseName.gridy = 1;
		frame.getContentPane().add(txtDatabaseName, gbc_txtDatabaseName);
		txtDatabaseName.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		GridBagConstraints gbc_txtUsername = new GridBagConstraints();
		gbc_txtUsername.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsername.gridx = 0;
		gbc_txtUsername.gridy = 2;
		frame.getContentPane().add(txtUsername, gbc_txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		GridBagConstraints gbc_txtPassword = new GridBagConstraints();
		gbc_txtPassword.insets = new Insets(0, 0, 5, 0);
		gbc_txtPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPassword.gridx = 0;
		gbc_txtPassword.gridy = 3;
		frame.getContentPane().add(txtPassword, gbc_txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnEnterDatabase = new JButton("Enter Database");
		GridBagConstraints gbc_btnEnterDatabase = new GridBagConstraints();
		gbc_btnEnterDatabase.gridx = 0;
		gbc_btnEnterDatabase.gridy = 14;
		frame.getContentPane().add(btnEnterDatabase, gbc_btnEnterDatabase);
	}

}
