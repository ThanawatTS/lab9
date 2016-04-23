import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConverterUI {

	private JFrame frmDfd;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterUI window = new ConverterUI();
					window.frmDfd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConverterUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDfd = new JFrame();
		frmDfd.setTitle("Distance Converter");
		frmDfd.setBounds(100, 100, 666, 76);
		frmDfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDfd.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 86, 20);
		frmDfd.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(106, 11, 110, 20);
		frmDfd.getContentPane().add(comboBox);
		
		JLabel label = new JLabel("=");
		label.setBounds(226, 14, 14, 14);
		frmDfd.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 11, 97, 20);
		frmDfd.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(357, 11, 110, 20);
		frmDfd.getContentPane().add(comboBox_1);
		
		JButton btnConvert = new JButton("Convert!");
		btnConvert.setBounds(478, 10, 89, 23);
		frmDfd.getContentPane().add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(577, 10, 63, 23);
		frmDfd.getContentPane().add(btnClear);
	}
}
