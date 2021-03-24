public class LinuxWindow implements ImplementationWindow {
    @Override
    public void drawWindow(String title) {
        System.out.println(title + " - Linux window");
    }

    @Override
    public void drawButton(String title) {
        System.out.println(title + " - Linux Button");
    }

}