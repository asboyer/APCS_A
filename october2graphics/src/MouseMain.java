import javax.swing.*;

public class MouseMain {
    public static final int WIDTH = 800, HEIGHT = 800;

    public static void main(String[] args) {

        JFrame window = new JFrame("Mouse");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, WIDTH, HEIGHT); //(x, y, w, h) 22 due to title bar.

        MousePanel panel = new MousePanel(WIDTH, HEIGHT);

        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);

        window.setVisible(true);
        window.setResizable(true);
    }
}
