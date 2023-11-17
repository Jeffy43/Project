import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Main{



    public static void main(String[]args) {
        //creating of panel,frame,text
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("2048");
        JLabel title = new JLabel("2048");
        JButton b1 = new JButton("Start");
        //creating background and buttons
        frame.setSize(1600, 900);
        panel.setBackground(Color.DARK_GRAY);
        title.setFont(new Font("Serif",Font.BOLD,150));
        panel.setBorder(new LineBorder(Color.white));
        panel.setLayout(null);

        b1.setBackground(new java.awt.Color(212, 175, 55));
        b1.setBounds(frame.getWidth()/2 - 150,300,300,150);
        title.setBounds(frame.getWidth()/2 - 150,0,600,300);

//        b1.addActionListener(new ActionListener());
//
//
//        public void actionPerformed(ActionEvent e){
//            frame.setVisible(false);
//        }







        // Display Code
        frame.add(panel);
        panel.add(title);
        panel.add(b1);
        frame.setVisible(true);
        frame.show();

        // if (x.x == x.x){
        //    combine blocks
        //    delete previous block
        // }
        // if (keys.x = pressed?){
        //     move blocks x direction
        //     spawn new block()
        // }
        // if (x == 2048){
        //     win
        // }
        // if (no more moves){
        //     lose
        //}




    }
}