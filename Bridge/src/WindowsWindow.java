public class WindowsWindow implements ImplementationWindow {
    @Override
    public void drawWindow(String title) {
        System.out.println(title + " - Windows window");
    }

    @Override
    public void drawButton(String title) {
        System.out.println(title + " - Windows Button");
    }

}