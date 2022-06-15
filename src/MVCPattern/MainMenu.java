package MVCPattern;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MainMenu extends JFrame{

	public void PlayerName(String name) {
		// TODO Auto-generated method stub
	 JLabel label = new JLabel("Welcome " + name);
	
	 JButton button = new JButton("Play");
	
	 JButton button1 = new JButton("View High Scores");
	
	 JButton button2 = new JButton("View Rules");

	 JButton button3 = new JButton("Quit");
	
	
		// Sets up the view and adds the components
		
		JPanel setupPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 350);
		
		label.setForeground(Color.RED);
	    label.setVerticalAlignment(SwingConstants.TOP);
	    label.setPreferredSize(new Dimension(300, 50));
		
		button.setVerticalAlignment(SwingConstants.TOP);  // of text and icon
	    button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
	    button.setBackground(new Color(231, 240, 248));
	    button.setForeground(Color.BLUE);
	    button.setPreferredSize(new Dimension(180, 30));
	    
	    button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetUp set = new SetUp();
				set.setVisible(true);
			}
		});
	    
	    button1.setVerticalAlignment(SwingConstants.TOP);  // of text and icon
	    button1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
	    button1.setBackground(new Color(231, 240, 248));
	    button1.setForeground(Color.BLUE);
	    button1.setPreferredSize(new Dimension(180, 30));
	    
	    button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button1, "View High Scores");
			}
		});
	    
	    button2.setVerticalAlignment(SwingConstants.TOP);  // of text and icon
	    button2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
	    button2.setBackground(new Color(231, 240, 248));
	    button2.setForeground(Color.BLUE);
	    button2.setPreferredSize(new Dimension(180, 30));
	    
	    button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button2, "View Rules");
			}
		});
	    
	    button3.setVerticalAlignment(SwingConstants.TOP);  // of text and icon
	    button3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
	    button3.setBackground(new Color(231, 240, 248));
	    button3.setForeground(Color.BLUE);
	    button3.setPreferredSize(new Dimension(180, 30));
	    
	    setupPanel.add(label);
		setupPanel.add(button);
		setupPanel.add(button1);
		setupPanel.add(button2);
		setupPanel.add(button3);

		this.add(setupPanel);
		
		// End of setting up the components --------
	}


		
	
	
}
