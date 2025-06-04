import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Runnable{

    //그래프 기본값
    private final int windowHEIGHT = 800;
    private final int windowWIDETH = 1200;
    int defaultX = windowWIDETH / 2;
    int defaultY = windowHEIGHT / 2;

    public double Wangle = 0.01;
    public double Wunder = 2;

    public Panel() {
        this.setPreferredSize(new Dimension(windowWIDETH, windowHEIGHT));
        this.setDoubleBuffered(true);
        this.setBackground(Color.WHITE);
    }
    public void startThread() {
        Thread thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        while(true) {

            while(true) {
                Wunder = Wunder - 0.0001;
                repaint();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.drawLine(windowWIDETH / 2, 0, windowWIDETH / 2, windowHEIGHT );
        g.drawLine(0 ,windowHEIGHT / 2 , windowWIDETH,windowHEIGHT / 2);
        for (int i = 0; i < Math.max(windowHEIGHT, windowWIDETH); i++) {
            g.setColor(Color.BLACK);
            g.drawRect(i * 20, MathFunctions.tanFunction(i, 50, defaultX, defaultY), 1 ,1);
            g.drawString(String.valueOf(Wunder), 100, 100);
        }


    }
}
