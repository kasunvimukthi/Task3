package CommandPattern;

public abstract class Command {
    public Aardvark editor;
    public String xbackup;
    public String ybackup;

    Command(Aardvark editor) {
        this.editor = editor;
    }

    void backup() {
        xbackup = editor.xvalue;
        ybackup = editor.yvalue;
    }

    public void undo() {
        editor.xvalue = xbackup;
        editor.yvalue = ybackup;
    }

    public abstract boolean execute();
}