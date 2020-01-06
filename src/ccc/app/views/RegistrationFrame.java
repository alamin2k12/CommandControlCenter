package ccc.app.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegistrationFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationFrame frame = new RegistrationFrame();
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
	public RegistrationFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelRegisHeader = new JPanel();
		panelRegisHeader.setBounds(0, 0, 605, 54);
		panelRegisHeader.setBackground(new Color(153, 153, 255));
		contentPane.add(panelRegisHeader);
		panelRegisHeader.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(306, 14, 1, 1);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(10, 0, 91, 28);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(111, 4, 112, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(312, 14, 1, 1);
		panel.setLayout(null);
		contentPane.add(panel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(56, 0, 50, 28);
		panel.add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(127, 4, 103, 20);
		panel.add(textField_1);
	}

}
