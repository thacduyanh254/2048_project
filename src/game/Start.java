//hdsd
//thay new game() o main = game.Start gs=new game.Start();

package game;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

public class Start{
    JFrame frame =new JFrame();
    JPanel gsPU=new JPanel();
    JButton startBT=new JButton("New Game");
    String mes="2048";
    public Start(){
        frame.setSize(new Dimension(375,450));
//        frame.setSize();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        startScreen();
    }
    public void startScreen(){
        gsPU.removeAll();
        gsPU.setLayout(null);
        gsPU.setBackground(Color.YELLOW);
        startBT.setUI(new BasicButtonUI());
        startBT.setBackground(new Color(100,200,200));
        startBT.setBounds(105, 300, 150, 50);
        JLabel mesLabel = new JLabel(mes, SwingConstants.CENTER);
        mesLabel.setFont(new Font("Arial", Font.BOLD, 72));
        mesLabel.setBounds(45, 100, 275, 150);
        mesLabel.setForeground(new Color(0, 100, 150));
        startBT.addActionListener(e -> {
            game.Game g=new game.Game();
            frame.dispose();
        });

        gsPU.add(startBT);
        gsPU.add(mesLabel);
        frame.add(gsPU);
        frame.revalidate();
        frame.repaint();
    }
}
