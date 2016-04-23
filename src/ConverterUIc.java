
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ConverterUIc extends JFrame {
private UnitConverter unitconverter;
private JButton convert,Clear;
private JComboBox unit1ComboBox,unit2ComboBox;
private JTextField Putnumber,result;
private JLabel equal;
private JFrame Title;
private JPanel panel;
//....
public ConverterUIc (UnitConverter uc){
	this.unitconverter = uc;
	this.setTitle("Length Converter");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	initComponents();
	
}
private void initComponents(){
setVisible(true);
panel = new JPanel();
Title = new JFrame("Distance Converter");
Putnumber = new JTextField(20);
unit1ComboBox = new JComboBox();
equal = new JLabel ("=");
result = new JTextField ();
unit2ComboBox = new JComboBox();
convert = new JButton ("Convert!");

Clear = new JButton ("Clear");
panel.add(Title);
panel.add(Putnumber);
panel.add(unit1ComboBox);
panel.add(equal);
panel.add(result);
panel.add(unit2ComboBox);
panel.add(convert);
panel.add(Clear);

	
}
}
