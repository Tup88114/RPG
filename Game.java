import java.awt.*;
import javax.swing.*;

public class Game {
    public static void main(String[] args) {
        //Create a JFrame
        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        
        //Create a JPanel
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        
        //Make the frame visible
        frame.setVisible(true);
    }
}