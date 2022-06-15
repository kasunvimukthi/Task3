package MVCPattern;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PlayerName extends JFrame{

	private JLabel label = new JLabel("<html>Welcome To Abominodo - The Best Dominoes Puzzle Game in the Universe\"\r\n"
			+ "+ \"<BR>Version 1.0 (c), Kevan Buckley, 2010<BR></html");
	
	private JTextField name = new JTextField(10);
	
	private JButton button = new JButton("Setup Profile");
	
	public String player = null;
	
	public PlayerName(){
		// Sets up the view and adds the components
		
		JPanel setupPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 150);
		
		label.setForeground(Color.RED);
	    label.setVerticalAlignment(SwingConstants.TOP);
	    label.setPreferredSize(new Dimension(300, 50));

		name.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 12));
	    name.setForeground(Color.BLACK);
	    name.setPreferredSize(new Dimension(300, 30));
	    name.setToolTipText("Enter Your Name Here");
	    
	    button.setHorizontalTextPosition(SwingConstants.CENTER); // of text relative to icon
	    button.setVerticalTextPosition(SwingConstants.TOP);    // of text relative to icon
	    button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
	    button.setBackground(new Color(231, 240, 248));
	    button.setForeground(Color.BLUE);
	    button.setPreferredSize(new Dimension(300, 30));
	    
	    setupPanel.add(label);
		setupPanel.add(name);
		setupPanel.add(button);

		this.add(setupPanel);
		
		// End of setting up the components --------

	}
	
	public String getname(){
		return name.getText();

	}
	
	public void setName(String player) {
		JOptionPane.showMessageDialog(this, "Your Name " + player);
		
	}
	
	public void addNameListener(ActionListener listenForButton){
		button.addActionListener(listenForButton);

	}


	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);

	}

	   
}
