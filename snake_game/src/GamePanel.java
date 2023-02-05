/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;*/
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;
import java.awt.Color;
import java.awt.event.KeyAdapter;

public class GamePanel extends JPanel implements AncestorListener {

    static final int SCREEN_WIDTH =600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_size = 25;
    static final int GAMR_UNITS = (SCREEN_HEIGHT*SCREEN_WIDTH)/UNIT_size;
    static final int DELAY = 75;
    final int x[] = new int [GAMR_UNITS];
    final int y[] = new int [GAMR_UNITS];
    int bodyPstyd = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    private void setPreferredSize(Dimension dimension) {
    }

    public void startGame() {

    }

    public void paintComponent(Graphics g) {

    }

    public void draw(Graphics g) {

    }

    public void mave() {

    }

    public void checkApple(){

    }
    public void checkCollisions(){

    }
    public void gameOver(Graphics g){

    }


    @Override
    public void ancestorAdded(AncestorEvent event) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ancestorMoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

        }

    }
    
}
