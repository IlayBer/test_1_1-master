import ash.college.graphics.BallPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BP extends BallPanel {
    public BP() {
        super();
        KeyListener keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    ball.move(0, -20);
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    ball.move(0, 20);
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    ball.move(20, 0);
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    ball.move(-20, 0);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
        this.addKeyListener(keyListener);
    }
}
