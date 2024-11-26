import java.awt.EventQueue;
import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;


public class AutoCustomerGui {

	//make sure all your controls are setup here, if they aren't they won't be accessible (labels you might not need to worry about)
	private JFrame frmAutomobilesales;
	private JTextField txtCustomerName;
	private JTextField txtAmount;
	private JComboBox<Object> cbxSaleType;
	private TextArea txtpOutput;
	private JButton btnSubmit;
	
	//global variables
	
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutoCustomerGui window = new AutoCustomerGui();
					window.frmAutomobilesales.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AutoCustomerGui() {
		initialize();
	}
	
	//Used to make the objects for the combobox
	private Object makeObj(final String item)  {
	     return new Object() { public String toString() { return item; } };
	}

	private AutoCustomer validateFormAndSaveObject(){
		boolean isValid = true;
		AutoCustomer current = null;
		
		//use a default error value to make them think about what they are inputting. 
		//This will reduce user input errors.
		if (cbxSaleType.getSelectedItem().toString() == "select")
		{
			isValid = false;
			JOptionPane.showMessageDialog(frmAutomobilesales, "Please select Customer Type", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		if (txtCustomerName.getText().isEmpty()){
			isValid = false;
			JOptionPane.showMessageDialog(frmAutomobilesales, "Please enter Customer Name", "Error", JOptionPane.ERROR_MESSAGE);
			//return null;
		}
		
		if (txtAmount.getText().isEmpty()){
			isValid = false;
			JOptionPane.showMessageDialog(frmAutomobilesales, "Please enter Amount", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
		}
		
		boolean isDouble = false;
		try 
		{
			Double.parseDouble(txtAmount.getText());
			isDouble = true;
		}
		catch (Exception ex)
		{
			isValid = false;
			JOptionPane.showMessageDialog(frmAutomobilesales, "Please enter a number", "Error", JOptionPane.ERROR_MESSAGE);	
			return null;
		}
		
		if (isDouble){
			if (Double.parseDouble(txtAmount.getText()) <= 0)
			{
				isValid = false;
				JOptionPane.showMessageDialog(frmAutomobilesales, "Please enter a number greater than zero", "Error", JOptionPane.ERROR_MESSAGE);					
			}
		}
		
		if (isValid){			
            current = new AutoCustomer(txtCustomerName.getText(), Double.parseDouble(txtAmount.getText()), cbxSaleType.getSelectedItem().toString());
		}
		return current;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAutomobilesales = new JFrame();
		frmAutomobilesales.setTitle("AutomobileSales");
		frmAutomobilesales.setBounds(100, 100, 340, 330);
		frmAutomobilesales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAutomobilesales.getContentPane().setLayout(null);
		
		cbxSaleType = new JComboBox<Object>();
		cbxSaleType.setBounds(199, 28, 115, 20);
		frmAutomobilesales.getContentPane().add(cbxSaleType);
		cbxSaleType.addItem(makeObj("select"));
		cbxSaleType.addItem(makeObj("employee"));
		cbxSaleType.addItem(makeObj("manager"));		
		
		txtCustomerName = new JTextField();
		txtCustomerName.setBounds(199, 59, 115, 20);
		frmAutomobilesales.getContentPane().add(txtCustomerName);
		txtCustomerName.setColumns(10);
		
		txtAmount = new JTextField();
		txtAmount.setBounds(199, 90, 115, 20);
		frmAutomobilesales.getContentPane().add(txtAmount);
		txtAmount.setColumns(10);
		
		txtpOutput = new TextArea();
		txtpOutput.setBounds(10, 155, 304, 124);
		frmAutomobilesales.getContentPane().add(txtpOutput);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				
				AutoCustomer current = validateFormAndSaveObject();
				
				if (current != null)
				{
					
					txtpOutput.setText("New Invoice: \n" + current.toString());
				}
				else
				{
					JOptionPane.showMessageDialog(frmAutomobilesales, "Invoice Not Processed.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}	
		});
		btnSubmit.setBounds(199, 121, 118, 23);
		frmAutomobilesales.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("Customer Name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(50, 62, 139, 14);
		frmAutomobilesales.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Amount:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(35, 93, 154, 14);
		frmAutomobilesales.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Customer Type:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(89, 31, 100, 14);
		frmAutomobilesales.getContentPane().add(lblNewLabel_2);
	}
}
