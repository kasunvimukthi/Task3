package MVCPattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class nameController {

	private PlayerName theView;
	
	private name theModel;
	private MainMenu view;

	
	public nameController(PlayerName theView, name theModel) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addNameListener(new Player());
	
	}
	
	class Player implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String name = "";
			name = theView.getname();
			theModel.setName(name);
			
			if(name.isEmpty()) {
				theView.displayErrorMessage("Please Enter Your Name");
			}else {
				
				theView.setName(theModel.getName());
				
				MainMenu menu = new MainMenu();
				menu.PlayerName(theModel.getName());
				menu.setVisible(true);
			}

		}
		
	}
	
}
