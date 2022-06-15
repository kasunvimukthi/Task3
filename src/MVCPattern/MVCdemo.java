package MVCPattern;

public class MVCdemo {

	public static void main(String[] args) {
		PlayerName theView = new PlayerName();
		
		name theModel = new name();
		
		nameController theController = new nameController(theView,theModel);
		
		theView.setVisible(true);

	}
}
