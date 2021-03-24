public class AlertWindow extends AbstractWindow {

    public AlertWindow(ImplementationWindow win) {
        super(win);
    }

    @Override
    public void draw() {
        drawWindow("Alert Window");
        drawButton("Ok button");
    }

}