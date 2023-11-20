import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //creating of panel,frame,text

        int box1 = 1;
        int box2 = 0;
        int box3 = 0;
        int box4 = 0;
        int box5 = 0;
        int box6 = 0;
        int box7 = 0;
        int box8 = 0;
        int box9 = 0;
        int box10 = 0;
        int box11 = 0;
        int box12 = 0;
        int box13 = 0;
        int box14 = 0;
        int box15 = 0;
        int box16 = 0;


        Scanner s = new Scanner(System.in);
        System.out.println(box1 + " " + box2 + " " + box3 + " " + box4);
        System.out.println(box5 + " " + box6 + " " + box7 + " " + box8);
        System.out.println(box9 + " " + box10 + " " + box11 + " " + box12);
        System.out.println(box13 + " " + box14 + " " + box15 + " " + box16);
        //
        if (s.nextLine().equals("d")) {
            if (box3 != 0) {
                if (box4 == 0) {
                    box4 = box3;
                    box3 = 0;
                }
            }
            if (box2 != 0) {
                if (box3 == 0 && box4 == 0) {
                    box4 = box2;
                } else if (box3 == 0 && box4 != 0) {
                    box3 = box2;
                    box2 = 0;
                }
            }
            if (box1 != 0) {
                System.out.println("ningRun");
                if (box2 == 0 && box3 == 0 && box4 == 0) {
                    box4 = box1;
                    box1 = 0;
                } else if (box2 == 0 && box3 == 0 && box4 != 0) {
                    box3 = box1;
                    box3 = 0;
                } else if (box2 == 0 && box3 != 0 && box4 != 0) {
                    box2 = box1;
                    box1 = 0;
                    }
                }
            }
        System.out.println(box1 + " " + box2 + " " + box3 + " " + box4);
        System.out.println(box5 + " " + box6 + " " + box7 + " " + box8);
        System.out.println(box9 + " " + box10 + " " + box11 + " " + box12);
        System.out.println(box13 + " " + box14 + " " + box15 + " " + box16);
    }
}





//
//
//        JPanel panel = new JPanel();
//        JFrame frame = new JFrame("2048");
//        JLabel title = new JLabel("2048");
//        JButton b1 = new JButton("Start");
//        //creating background and buttons
//        frame.setSize(1600, 900);
//        panel.setBackground(Color.DARK_GRAY);
//        title.setFont(new Font("Serif",Font.BOLD,150));
//        title.setForeground (new java.awt.Color(218,165,40));
//        panel.setBorder(new LineBorder(Color.white));
//        panel.setLayout(null);
//
//
//        b1.setBackground(new java.awt.Color(212, 175, 55));
//        b1.setBounds(frame.getWidth()/2 - 150,300,300,150);
//        title.setBounds(frame.getWidth()/2 - 150,0,600,300);

//        b1.addActionListener(new ActionListener());
//
//
         /*public void keyPressed(KeyEvent e) {
             int key = e.getKeyCode();
             //w
             if (key == 87) {
                 Jlabel.setlocation(34, 342);
             }
             //a
             if(key == 65){
                 Jlabel.setlocation(34, 342);
             }
             //s
             if(key == 83){
                 Jlabel.setlocation(34, 342);
             }
             //d
             if(key == 68){
                 Jlabel.setlocation(34, 342);
             }*/
        //            frame.setVisible(false);
//        }







        // Display Code
        frame.add(panel);
        panel.add(title);
        panel.add(b1);
        frame.setVisible(true);
        frame.show();






    }
}