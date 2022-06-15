package MVCPattern;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SetUp extends JFrame{
	
	private JButton button = new JButton("Simples");
	
	private JButton button1 = new JButton("Not-so-simples");
	
	private JButton button2 = new JButton("Super-duper-shuffled");
	
	public SetUp(){
		// Sets up the view and adds the components
		
		JPanel setupPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 350);
		
	    button.setVerticalAlignment(SwingConstants.TOP);  // of text and icon
	    button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
	    button.setBackground(new Color(231, 240, 248));
	    button.setForeground(Color.BLUE);
	    button.setPreferredSize(new Dimension(180, 30));
	      
	    button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button, "Simples");
				}
			});
	      
	    button1.setVerticalAlignment(SwingConstants.TOP);  // of text and icon.
	    button1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
	    button1.setBackground(new Color(231, 240, 248));
	    button1.setForeground(Color.BLUE);
	    button1.setPreferredSize(new Dimension(180, 30));
	      
	    button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button1, "Not-so-simples");
				}
			});
	    
	    button2.setVerticalAlignment(SwingConstants.TOP);  // of text and icon.
	    button2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
	    button2.setBackground(new Color(231, 240, 248));
	    button2.setForeground(Color.BLUE);
	    button2.setPreferredSize(new Dimension(240, 30));
	      
	    button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button2, "Super-duper-shuffled");
				}
			});
	    
		setupPanel.add(button);
		setupPanel.add(button1);
		setupPanel.add(button2);

		this.add(setupPanel);
		
		// End of setting up the components --------
	}
}
