package CommandPattern;

import java.util.Stack;

public class CommandHistory {
	private Stack<Command> history = new Stack<>();

	public void push(Command command) {
		// TODO Auto-generated method stub
		
		history.push(command);
	}
	
    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { 
    	return history.isEmpty(); 
    	}


}
