package ccc.app.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;

public class LoginFrame extends JFrame {

	public static Image user_Icon=new ImageIcon("images/userIcon.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	public static Image password_Icon=new ImageIcon("images/passIcon.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	public static Image forget_password_Icon=new ImageIcon("images/forgetPasswordIcon.png").getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtpassword;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 365);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(160, 29, 371, 268);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel username_panel = new JPanel();
		username_panel.setBackground(new Color(255, 255, 255));
		username_panel.setBounds(63, 69, 261, 33);
		panel.add(username_panel);
		username_panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else
				{
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if(txtUsername.getText().equals(""))
				{
					txtUsername.setText("Username");
				}
			}
		});
		txtUsername.setText("Username");
		txtUsername.setToolTipText("");
		txtUsername.setBorder(null);
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setBounds(10, 0, 156, 31);
		username_panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsernameIcon = new JLabel("New label");
		lblUsernameIcon.setBounds(228, 0, 33, 33);
		lblUsernameIcon.setIcon(new ImageIcon(user_Icon));
		username_panel.add(lblUsernameIcon);
		
		JPanel password_panel = new JPanel();
		password_panel.setBackground(new Color(255, 255, 255));
		password_panel.setBounds(63, 113, 261, 33);
		panel.add(password_panel);
		password_panel.setLayout(null);
		
		JLabel lblPasswordIcon = new JLabel("New label");
		lblPasswordIcon.setBounds(228, 0, 33, 31);
		lblPasswordIcon.setIcon(new ImageIcon(password_Icon));
		password_panel.add(lblPasswordIcon);
		
		txtpassword = new JPasswordField();
		txtpassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(txtpassword.getText().equals("Password")) {
					txtpassword.setEchoChar('●');
					txtpassword.setText("");
				}
				else
				{
					txtpassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if(txtpassword.getText().equals(""))
				{
					txtpassword.setText("Password");
					txtpassword.setEchoChar((char)0);
				}
			}
		});
		txtpassword.setBorder(null);
		txtpassword.setEchoChar((char)0);
		txtpassword.setText("Password");
		txtpassword.setBounds(10, 0, 156, 31);
		password_panel.add(txtpassword);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.setVerifyInputWhenFocusTarget(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(txtUsername.getText().equals("admin") && txtpassword.getText().equals("admin123"))
				{
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				}
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username"))
				{
					lblLoginMessage.setText("Username required !");
				}
				else if(txtpassword.getText().equals("") || txtpassword.getText().equals("Password"))
				{
					lblLoginMessage.setText("Password required !");
				}
				else
				{
					lblLoginMessage.setText("Invalid username & password !");
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(0,255,204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(0,255,255));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setBackground(new Color(0,255,204));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnNewButton.setBackground(new Color(0,255,255));
			}
		});
		btnNewButton.setBounds(63, 190, 261, 33);
		panel.add(btnNewButton);
		
		lblLoginMessage.setForeground(new Color(128, 0, 0));
		lblLoginMessage.setBounds(63, 168, 261, 15);
		panel.add(lblLoginMessage);
		
		JLabel forgetPassIcon = new JLabel("");
		forgetPassIcon.setBounds(10, 234, 36, 23);
		forgetPassIcon.setIcon(new ImageIcon(forget_password_Icon));
		panel.add(forgetPassIcon);
		
		JLabel lblforgotPassword = new JLabel("Forgot your password ?");
		lblforgotPassword.setForeground(new Color(204, 0, 204));
		lblforgotPassword.setBounds(34, 234, 142, 23);
		panel.add(lblforgotPassword);
		
		JLabel lblCreateAccount = new JLabel("Create an account");
		lblCreateAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblCreateAccount.setForeground(new Color(204, 255, 255));
		lblCreateAccount.setBounds(228, 234, 133, 23);
		panel.add(lblCreateAccount);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					LoginFrame.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(Color.black);
			}
			
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(647, 0, 32, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(179, 266, 32, 20);
		contentPane.add(lblNewLabel_1);
	}
}
