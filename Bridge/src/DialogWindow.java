public class DialogWindow extends AbstractWindow {

    public DialogWindow(ImplementationWindow win) {
        super(win);
    }

    @Override
    public void draw() {
        drawWindow("Dialog Window");
        drawButton("Yes button");
        drawButton("No button");
        drawButton("cancel button");
    }

}