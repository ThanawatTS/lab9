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
		UnitConverter mainconvert = new UnitConverter();
		
		frmDfd = new JFrame();
		frmDfd.setTitle("Distance Converter");
		frmDfd.setBounds(100, 100, 680, 101);
		frmDfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDfd.getContentPane().setLayout(null);
		
	
		
		
		JComboBox unit1ComboBox = new JComboBox(Length.values());
		unit1ComboBox.setBounds(106, 11, 110, 20);
		frmDfd.getContentPane().add(unit1ComboBox);
		
		JLabel label = new JLabel("=");
		label.setBounds(226, 14, 14, 14);
		frmDfd.getContentPane().add(label);
		
		
		
		JComboBox unit2ComboBox = new JComboBox(Length.values());
		unit2ComboBox.setBounds(357, 11, 110, 20);
		frmDfd.getContentPane().add(unit2ComboBox);
		
		JRadioButton rdbtnLeftright = new JRadioButton("Left->Right");
		rdbtnLeftright.setBounds(208, 39, 109, 23);
		rdbtnLeftright.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textField_1.setEditable(false);
				textField.setEditable(true);
			}});
		frmDfd.getContentPane().add(rdbtnLeftright);
		
		JRadioButton rdbtnRightleft = new JRadioButton("Right->Left");
		rdbtnRightleft.setBounds(342, 38, 109, 23);
		rdbtnRightleft.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textField.setEditable(false);
				textField_1.setEditable(true);
		}});
		frmDfd.getContentPane().add(rdbtnRightleft);
		
		ButtonGroup radio1 = new ButtonGroup();
		radio1.add(rdbtnLeftright);
		radio1.add(rdbtnRightleft);
		
		JButton btnConvert = new JButton("Convert!");
		btnConvert.setBounds(478, 10, 89, 23);
		btnConvert.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				if(rdbtnLeftright.isSelected())
				textField_1.setText(String.valueOf(String.format("%.4f",mainconvert.convert(Double.parseDouble(textField.getText()),(Length)unit1ComboBox.getSelectedItem(), (Length)unit2ComboBox.getSelectedItem()))));
				
				else if (rdbtnRightleft.isSelected())			
				textField.setText(String.valueOf(String.format("%.4f",mainconvert.convert(Double.parseDouble(textField_1.getText()),(Length)unit2ComboBox.getSelectedItem(), (Length)unit1ComboBox.getSelectedItem()))));	
			
			}
			
		});
		
		frmDfd.getContentPane().add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(577, 10, 76, 23);
		btnClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textField_1.setText("");
				textField.setText("");
			}
		});
		frmDfd.getContentPane().add(btnClear);
		
		
		textField = new JTextField();
		textField.setBounds(10, 11, 86, 20);
		textField.addKeyListener(new KeyListener(){
			   public void keyReleased(KeyEvent e) {
			       if (e.getKeyCode()==KeyEvent.VK_ENTER){
			    		if(rdbtnLeftright.isSelected())
							textField_1.setText(String.valueOf(String.format("%.4f",mainconvert.convert(Double.parseDouble(textField.getText()),(Length)unit1ComboBox.getSelectedItem(), (Length)unit2ComboBox.getSelectedItem()))));
							
							else if (rdbtnRightleft.isSelected())			
							textField.setText(String.valueOf(String.format("%.4f",mainconvert.convert(Double.parseDouble(textField_1.getText()),(Length)unit2ComboBox.getSelectedItem(), (Length)unit1ComboBox.getSelectedItem()))));	
						
			       }
			   }
			@Override
			public void keyPressed(KeyEvent e) {
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}});
		frmDfd.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 11, 97, 20);
		textField_1.addKeyListener(new KeyListener(){
			   public void keyReleased(KeyEvent e) {
			       if (e.getKeyCode()==KeyEvent.VK_ENTER){
			    		if(rdbtnLeftright.isSelected())
							textField_1.setText(String.valueOf(String.format("%.4f",mainconvert.convert(Double.parseDouble(textField.getText()),(Length)unit1ComboBox.getSelectedItem(), (Length)unit2ComboBox.getSelectedItem()))));
							
							else if (rdbtnRightleft.isSelected())			
							textField.setText(String.valueOf(String.format("%.4f",mainconvert.convert(Double.parseDouble(textField_1.getText()),(Length)unit2ComboBox.getSelectedItem(), (Length)unit1ComboBox.getSelectedItem()))));	
						
			       }
			   }
			@Override
			public void keyPressed(KeyEvent e) {
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}});
		frmDfd.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
	}
}
