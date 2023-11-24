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
        try {
            Game game = new Game("medium", 2048);
            game.setup();
            game.print();
            while (!game.won()) {
                game.newTwo();
                game.move();
                game.print();
            }
            System.out.println("You won!");
        } catch (Exception e) {
            System.out.println("You lost!");
        }
    }
}
















