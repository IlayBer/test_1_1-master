import ash.college.graphics.Ball;
import ash.college.graphics.BallKeyListener;
import org.jetbrains.annotations.NotNull;

import java.awt.event.KeyEvent;

public class BKL extends BallKeyListener {
    public BKL(Ball ball) {
        super(ball);
    }

    @Override
    public void keyPressed(@NotNull KeyEvent e){
        super.keyPressed(e);
        if (e.getKeyCode() == KeyEvent.VK_UP &&ball.getY()>=0) {
            ball.move(0, -15);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN &&ball.getY()<=400) {
            ball.move(0, 15);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT &&ball.getX()<=400) {
            ball.move(15, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT &&ball.getX()>=0) {
            ball.move(-15, 0);
        }
    }
}
