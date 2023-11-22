import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.awt.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Game game = new Game("medium", 2048);
        //logic
        game.print();
        while(!game.won()){
            game.move();
            game.newTwo();
            game.print();
        }
    }
}










/*
        //creating background and buttons
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("2048");
        JLabel title = new JLabel("2048");
        JButton start = new JButton("Start");
        frame.setSize(1600, 900);
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 150));
        title.setForeground(new java.awt.Color(218, 165, 40));
        panel.setBackground(Color.DARK_GRAY);
        panel.setBorder(new LineBorder(Color.white));
        panel.setLayout(null);
        //allows panel to take in inputs
        panel.setFocusable(true);
        panel.requestFocus();
        //adds a mouse listener to start button
        start.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                panel.setBackground(Color.PINK);
                panel.requestFocusInWindow();
            }
        });



        //adds a key listener to overall panel
        panel.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_W) {
                    panel.setBackground(Color.WHITE);
                }
                //a
                if (key == KeyEvent.VK_A) {
                    panel.setBackground(Color.YELLOW);
                }
                //s
                if (key == KeyEvent.VK_S) {
                    panel.setBackground(Color.BLACK);
                }
                //d
                if (key == KeyEvent.VK_D) {
                    panel.setBackground(Color.GREEN);
                }
            }
        });


        start.setBackground(new java.awt.Color(212, 175, 55));
        start.setBounds(frame.getWidth() / 2 - 150, 300, 300, 150);
        title.setBounds(frame.getWidth() / 2 - 180, -80, 600, 300);
        frame.setVisible(true);
        frame.add(panel);
        panel.add(title);
        panel.add(start);
        frame.setVisible(true);
        frame.show();
        }
    }
*/








