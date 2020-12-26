package demo11;

import javax.swing.JOptionPane;

public class NonHumansException extends Exception {
String message;
	public NonHumansException(String message) {
		// TODO Auto-generated constructor stub
	
	super (message);
	this.message=message;
	
	}
@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
JOptionPane.showMessageDialog(null, message, "∑¢…˙“Ï≥£", JOptionPane.ERROR_MESSAGE);
	}
}
