import javax.swing.*;

class Main extends JFrame {
    public Main() {
        this.setTitle("Draw Graphs");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        Panel panel = new Panel();
        this.add(panel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        panel.startThread();
    }
    public static void main(String[] args) {
        new Main();
    }

}