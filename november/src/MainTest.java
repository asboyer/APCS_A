import javax.swing.*;

public class MainTest {
    public static final int WIDTH = 815, HEIGHT = 800;

    public static void main(String[] args) {

        JFrame window = new JFrame("");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, WIDTH, HEIGHT);

        MainTestpanel panel = new MainTestpanel(WIDTH, HEIGHT);

        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);

        window.setVisible(true);
        window.setResizable(true);
    }
}