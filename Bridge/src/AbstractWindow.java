public abstract class AbstractWindow {
    protected AbstractWindow window;

    public AbstractWindow(ImplementationWindow win) {
        window = (AbstractWindow) win;
    }

    public void drawWindow(String title) {
        window.drawWindow(title);
    }

    public void drawButton(String title) {
        window.drawButton(title);
    }

    public abstract void draw();
}