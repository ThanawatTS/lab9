import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Auto_detect {

	private JFrame frame;
	private JFrame Convert;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Auto_detect window = new Auto_detect();
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
	public Auto_detect() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
UnitConverter mainconvert = new UnitConverter();
		
		frame = new JFrame();
		frame.setTitle("Distance Converter");
		frame.setBounds(100, 100, 612, 101);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		
		
		
		JComboBox unit1ComboBox = new JComboBox(Length.values());
		unit1ComboBox.setBounds(106, 11, 110, 20);
		frame.getContentPane().add(unit1ComboBox);
		
		JLabel label = new JLabel("=");
		label.setBounds(226, 14, 14, 14);
		frame.getContentPane().add(label);
		
		
		
		JComboBox unit2ComboBox = new JComboBox(Length.values());
		unit2ComboBox.setBounds(357, 11, 110, 20);
		frame.getContentPane().add(unit2ComboBox);
		
		JRadioButton radioLtoR = new JRadioButton("Left->Right");
		radioLtoR.setBounds(208, 39, 109, 23);
		radioLtoR.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textField_2.setEditable(false);
				textField.setEditable(true);
				textField_2.setText(String.valueOf(String.format("%.4f",mainconvert.convert(Double.parseDouble(textField.getText()),(Length)unit1ComboBox.getSelectedItem(), (Length)unit2ComboBox.getSelectedItem()))));
				
			}});
		frame.getContentPane().add(radioLtoR);
		
		JRadioButton radioRtoL = new JRadioButton("Right->Left");
		radioRtoL.setBounds(342, 38, 109, 23);
		radioRtoL.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textField.setEditable(false);
				textField_2.setEditable(true);
				textField.setText(String.valueOf(String.format("%.4f",mainconvert.convert(Double.parseDouble(textField_2.getText()),(Length)unit2ComboBox.getSelectedItem(), (Length)unit1ComboBox.getSelectedItem()))));	
				
		}});
		frame.getContentPane().add(radioRtoL);
		
		ButtonGroup radio1 = new ButtonGroup();
		radio1.add(radioLtoR);
		radio1.add(radioRtoL);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(497, 10, 76, 23);
		btnClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textField_2.setText("");
				textField.setText("");
			}
		});
		frame.getContentPane().add(btnClear);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(250, 11, 97, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
	}

}
