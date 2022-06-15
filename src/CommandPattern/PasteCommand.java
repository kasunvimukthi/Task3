package CommandPattern;

public class PasteCommand extends Command{

	public PasteCommand(Aardvark editor) {
		super(editor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute() {
		 if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

	        backup();
	        return true;
	}

}
