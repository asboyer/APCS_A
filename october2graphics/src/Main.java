import javax.swing.*;

public class Main {

    public static final int WIDTH = 800, HEIGHT = 800;

    public static void main(String[] args) {

        JFrame window = new JFrame("");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, WIDTH+22, HEIGHT+22); //(x, y, w, h) 22 due to title bar.

        MyPanel panel = new MyPanel(WIDTH, HEIGHT);

        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);

        window.setVisible(true);
        window.setResizable(true);
    }
}