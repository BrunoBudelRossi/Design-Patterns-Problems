public class Main {
    public static void main(String[] args) {
        AbstractWindow window = new DialogWindow(new LinuxWindow());
        window.draw();
        window = new AlertWindow(new LinuxWindow());
        window.draw();

        window = new DialogWindow(new WindowsWindow());
        window.draw();
    }
}
