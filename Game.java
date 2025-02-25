import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Game extends JPanel {
    private int dimX, dimY;
    private final int tileSize = 50;
    private final int moveTile = 50;

    public Game() {
        setPreferredSize(new Dimension(1000, 600));
        setBackground(Color.BLACK);
        dimX = (1000 - tileSize) / 2;
        dimY = (600 - tileSize) / 2;

        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                switch (key) {
                    case KeyEvent.VK_W -> {
                        if (dimY - moveTile >= 0) 
                            dimY -= moveTile;
                    }
                    case KeyEvent.VK_S -> {
                        if (dimY + moveTile + tileSize <= 600) 
                            dimY += moveTile;
                    }
                    case KeyEvent.VK_A -> {
                        if (dimX - moveTile >= 0) 
                            dimX -= moveTile;
                    }
                    case KeyEvent.VK_D -> {
                        if (dimX + moveTile + tileSize <= 1000)
                            dimX += moveTile;
                    }
                }
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics player) {
        super.paintComponent(player);
        player.setColor(Color.RED);
        player.fillRect(dimX, dimY, tileSize, tileSize);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RPG Game");
        Game game = new Game();
        frame.add(game);
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}