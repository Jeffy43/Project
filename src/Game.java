import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.chrono.MinguoEra;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Game extends JFrame{
    //private variables
    String difficulty = "";
    int targetScore = 0;
    int currentScore = 0;
    int box1 = 0;
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
    //lists of boxes without a value
    ArrayList<Integer> boxesWithout = new ArrayList();
    //value icons
    Icon iconv0 = new ImageIcon("res/Boxes/0.png");
    Icon iconv2 = new ImageIcon("res/Boxes/2.png");
    Icon iconv4 = new ImageIcon("res/Boxes/4.png");
    Icon iconv8 = new ImageIcon("res/Boxes/8.png");
    Icon iconv16 = new ImageIcon("res/Boxes/16.png");
    Icon iconv32 = new ImageIcon("res/Boxes/32.png");
    Icon iconv64 = new ImageIcon("res/Boxes/64.png");
    Icon iconv128 = new ImageIcon("res/Boxes/128.png");
    Icon iconv256 = new ImageIcon("res/Boxes/256.png");
    Icon iconv512 = new ImageIcon("res/Boxes/512.png");
    Icon iconv1024 = new ImageIcon("res/Boxes/1024.png");
    Icon iconv2048 = new ImageIcon("res/Boxes/2048.png");
    Icon iconv4096 = new ImageIcon("res/Boxes/4096.png");
    //assigns value to each box
    JButton b1 = new JButton(iconv0);
    JButton b2 = new JButton(iconv0);
    JButton b3 = new JButton(iconv0);
    JButton b4 = new JButton(iconv0);
    JButton b5 = new JButton(iconv0);
    JButton b6 = new JButton(iconv0);
    JButton b7 = new JButton(iconv0);
    JButton b8 = new JButton(iconv0);
    JButton b9 = new JButton(iconv0);
    JButton b10 = new JButton(iconv0);
    JButton b11 = new JButton(iconv0);
    JButton b12 = new JButton(iconv0);
    JButton b13 = new JButton(iconv0);
    JButton b14 = new JButton(iconv0);
    JButton b15 = new JButton(iconv0);
    JButton b16 = new JButton(iconv0);

    JButton b1a = new JButton(iconv0);
    JButton b2a = new JButton(iconv0);
    JButton b3a = new JButton(iconv0);
    JButton b4a = new JButton(iconv0);
    JButton b5a = new JButton(iconv0);
    JButton b6a = new JButton(iconv0);
    JButton b7a = new JButton(iconv0);
    JButton b8a = new JButton(iconv0);
    JButton b9a = new JButton(iconv0);
    JButton b10a = new JButton(iconv0);
    JButton b11a = new JButton(iconv0);
    JButton b12a = new JButton(iconv0);
    JButton b13a = new JButton(iconv0);
    JButton b14a = new JButton(iconv0);
    JButton b15a = new JButton(iconv0);
    JButton b16a = new JButton(iconv0);

    boolean lose = false;
    boolean won = false;
    //object constructor
    public Game(String difficulty) {
        this.difficulty = difficulty;
        if (difficulty.equals("Easy") || difficulty.equals("easy")) {
            this.targetScore = 1024;
        } else if (difficulty.equals("medium") || difficulty.equals("Medium")) {
            this.targetScore = 2048;
        } else if (difficulty.equals("hard") || difficulty.equals("Hard")) {
            this.targetScore = 4096;
        } else {
        }
    }

    //resets game
    public void reset(){
        box1 = 0;
        box2 = 0;
        box3 = 0;
        box4 = 0;
        box5 = 0;
        box6 = 0;
        box7 = 0;
        box8 = 0;
        box9 = 0;
        box10 = 0;
        box11 = 0;
        box12 = 0;
        box13 = 0;
        box14 = 0;
        box15 = 0;
        box16 = 0;
        currentScore = 0;
    }

    //prints 4x4 grid
    public void print() {
        System.out.println(box1 + " " + box2 + " " + box3 + " " + box4);
        System.out.println(box5 + " " + box6 + " " + box7 + " " + box8);
        System.out.println(box9 + " " + box10 + " " + box11 + " " + box12);
        System.out.println(box13 + " " + box14 + " " + box15 + " " + box16);
    }

    //clears list of empty boxes
    public void clear() {
        boxesWithout.clear();
    }

    public void newTwo() {
        if (box1 == 0) {
            boxesWithout.add(1);
        }
        if (box2 == 0) {
            boxesWithout.add(2);
        }
        if (box3 == 0) {
            boxesWithout.add(3);
        }
        if (box4 == 0) {
            boxesWithout.add(4);
        }
        if (box5 == 0) {
            boxesWithout.add(5);
        }
        if (box6 == 0) {
            boxesWithout.add(6);
        }
        if (box7 == 0) {
            boxesWithout.add(7);
        }
        if (box8 == 0) {
            boxesWithout.add(8);
        }
        if (box9 == 0) {
            boxesWithout.add(9);
        }
        if (box10 == 0) {
            boxesWithout.add(10);
        }
        if (box11 == 0) {
            boxesWithout.add(11);
        }
        if (box12 == 0) {
            boxesWithout.add(12);
        }
        if (box13 == 0) {
            boxesWithout.add(13);
        }
        if (box14 == 0) {
            boxesWithout.add(14);
        }
        if (box15 == 0) {
            boxesWithout.add(15);
        }
        if (box16 == 0) {
            boxesWithout.add(16);
        }
        System.out.println(boxesWithout);
        int rand = (int) (Math.random() * boxesWithout.size());

        int placement = boxesWithout.get(rand);
        if (placement == 1) {
            box1 = 2;
        }
        if (placement == 2) {
            box2 = 2;
        }
        if (placement == 3) {
            box3 = 2;
        }
        if (placement == 4) {
            box4 = 2;
        }
        if (placement == 5) {
            box5 = 2;
        }
        if (placement == 6) {
            box6 = 2;
        }
        if (placement == 7) {
            box7 = 2;
        }
        if (placement == 8) {
            box8 = 2;
        }
        if (placement == 9) {
            box9 = 2;
        }
        if (placement == 10) {
            box10 = 2;
        }
        if (placement == 11) {
            box11 = 2;
        }
        if (placement == 12) {
            box12 = 2;
        }
        if (placement == 13) {
            box13 = 2;
        }
        if (placement == 14) {
            box14 = 2;
        }
        if (placement == 15) {
            box15 = 2;
        }
        if (placement == 16) {
            box16 = 2;
        }
        clear();
    }

    //checks if you've won
    public boolean won() {
        int current = 0;
        int highest = 0;
        boolean win = false;
        ArrayList<Integer> boxes = new ArrayList();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.add(box5);
        boxes.add(box6);
        boxes.add(box7);
        boxes.add(box8);
        boxes.add(box9);
        boxes.add(box10);
        boxes.add(box11);
        boxes.add(box12);
        boxes.add(box13);
        boxes.add(box14);
        boxes.add(box15);
        boxes.add(box16);

        for (int i = 0; i < boxes.size(); i++) {
            currentScore = boxes.get(i);
            if (highest < currentScore) {
                highest = currentScore;
            }
            currentScore = 0;
        }
        boxes.clear();
         if(highest >= targetScore){
             win = true;
             won = true;
         }
        return win;
    }

    //shift grids
    public void move(String keypress) {
        boolean combined = false;
        if (keypress.equals("w")) {
            //colum 1
            if (box5 != 0) {
                if (box1 == 0) {
                    box1 = box5;
                    box5 = 0;
                } else if (box1 != 0 && box1 == box5) {
                    box1 += box5;
                    box5 = 0;
                } else if (box9 != 0 && box1 != 0 && box1 == box9 && box5 == 0) {
                    box1 += box9;
                    box9 = 0;
                }
            }
            if (box9 != 0) {
                if (box5 == 0 && box1 == 0) {
                    box1 = box9;
                    box9 = 0;
                } else if (box5 == 0 && box1 != 0) {
                    box5 = box9;
                    box9 = 0;
                    combined = true;
                    if (box1 == 0) {
                        box1 = box5;
                    } else if (box1 == box5) {
                        box1 += box5;
                        box5 = 0;
                    }
                } else if (box9 == box5) {
                    box5 += box9;
                    box9 = 0;
                }
            }
            if (box13 != 0) {
                if (box9 == 0) {
                    if (box5 == 0 && box1 == 0) {
                        box1 = box13;
                        box13 = 0;
                    } else if (box5 == 0 && box1 != 0) {
                        box5 = box13;
                        box13 = 0;
                        if (box5 == box1 && combined == false) {
                            box1 += box5;
                            box5 = 0;
                        }
                    } else if (box5 != 0 && box1 != 0) {
                        box9 = box13;
                        box13 = 0;
                        if (box9 == box5) {
                            box5 += box9;
                            box9 = 0;
                        }
                    }
                } else if (box13 == box9) {
                    box9 += box13;
                    box13 = 0;
                }
            }
            combined = false;
            //colum 2
            if (box6 != 0) {
                if (box2 == 0) {
                    box2 = box6;
                    box6 = 0;
                } else if (box2 != 0 && box2 == box6) {
                    box2 += box6;
                    box6 = 0;
                } else if (box10 != 0 && box2 != 0 && box2 == box10 && box6 == 0) {
                    box2 += box10;
                    box10 = 0;
                }
            }
            if (box10 != 0) {
                if (box6 == 0 && box2 == 0) {
                    box2 = box10;
                    box10 = 0;
                } else if (box6 == 0 && box2 != 0) {
                    box6 = box10;
                    box10 = 0;
                    combined = true;
                    if (box2 == 0) {
                        box2 = box6;
                    } else if (box2 == box6) {
                        box2 += box6;
                        box6 = 0;
                    }
                } else if (box10 == box6) {
                    box6 += box10;
                    box10 = 0;
                }
            }
            if (box14 != 0) {
                if (box10 == 0) {
                    if (box6 == 0 && box2 == 0) {
                        box2 = box14;
                        box14 = 0;
                    } else if (box6 == 0 && box2 != 0) {
                        box6 = box14;
                        box14 = 0;
                        if (box6 == box2 && combined == false) {
                            box2 += box6;
                            box6 = 0;
                        }
                    } else if (box6 != 0 && box2 != 0) {
                        box10 = box14;
                        box14 = 0;
                        if (box10 == box6) {
                            box6 += box10;
                            box10 = 0;
                        }
                    }
                } else if (box14 == box10) {
                    box10 += box14;
                    box14 = 0;
                }
            }
            combined = false;
            //colum 3
            if (box7 != 0) {
                if (box3 == 0) {
                    box3 = box7;
                    box7 = 0;
                } else if (box3 != 0 && box3 == box7) {
                    box3 += box7;
                    box7 = 0;
                } else if (box11 != 0 && box3 != 0 && box3 == box11 && box7 == 0) {
                    box3 += box11;
                    box11 = 0;
                }
            }
            if (box11 != 0) {
                if (box7 == 0 && box3 == 0) {
                    box3 = box11;
                    box11 = 0;
                } else if (box7 == 0 && box3 != 0) {
                    box7 = box11;
                    box11 = 0;
                    combined = true;
                    if (box3 == 0) {
                        box3 = box7;
                    } else if (box3 == box7) {
                        box3 += box7;
                        box7 = 0;
                    }
                } else if (box11 == box7) {
                    box7 += box11;
                    box11 = 0;
                }
            }
            if (box15 != 0) {
                if (box11 == 0) {
                    if (box7 == 0 && box3 == 0) {
                        box3 = box15;
                        box15 = 0;
                    } else if (box7 == 0 && box3 != 0) {
                        box7 = box15;
                        box15 = 0;
                        if (box7 == box3 && combined == false) {
                            box3 += box7;
                            box7 = 0;
                        }
                    } else if (box7 != 0 && box3 != 0) {
                        box11 = box15;
                        box15 = 0;
                        if (box11 == box7) {
                            box7 += box11;
                            box11 = 0;
                        }
                    }
                } else if (box15 == box11) {
                    box11 += box15;
                    box15 = 0;
                }
            }
            combined = false;
            //colum 4
            if (box8 != 0) {
                if (box4 == 0) {
                    box4 = box8;
                    box8 = 0;
                } else if (box4 != 0 && box4 == box8) {
                    box4 += box8;
                    box8 = 0;
                } else if (box12 != 0 && box4 != 0 && box4 == box12 && box8 == 0) {
                    box4 += box12;
                    box12 = 0;
                }
            }
            if (box12 != 0) {
                if (box8 == 0 && box4 == 0) {
                    box4 = box12;
                    box12 = 0;
                } else if (box8 == 0 && box4 != 0) {
                    box8 = box12;
                    box12 = 0;
                    combined = true;
                    if (box4 == 0) {
                        box4 = box8;
                    } else if (box4 == box8) {
                        box4 += box8;
                        box8 = 0;
                    }
                } else if (box12 == box8) {
                    box8 += box12;
                    box12 = 0;
                }
            }
            if (box16 != 0) {
                if (box12 == 0) {
                    if (box8 == 0 && box4 == 0) {
                        box4 = box16;
                        box16 = 0;
                    } else if (box8 == 0 && box4 != 0) {
                        box8 = box16;
                        box16 = 0;
                        if (box8 == box4 && combined == false) {
                            box4 += box8;
                            box8 = 0;
                        }
                    } else if (box8 != 0 && box4 != 0) {
                        box12 = box16;
                        box16 = 0;
                        if (box12 == box8) {
                            box8 += box12;
                            box12 = 0;
                        }
                    }
                } else if (box16 == box12) {
                    box12 += box16;
                    box16 = 0;
                }
            }
        }
        if (keypress.equals("a")) {
            //row1
            if (box2 != 0) {
                if (box1 == 0) {
                    box1 = box2;
                    box2 = 0;
                } else if (box1 != 0 && box1 == box2) {
                    box1 += box2;
                    box2 = 0;
                } else if (box2 != 0 && box4 != 0 && box4 == box2 && box3 == 0) {
                    box2 += box4;
                    box4 = 0;
                }
            }
            if (box3 != 0) {
                if (box2 == 0 && box1 == 0) {
                    box1 = box3;
                    box3 = 0;
                } else if (box2 == 0 && box1 != 0) {
                    box2 = box3;
                    box3 = 0;
                    combined = true;
                    if (box1 == 0) {
                        box1 = box2;
                    } else if (box1 == box2) {
                        box1 += box2;
                        box2 = 0;
                    }
                } else if (box2 == box3) {
                    box2 += box3;
                    box3 = 0;
                }
            }
            if (box4 != 0) {
                if (box3 == 0) {
                    if (box2 == 0 && box1 == 0) {
                        box1 = box4;
                        box4 = 0;
                    } else if (box2 == 0 && box1 != 0) {
                        box2 = box4;
                        box4 = 0;
                        if (box1 == box2 && combined == false) {
                            box1 += box2;
                            box2 = 0;
                        }
                    } else if (box2 != 0 && box1 != 0) {
                        box3 = box4;
                        box4 = 0;
                        if (box2 == box3) {
                            box2 += box3;
                            box3 = 0;
                        }
                    }
                } else if (box4 == box3) {
                    box3 += box4;
                    box4 = 0;
                }
            }
            combined = false;
            //row2
            if (box6 != 0) {
                if (box5 == 0) {
                    box5 = box6;
                    box6 = 0;
                } else if (box5 != 0 && box5 == box6) {
                    box5 += box6;
                    box6 = 0;
                } else if (box6 != 0 && box8 != 0 && box8 == box6 && box7 == 0) {
                    box6 += box8;
                    box8 = 0;
                }
            }
            if (box7 != 0) {
                if (box6 == 0 && box5 == 0) {
                    box5 = box7;
                    box7 = 0;
                } else if (box6 == 0 && box5 != 0) {
                    box6 = box7;
                    box7 = 0;
                    combined = true;
                    if (box5 == 0) {
                        box5 = box6;
                    } else if (box5 == box6) {
                        box5 += box6;
                        box6 = 0;
                    }
                } else if (box6 == box7) {
                    box6 += box7;
                    box7 = 0;
                }
            }
            if (box8 != 0) {
                if (box7 == 0) {
                    if (box6 == 0 && box5 == 0) {
                        box5 = box8;
                        box8 = 0;
                    } else if (box6 == 0 && box5 != 0) {
                        box6 = box8;
                        box8 = 0;
                        if (box5 == box6 && combined == false) {
                            box5 += box6;
                            box6 = 0;
                        }
                    } else if (box6 != 0 && box5 != 0) {
                        box7 = box8;
                        box8 = 0;
                        if (box6 == box7) {
                            box6 += box7;
                            box7 = 0;
                        }
                    }
                } else if (box8 == box7) {
                    box7 += box8;
                    box8 = 0;
                }
            }
            combined = false;
            //row3
            if (box10 != 0) {
                if (box9 == 0) {
                    box9 = box10;
                    box10 = 0;
                } else if (box9 != 0 && box9 == box10) {
                    box9 += box10;
                    box10 = 0;
                } else if (box10 != 0 && box12 != 0 && box12 == box10 && box11 == 0) {
                    box10 += box12;
                    box12 = 0;
                }
            }
            if (box11 != 0) {
                if (box10 == 0 && box9 == 0) {
                    box9 = box11;
                    box11 = 0;
                } else if (box10 == 0 && box9 != 0) {
                    box10 = box11;
                    box11 = 0;
                    combined = true;
                    if (box9 == 0) {
                        box9 = box10;
                    } else if (box9 == box10) {
                        box9 += box10;
                        box10 = 0;
                    }
                } else if (box10 == box11) {
                    box10 += box11;
                    box11 = 0;
                }
            }
            if (box12 != 0) {
                if (box11 == 0) {
                    if (box10 == 0 && box9 == 0) {
                        box9 = box12;
                        box12 = 0;
                    } else if (box10 == 0 && box9 != 0) {
                        box10 = box12;
                        box12 = 0;
                        if (box9 == box10 && combined == false) {
                            box9 += box10;
                            box10 = 0;
                        }
                    } else if (box10 != 0 && box9 != 0) {
                        box11 = box12;
                        box12 = 0;
                        if (box10 == box11) {
                            box10 += box11;
                            box11 = 0;
                        }
                    }
                } else if (box12 == box11) {
                    box11 += box12;
                    box12 = 0;
                }
            }
            combined = false;
            //row4
            if (box14 != 0) {
                if (box13 == 0) {
                    box13 = box14;
                    box14 = 0;
                } else if (box13 != 0 && box13 == box14) {
                    box13 += box14;
                    box14 = 0;
                } else if (box14 != 0 && box16 != 0 && box16 == box14 && box15 == 0) {
                    box14 += box16;
                    box16 = 0;
                }
            }
            if (box15 != 0) {
                if (box14 == 0 && box13 == 0) {
                    box13 = box15;
                    box15 = 0;
                } else if (box14 == 0 && box13 != 0) {
                    box14 = box15;
                    box15 = 0;
                    combined = true;
                    if (box13 == 0) {
                        box13 = box14;
                    } else if (box13 == box14) {
                        box13 += box14;
                        box14 = 0;
                    }
                } else if (box14 == box15) {
                    box14 += box15;
                    box15 = 0;
                }
            }
            if (box16 != 0) {
                if (box15 == 0) {
                    if (box14 == 0 && box13 == 0) {
                        box13 = box16;
                        box16 = 0;
                    } else if (box14 == 0 && box13 != 0) {
                        box14 = box16;
                        box16 = 0;
                        if (box13 == box14 && combined == false) {
                            box13 += box14;
                            box14 = 0;
                        }
                    } else if (box14 != 0 && box13 != 0) {
                        box15 = box16;
                        box16 = 0;
                        if (box14 == box15) {
                            box14 += box15;
                            box15 = 0;
                        }
                    }
                } else if (box16 == box15) {
                    box15 += box16;
                    box16 = 0;
                }
            }
        }
        if (keypress.equals("s")) {
            //column 1
            if (box9 != 0) {
                if (box13 == 0) {
                    box13 = box9;
                    box9 = 0;
                } else if (box13 != 0 && box13 == box9) {
                    box13 += box9;
                    box9 = 0;
                } else if (box9 != 0 && box1 != 0 && box1 == box9 && box5 == 0) {
                    box9 += box1;
                    box1 = 0;
                }
            }
            if (box5 != 0) {
                if (box9 == 0 && box13 == 0) {
                    box13 = box5;
                    box5 = 0;
                } else if (box9 == 0 && box13 != 0) {
                    box9 = box5;
                    box5 = 0;
                    combined = true;
                    if (box13 == 0) {
                        box13 = box9;
                    } else if (box13 == box9) {
                        box13 += box9;
                        box9 = 0;
                    }
                } else if (box9 == box5) {
                    box9 += box5;
                    box5 = 0;
                }
            }
            if (box1 != 0) {
                if (box5 == 0) {
                    if (box9 == 0 && box13 == 0) {
                        box13 = box1;
                        box1 = 0;
                    } else if (box9 == 0 && box13 != 0) {
                        box9 = box1;
                        box1 = 0;
                        if (box13 == box9 && combined == false) {
                            box13 += box9;
                            box9 = 0;
                        }
                    } else if (box9 != 0 && box13 != 0) {
                        box5 = box1;
                        box1 = 0;
                        if (box9 == box5) {
                            box9 += box5;
                            box5 = 0;
                        }
                    }
                } else if (box1 == box5) {
                    box5 += box1;
                    box1 = 0;
                }
            }
            combined = false;
            // column 2
            if (box10 != 0) {
                if (box14 == 0) {
                    box14 = box10;
                    box10 = 0;
                } else if (box14 != 0 && box14 == box10) {
                    box14 += box10;
                    box10 = 0;
                } else if (box10 != 0 && box2 != 0 && box2 == box10 && box6 == 0) {
                    box10 += box2;
                    box2 = 0;
                }
            }
            if (box6 != 0) {
                if (box10 == 0 && box14 == 0) {
                    box14 = box6;
                    box6 = 0;
                } else if (box10 == 0 && box14 != 0) {
                    box10 = box6;
                    box6 = 0;
                    combined = true;
                    if (box14 == 0) {
                        box14 = box10;
                    } else if (box14 == box10) {
                        box14 += box10;
                        box10 = 0;
                    }
                } else if (box10 == box6) {
                    box10 += box6;
                    box6 = 0;
                }
            }
            if (box2 != 0) {
                if (box6 == 0) {
                    if (box10 == 0 && box14 == 0) {
                        box14 = box2;
                        box2 = 0;
                    } else if (box10 == 0 && box14 != 0) {
                        box10 = box2;
                        box2 = 0;
                        if (box14 == box10 && combined == false) {
                            box14 += box10;
                            box10 = 0;
                        }
                    } else if (box10 != 0 && box14 != 0) {

                        box6 = box2;
                        box2 = 0;
                        if (box10 == box6) {

                            box10 += box6;
                            box6 = 0;
                        }
                    }
                } else if (box2 == box6) {
                    box6 += box2;
                    box2 = 0;
                }
            }
            combined = false;
            // column 3
            if (box11 != 0) {
                if (box15 == 0) {
                    box15 = box11;
                    box11 = 0;

                } else if (box15 != 0 && box15 == box11) {
                    box15 += box11;
                    box11 = 0;

                } else if (box11 != 0 && box3 != 0 && box3 == box11 && box7 == 0) {
                    box11 += box3;
                    box3 = 0;

                }
            }
            if (box7 != 0) {
                if (box11 == 0 && box15 == 0) {
                    box15 = box7;
                    box7 = 0;

                } else if (box11 == 0 && box15 != 0) {
                    box11 = box7;
                    box7 = 0;
                    combined = true;

                    if (box15 == 0) {
                        box15 = box11;

                    } else if (box15 == box11) {
                        box15 += box11;
                        box11 = 0;
                    }
                } else if (box11 == box7) {
                    box11 += box7;
                    box7 = 0;
                }
            }
            if (box3 != 0) {
                if (box7 == 0) {
                    if (box11 == 0 && box15 == 0) {
                        box15 = box3;
                        box3 = 0;
                    } else if (box11 == 0 && box15 != 0) {
                        box11 = box3;
                        box3 = 0;
                        if (box15 == box11 && combined == false) {
                            box15 += box11;
                            box11 = 0;
                        }
                    } else if (box11 != 0 && box15 != 0) {

                        box7 = box3;
                        box3 = 0;
                        if (box11 == box7) {
                            box11 += box7;
                            box7 = 0;
                        }
                    }
                } else if (box3 == box7) {
                    box7 += box3;
                    box3 = 0;
                }
            }
            combined = false;
            // column 4
            if (box12 != 0) {
                if (box16 == 0) {
                    box16 = box12;
                    box12 = 0;
                } else if (box16 != 0 && box16 == box12) {
                    box16 += box12;
                    box12 = 0;
                } else if (box12 != 0 && box4 != 0 && box4 == box12 && box7 == 0) {
                    box12 += box4;
                    box4 = 0;
                }
            }
            if (box8 != 0) {
                if (box12 == 0 && box16 == 0) {
                    box16 = box8;
                    box8 = 0;
                } else if (box12 == 0 && box16 != 0) {
                    box12 = box8;
                    box8 = 0;
                    combined = true;
                    if (box16 == 0) {
                        box16 = box12;
                    } else if (box16 == box12) {
                        box16 += box12;
                        box12 = 0;
                    }
                } else if (box12 == box8) {
                    box12 += box8;
                    box8 = 0;
                }
            }
            if (box4 != 0) {
                if (box8 == 0) {
                    if (box12 == 0 && box16 == 0) {
                        box16 = box4;
                        box4 = 0;
                    } else if (box12 == 0 && box16 != 0) {
                        box12 = box4;
                        box4 = 0;
                        if (box16 == box12 && combined == false) {
                            box16 += box12;
                            box12 = 0;
                        }
                    } else if (box12 != 0 && box16 != 0) {
                        box8 = box4;
                        box4 = 0;
                        if (box12 == box8) {

                            box12 += box8;
                            box8 = 0;
                        }
                    }
                } else if (box4 == box8) {
                    box8 += box4;
                    box4 = 0;
                }
            }
        }
        if (keypress.equals("d")) {
            //row1
            if (box3 != 0) {
                if (box4 == 0) {
                    box4 = box3;
                    box3 = 0;

                } else if (box4 != 0 && box4 == box3) {
                    box4 += box3;
                    box3 = 0;

                } else if (box3 != 0 && box1 != 0 && box1 == box3 && box2 == 0) {
                    box3 += box1;
                    box1 = 0;

                }
            }
            if (box2 != 0) {
                if (box3 == 0 && box4 == 0) {
                    box4 = box2;
                    box2 = 0;

                } else if (box3 == 0 && box4 != 0) {
                    box3 = box2;
                    box2 = 0;
                    combined = true;

                    if (box4 == 0) {
                        box4 = box3;

                    } else if (box4 == box3) {
                        box4 += box3;
                        box3 = 0;

                    }
                } else if (box3 == box2) {
                    box3 += box2;
                    box2 = 0;

                }
            }
            if (box1 != 0) {
                if (box2 == 0) {
                    if (box3 == 0 && box4 == 0) {
                        box4 = box1;
                        box1 = 0;

                    } else if (box3 == 0 && box4 != 0) {
                        box3 = box1;
                        box1 = 0;
                        if (box4 == box3 && combined == false) {
                            box4 += box3;
                            box3 = 0;

                        }
                    } else if (box3 != 0 && box4 != 0) {
                        box2 = box1;
                        box1 = 0;

                        if (box3 == box2) {
                            box3 += box2;
                            box2 = 0;

                        }
                    }
                } else if (box1 == box2) {
                    box2 += box1;
                    box1 = 0;

                }
            }
            combined = false;
            //row2
            if (box7 != 0) {
                if (box8 == 0) {
                    box8 = box7;
                    box7 = 0;
                } else if (box8 != 0 && box8 == box7) {
                    box8 += box7;
                    box7 = 0;
                } else if (box7 != 0 && box5 != 0 && box5 == box7 && box6 == 0) {
                    box7 += box5;
                    box5 = 0;
                }
            }
            if (box6 != 0) {
                if (box7 == 0 && box8 == 0) {
                    box8 = box6;
                    box6 = 0;
                } else if (box7 == 0 && box8 != 0) {
                    box7 = box6;
                    box6 = 0;
                    combined = true;
                    if (box8 == 0) {
                        box8 = box7;
                    } else if (box8 == box7) {
                        box8 += box7;
                        box7 = 0;
                    }
                } else if (box7 == box6) {
                    box7 += box6;
                    box6 = 0;
                }
            }
            if (box5 != 0) {
                if (box6 == 0) {
                    if (box7 == 0 && box8 == 0) {
                        box8 = box5;
                        box5 = 0;
                    } else if (box7 == 0 && box8 != 0) {
                        box7 = box5;
                        box5 = 0;
                        if (box8 == box7 && combined == false) {
                            box8 += box7;
                            box7 = 0;
                        }
                    } else if (box7 != 0 && box8 != 0) {
                        box6 = box5;
                        box5 = 0;
                        if (box7 == box6) {
                            box7 += box6;
                            box6 = 0;
                        }
                    }
                } else if (box5 == box6) {
                    box6 += box5;
                    box5 = 0;
                }
            }
            combined = false;
            //row3
            if (box11 != 0) {
                if (box12 == 0) {
                    box12 = box11;
                    box11 = 0;
                } else if (box12 != 0 && box12 == box11) {
                    box12 += box11;
                    box11 = 0;
                } else if (box11 != 0 && box9 != 0 && box9 == box11 && box10 == 0) {
                    box11 += box9;
                    box9 = 0;
                }
            }
            if (box10 != 0) {
                if (box11 == 0 && box12 == 0) {
                    box12 = box10;
                    box10 = 0;
                } else if (box11 == 0 && box12 != 0) {
                    box11 = box10;
                    box10 = 0;
                    combined = true;
                    if (box12 == 0) {
                        box12 = box11;
                    } else if (box12 == box11) {
                        box12 += box11;
                        box11 = 0;
                    }
                } else if (box11 == box10) {
                    box11 += box10;
                    box10 = 0;
                }
            }
            if (box9 != 0) {
                if (box10 == 0) {
                    if (box11 == 0 && box12 == 0) {
                        box12 = box9;
                        box9 = 0;
                    } else if (box11 == 0 && box12 != 0) {
                        box11 = box9;
                        box9 = 0;
                        if (box12 == box11 && combined == false) {
                            box12 += box11;
                            box11 = 0;
                        }
                    } else if (box11 != 0 && box12 != 0) {
                        box10 = box9;
                        box9 = 0;
                        if (box11 == box10) {
                            box11 += box10;
                            box10 = 0;
                        }
                    }
                } else if (box9 == box10) {
                    box10 += box9;
                    box9 = 0;
                }
            }
            combined = false;
            //row4
            if (box15 != 0) {
                if (box16 == 0) {
                    box16 = box15;
                    box15 = 0;
                } else if (box16 != 0 && box16 == box15) {
                    box16 += box15;
                    box15 = 0;
                } else if (box15 != 0 && box13 != 0 && box13 == box15 && box14 == 0) {
                    box15 += box13;
                    box13 = 0;
                }
            }
            if (box14 != 0) {
                if (box15 == 0 && box16 == 0) {
                    box16 = box14;
                    box14 = 0;
                } else if (box15 == 0 && box16 != 0) {
                    box15 = box14;
                    box14 = 0;
                    combined = true;
                    if (box16 == 0) {
                        box16 = box15;
                    } else if (box16 == box15) {
                        box16 += box15;
                        box15 = 0;
                    }
                } else if (box15 == box14) {
                    box15 += box14;
                    box14 = 0;
                }
            }
            if (box13 != 0) {
                if (box14 == 0) {
                    if (box15 == 0 && box16 == 0) {
                        box16 = box13;
                        box13 = 0;
                    } else if (box15 == 0 && box16 != 0) {
                        box15 = box13;
                        box13 = 0;
                        if (box16 == box15 && combined == false) {
                            box16 += box15;
                            box15 = 0;
                        }
                    } else if (box15 != 0 && box16 != 0) {
                        box14 = box13;
                        box13 = 0;
                        if (box15 == box14) {
                            box15 += box14;
                            box14 = 0;
                        }
                    }
                } else if (box13 == box14) {
                    box14 += box13;
                    box13 = 0;
                }
            }
        }
    }

    //sets up jlabels and jframes
    public void setup() {
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JFrame frame = new JFrame("MergeMania");
        frame.setSize(1200, 900);
        JLabel title = new JLabel("MergeMania");
        JLabel title2 = new JLabel("MergeMania");
        JButton start = new JButton("Start");
        JLabel youLost = new JLabel("You Lost!");
        youLost.setFont(new Font("Comic Sans MS", Font.BOLD, 90));
        youLost.setForeground(new java.awt.Color(255, 0, 0));
        JLabel youWon = new JLabel("You Won!");
        youWon.setFont(new Font("Comic Sans MS", Font.BOLD, 90));
        youWon.setForeground(new java.awt.Color(0, 255, 0));
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 75));
        title.setForeground(new java.awt.Color(218, 165, 40));
        title2.setFont(new Font("Comic Sans MS", Font.BOLD, 75));
        title2.setForeground(new java.awt.Color(218, 165, 40));
        panel.setBackground(Color.DARK_GRAY);
        panel2.setBackground(Color.DARK_GRAY);
        panel.setBorder(new LineBorder(Color.BLACK));
        panel2.setBorder(new LineBorder(Color.BLACK));
        panel.setLayout(null);
        panel2.setLayout(null);
        //allows panel to take in inputs
        panel.setFocusable(true);
        panel.requestFocus();
        //adds a mouse listener to start button
        start.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                frame.getContentPane().removeAll();
                frame.add(panel2);
                frame.revalidate();
                panel2.setFocusable(true);
                panel2.requestFocus();
            }
        });

        //adds a key listener to overall panel
        panel2.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_W) {
                    move("w");
                    newTwo();
                    lost();
                    if(won == true){
                        youWon.setVisible(true);
                        frame.revalidate();
                    }
                    if(lose == true){
                        youLost.setVisible(true);
                        frame.revalidate();
                    }
                    print();
                }
                //a
                if (key == KeyEvent.VK_A) {
                    move("a");
                    newTwo();
                    lost();
                    if(won == true){
                        youWon.setVisible(true);
                        frame.revalidate();
                    }
                    if(lose == true){
                        youLost.setVisible(true);
                        frame.revalidate();
                    }
                    print();
                }
                //s
                if (key == KeyEvent.VK_S) {
                    move("s");
                    newTwo();
                    lost();
                    if(won == true){
                        youWon.setVisible(true);
                        frame.revalidate();
                    }
                    if(lose == true){
                        youLost.setVisible(true);
                        frame.revalidate();
                    }
                    print();
                }
                //d
                if (key == KeyEvent.VK_D) {
                    move("d");
                    newTwo();
                    lost();
                    if(won == true){
                        youWon.setVisible(true);
                        frame.revalidate();
                    }
                    if(lose == true){

                        youLost.setVisible(true);
                        frame.revalidate();
                    }
                    print();
                }
            }
        });

        //makes 16 boxes
        start.setBackground(new java.awt.Color(212, 175, 55));
        start.setBounds(frame.getWidth() / 2 - 150, 300, 240, 150);
        title.setBounds(frame.getWidth() / 2 - 215, -80, 600, 300);
        frame.setVisible(true);
        frame.add(panel);
        panel.add(title);
        panel.add(start);
        title2.setBounds(frame.getWidth() / 2 - 215, -80, 600, 300);
        panel2.add(title2);

        b1.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b1);
        b2.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b2);
        b3.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b3);
        b4.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b4);
        b5.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b5);
        b6.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b6);
        b7.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b7);
        b8.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b8);
        b9.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b9);
        b10.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b10);
        b11.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b11);
        b12.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b12);
        b13.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b13);
        b14.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b14);
        b15.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b15);
        b16.setBorder(new LineBorder(Color.BLACK));
        panel2.add(b16);

        //setting buttons
        //row1
        b1.setBounds(400, 150, 100, 100);
        b2.setBounds(500, 150, 100, 100);
        b3.setBounds(600, 150, 100, 100);
        b4.setBounds(700, 150, 100, 100);
        //row2
        b5.setBounds(400, 250, 100, 100);
        b6.setBounds(500, 250, 100, 100);
        b7.setBounds(600, 250, 100, 100);
        b8.setBounds(700, 250, 100, 100);
        //row3
        b9.setBounds(400, 350, 100, 100);
        b10.setBounds(500, 350, 100, 100);
        b11.setBounds(600, 350, 100, 100);
        b12.setBounds(700, 350, 100, 100);
        //row4
        b13.setBounds(400, 450, 100, 100);
        b14.setBounds(500, 450, 100, 100);
        b15.setBounds(600, 450, 100, 100);
        b16.setBounds(700, 450, 100, 100);


        //adding buttons
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b7);
        panel2.add(b8);
        panel2.add(b9);
        panel2.add(b10);
        panel2.add(b11);
        panel2.add(b12);
        panel2.add(b13);
        panel2.add(b14);
        panel2.add(b15);
        panel2.add(b16);


        start.setBounds(470, 350, 240, 120);
        start.setBackground(Color.GREEN);
        panel2.add(youLost);

        youLost.setBounds(frame.getWidth() / 2 - 200, 500, 600, 300);
        youLost.setVisible(false);
        panel2.add(youWon);

        youWon.setBounds(frame.getWidth() / 2 - 200, 500, 600, 300);
        youWon.setVisible(false);
        frame.revalidate();


        frame.setVisible(true);
        frame.show();
    }

    //checks if you've lost
    public void lost(){
        boolean first = true;
        boolean second = true;
        boolean third = true;
        boolean fourth = true;
        boolean zero = true;
        //checks if any box is a zero
        if(box1 != 0 && box2 != 0 && box3 != 0 && box4 != 0 && box5 != 0 && box6 != 0 && box7 != 0 && box8 != 0 && box9 != 0 && box10 != 0 && box11 != 0 && box12 != 0 && box13 != 0 && box14 != 0 && box15 != 0 && box16 != 0){
            zero = false;
        }
        //checks if first row is movable
        if(box1 != box2 && box1 != box5){
            if(box2 != box3 && box2 != box6){
                if(box3 != box4 && box3 != box7){
                    if(box4 != box8){
                        first = false;
                    }
                }
            }
        }
        //checks if second row is movable
        if(box5 != box1 && box5 != box6 && box5 != box9){
            if(box6 != box2 && box6 != box7 && box6 != box10){
                if(box7 != box3 && box7 != box8 && box7 != box11){
                    if(box8 != box4 && box8 != box12){
                        second = false;
                    }
                }
            }
        }
        //checks if third row is movable
        if(box9 != box5 && box9 != box10 && box9 != box13){
            if(box10 != box6 && box10 != box11 && box10 != box14){
                if(box11 != box7 && box11 != box12 && box11 != box15){
                    if(box12 != box8 && box12 != box16){
                        third = false;
                    }
                }
            }
        }
        if(box13 != box9 && box13 != box14){
            if(box14 != box10 && box14 != box15){
                if(box15 != box11 && box15 != box16){
                    if(box16 != box12){
                        fourth = false;
                    }
                }
            }
        }
        if(!first && !second && !third && !fourth && !zero){
            lose = true;
        }
    }

    //refreshes each boxes icon after movement
    public void refresh(){
        if (box1 == 0){
            b1.setIcon(iconv0);
        }else if (box1 == 2) {
            b1.setIcon(iconv2);
        }else if (box1 == 4) {
            b1.setIcon(iconv4);
        }else if (box1 == 8) {
            b1.setIcon(iconv8);
        }else if (box1 == 16) {
            b1.setIcon(iconv16);
        }else if (box1 == 32) {
            b1.setIcon(iconv32);
        }else if (box1 == 64) {
            b1.setIcon(iconv64);
        }else if (box1 == 128) {
            b1.setIcon(iconv128);
        }else if (box1 == 256) {
            b1.setIcon(iconv256);
        }else if (box1 == 512) {
            b1.setIcon(iconv512);
        }else if (box1 == 1024) {
            b1.setIcon(iconv1024);
        }else if (box1 == 2048) {
            b1.setIcon(iconv2048);
        }else if (box1 == 4096) {
            b1.setIcon(iconv4096);
        }
        if (box2 == 0){
            b2.setIcon(iconv0);
        }else if (box2 == 2) {
            b2.setIcon(iconv2);
        }else if (box2 == 4) {
            b2.setIcon(iconv4);
        }else if (box2 == 8) {
            b2.setIcon(iconv8);
        }else if (box2 == 16) {
            b2.setIcon(iconv16);
        }else if (box2 == 32) {
            b2.setIcon(iconv32);
        }else if (box2 == 64) {
            b2.setIcon(iconv64);
        }else if (box2 == 128) {
            b2.setIcon(iconv128);
        }else if (box2 == 256) {
            b2.setIcon(iconv256);
        }else if (box2 == 512) {
            b2.setIcon(iconv512);
        }else if (box2 == 1024) {
            b2.setIcon(iconv1024);
        }else if (box2 == 2048) {
            b2.setIcon(iconv2048);
        }else if (box2 == 4096) {
            b2.setIcon(iconv4096);
        }
        if (box3 == 0){
            b3.setIcon(iconv0);
        }else if (box3 == 2) {
            b3.setIcon(iconv2);
        }else if (box3 == 4) {
            b3.setIcon(iconv4);
        }else if (box3 == 8) {
            b3.setIcon(iconv8);
        }else if (box3 == 16) {
            b3.setIcon(iconv16);
        }else if (box3 == 32) {
            b3.setIcon(iconv32);
        }else if (box3 == 64) {
            b3.setIcon(iconv64);
        }else if (box3 == 128) {
            b3.setIcon(iconv128);
        }else if (box3 == 256) {
            b3.setIcon(iconv256);
        }else if (box3 == 512) {
            b3.setIcon(iconv512);
        }else if (box3 == 1024) {
            b3.setIcon(iconv1024);
        }else if (box3 == 2048) {
            b3.setIcon(iconv2048);
        }else if (box3 == 4096) {
            b3.setIcon(iconv4096);
        }
        if (box4 == 0){
            b4.setIcon(iconv0);
        }else if (box4 == 2) {
            b4.setIcon(iconv2);
        }else if (box4 == 4) {
            b4.setIcon(iconv4);
        }else if (box4 == 8) {
            b4.setIcon(iconv8);
        }else if (box4 == 16) {
            b4.setIcon(iconv16);
        }else if (box4 == 32) {
            b4.setIcon(iconv32);
        }else if (box4 == 64) {
            b4.setIcon(iconv64);
        }else if (box4 == 128) {
            b4.setIcon(iconv128);
        }else if (box4 == 256) {
            b4.setIcon(iconv256);
        }else if (box4 == 512) {
            b4.setIcon(iconv512);
        }else if (box4 == 1024) {
            b4.setIcon(iconv1024);
        }else if (box4 == 2048) {
            b4.setIcon(iconv2048);
        }else if (box4 == 4096) {
            b4.setIcon(iconv4096);
        }
        if (box5 == 0){
            b5.setIcon(iconv0);
        }else if (box5 == 2) {
            b5.setIcon(iconv2);
        }else if (box5 == 4) {
            b5.setIcon(iconv4);
        }else if (box5 == 8) {
            b5.setIcon(iconv8);
        }else if (box5 == 16) {
            b5.setIcon(iconv16);
        }else if (box5 == 32) {
            b5.setIcon(iconv32);
        }else if (box5 == 64) {
            b5.setIcon(iconv64);
        }else if (box5 == 128) {
            b5.setIcon(iconv128);
        }else if (box5 == 256) {
            b5.setIcon(iconv256);
        }else if (box5 == 512) {
            b5.setIcon(iconv512);
        }else if (box5 == 1024) {
            b5.setIcon(iconv1024);
        }else if (box5 == 2048) {
            b5.setIcon(iconv2048);
        }else if (box5 == 4096) {
            b5.setIcon(iconv4096);
        }
        if (box6 == 0){
            b6.setIcon(iconv0);
        }else if (box6 == 2) {
            b6.setIcon(iconv2);
        }else if (box6 == 4) {
            b6.setIcon(iconv4);
        }else if (box6 == 8) {
            b6.setIcon(iconv8);
        }else if (box6 == 16) {
            b6.setIcon(iconv16);
        }else if (box6 == 32) {
            b6.setIcon(iconv32);
        }else if (box6 == 64) {
            b6.setIcon(iconv64);
        }else if (box6 == 128) {
            b6.setIcon(iconv128);
        }else if (box6 == 256) {
            b6.setIcon(iconv256);
        }else if (box6 == 512) {
            b6.setIcon(iconv512);
        }else if (box6 == 1024) {
            b6.setIcon(iconv1024);
        }else if (box6 == 2048) {
            b6.setIcon(iconv2048);
        }else if (box6 == 4096) {
            b6.setIcon(iconv4096);
        }
        if (box7 == 0){
            b7.setIcon(iconv0);
        }else if (box7 == 2) {
            b7.setIcon(iconv2);
        }else if (box7 == 4) {
            b7.setIcon(iconv4);
        }else if (box7 == 8) {
            b7.setIcon(iconv8);
        }else if (box7 == 16) {
            b7.setIcon(iconv16);
        }else if (box7 == 32) {
            b7.setIcon(iconv32);
        }else if (box7 == 64) {
            b7.setIcon(iconv64);
        }else if (box7 == 128) {
            b7.setIcon(iconv128);
        }else if (box7 == 256) {
            b7.setIcon(iconv256);
        }else if (box7 == 512) {
            b7.setIcon(iconv512);
        }else if (box7 == 1024) {
            b7.setIcon(iconv1024);
        }else if (box7 == 2048) {
            b7.setIcon(iconv2048);
        }else if (box7 == 4096) {
            b7.setIcon(iconv4096);
        }
        if (box8 == 0){
            b8.setIcon(iconv0);
        }else if (box8 == 2) {
            b8.setIcon(iconv2);
        }else if (box8 == 4) {
            b8.setIcon(iconv4);
        }else if (box8 == 8) {
            b8.setIcon(iconv8);
        }else if (box8 == 16) {
            b8.setIcon(iconv16);
        }else if (box8 == 32) {
            b8.setIcon(iconv32);
        }else if (box8 == 64) {
            b8.setIcon(iconv64);
        }else if (box8 == 128) {
            b8.setIcon(iconv128);
        }else if (box8 == 256) {
            b8.setIcon(iconv256);
        }else if (box8 == 512) {
            b8.setIcon(iconv512);
        }else if (box8 == 1024) {
            b8.setIcon(iconv1024);
        }else if (box8 == 2048) {
            b8.setIcon(iconv2048);
        }else if (box8 == 4096) {
            b8.setIcon(iconv4096);
        }
        if (box9 == 0){
            b9.setIcon(iconv0);
        }else if (box9 == 2) {
            b9.setIcon(iconv2);
        }else if (box9 == 4) {
            b9.setIcon(iconv4);
        }else if (box9 == 8) {
            b9.setIcon(iconv8);
        }else if (box9 == 16) {
            b9.setIcon(iconv16);
        }else if (box9 == 32) {
            b9.setIcon(iconv32);
        }else if (box9 == 64) {
            b9.setIcon(iconv64);
        }else if (box9 == 128) {
            b9.setIcon(iconv128);
        }else if (box9 == 256) {
            b9.setIcon(iconv256);
        }else if (box9 == 512) {
            b9.setIcon(iconv512);
        }else if (box9 == 1024) {
            b9.setIcon(iconv1024);
        }else if (box9 == 2048) {
            b9.setIcon(iconv2048);
        }else if (box9 == 4096) {
            b9.setIcon(iconv4096);
        }
        if (box10 == 0){
            b10.setIcon(iconv0);
        }else if (box10 == 2) {
            b10.setIcon(iconv2);
        }else if (box10 == 4) {
            b10.setIcon(iconv4);
        }else if (box10 == 8) {
            b10.setIcon(iconv8);
        }else if (box10 == 16) {
            b10.setIcon(iconv16);
        }else if (box10 == 32) {
            b10.setIcon(iconv32);
        }else if (box10 == 64) {
            b10.setIcon(iconv64);
        }else if (box10 == 128) {
            b10.setIcon(iconv128);
        }else if (box10 == 256) {
            b10.setIcon(iconv256);
        }else if (box10 == 512) {
            b10.setIcon(iconv512);
        }else if (box10 == 1024) {
            b10.setIcon(iconv1024);
        }else if (box10 == 2048) {
            b10.setIcon(iconv2048);
        }else if (box10 == 4096) {
            b10.setIcon(iconv4096);
        }
        if (box11 == 0){
            b11.setIcon(iconv0);
        }else if (box11 == 2) {
            b11.setIcon(iconv2);
        }else if (box11 == 4) {
            b11.setIcon(iconv4);
        }else if (box11 == 8) {
            b11.setIcon(iconv8);
        }else if (box11 == 16) {
            b11.setIcon(iconv16);
        }else if (box11 == 32) {
            b11.setIcon(iconv32);
        }else if (box11 == 64) {
            b11.setIcon(iconv64);
        }else if (box11 == 128) {
            b11.setIcon(iconv128);
        }else if (box11 == 256) {
            b11.setIcon(iconv256);
        }else if (box11 == 512) {
            b11.setIcon(iconv512);
        }else if (box11 == 1024) {
            b11.setIcon(iconv1024);
        }else if (box11 == 2048) {
            b11.setIcon(iconv2048);
        }else if (box11 == 4096) {
            b11.setIcon(iconv4096);
        }
        if (box12 == 0){
            b12.setIcon(iconv0);
        }else if (box12 == 2) {
            b12.setIcon(iconv2);
        }else if (box12 == 4) {
            b12.setIcon(iconv4);
        }else if (box12 == 8) {
            b12.setIcon(iconv8);
        }else if (box12 == 16) {
            b12.setIcon(iconv16);
        }else if (box12 == 32) {
            b12.setIcon(iconv32);
        }else if (box12 == 64) {
            b12.setIcon(iconv64);
        }else if (box12 == 128) {
            b12.setIcon(iconv128);
        }else if (box12 == 256) {
            b12.setIcon(iconv256);
        }else if (box12 == 512) {
            b12.setIcon(iconv512);
        }else if (box12 == 1024) {
            b12.setIcon(iconv1024);
        }else if (box12 == 2048) {
            b12.setIcon(iconv2048);
        }else if (box12 == 4096) {
            b12.setIcon(iconv4096);
        }
        if (box13 == 0){
            b13.setIcon(iconv0);
        }else if (box13 == 2) {
            b13.setIcon(iconv2);
        }else if (box13 == 4) {
            b13.setIcon(iconv4);
        }else if (box13 == 8) {
            b13.setIcon(iconv8);
        }else if (box13 == 16) {
            b13.setIcon(iconv16);
        }else if (box13 == 32) {
            b13.setIcon(iconv32);
        }else if (box13 == 64) {
            b13.setIcon(iconv64);
        }else if (box13 == 128) {
            b13.setIcon(iconv128);
        }else if (box13 == 256) {
            b13.setIcon(iconv256);
        }else if (box13 == 512) {
            b13.setIcon(iconv512);
        }else if (box13 == 1024) {
            b13.setIcon(iconv1024);
        }else if (box13 == 2048) {
            b13.setIcon(iconv2048);
        }else if (box13 == 4096) {
            b13.setIcon(iconv4096);
        }
        if (box14 == 0){
            b14.setIcon(iconv0);
        }else if (box14 == 2) {
            b14.setIcon(iconv2);
        }else if (box14 == 4) {
            b14.setIcon(iconv4);
        }else if (box14 == 8) {
            b14.setIcon(iconv8);
        }else if (box14 == 16) {
            b14.setIcon(iconv16);
        }else if (box14 == 32) {
            b14.setIcon(iconv32);
        }else if (box14 == 64) {
            b14.setIcon(iconv64);
        }else if (box14 == 128) {
            b14.setIcon(iconv128);
        }else if (box14 == 256) {
            b14.setIcon(iconv256);
        }else if (box14 == 512) {
            b14.setIcon(iconv512);
        }else if (box14 == 1024) {
            b14.setIcon(iconv1024);
        }else if (box14 == 2048) {
            b14.setIcon(iconv2048);
        }else if (box14 == 4096) {
            b14.setIcon(iconv4096);
        }
        if (box15 == 0){
            b15.setIcon(iconv0);
        }else if (box15 == 2) {
            b15.setIcon(iconv2);
        }else if (box15 == 4) {
            b15.setIcon(iconv4);
        }else if (box15 == 8) {
            b15.setIcon(iconv8);
        }else if (box15 == 16) {
            b15.setIcon(iconv16);
        }else if (box15 == 32) {
            b15.setIcon(iconv32);
        }else if (box15 == 64) {
            b15.setIcon(iconv64);
        }else if (box15 == 128) {
            b15.setIcon(iconv128);
        }else if (box15 == 256) {
            b15.setIcon(iconv256);
        }else if (box15 == 512) {
            b15.setIcon(iconv512);
        }else if (box15 == 1024) {
            b15.setIcon(iconv1024);
        }else if (box15 == 2048) {
            b15.setIcon(iconv2048);
        }else if (box15 == 4096) {
            b15.setIcon(iconv4096);
        }
        if (box16 == 0){
            b16.setIcon(iconv0);
        }else if (box16 == 2) {
            b16.setIcon(iconv2);
        }else if (box16 == 4) {
            b16.setIcon(iconv4);
        }else if (box16 == 8) {
            b16.setIcon(iconv8);
        }else if (box16 == 16) {
            b16.setIcon(iconv16);
        }else if (box16 == 32) {
            b16.setIcon(iconv32);
        }else if (box16 == 64) {
            b16.setIcon(iconv64);
        }else if (box16 == 128) {
            b16.setIcon(iconv128);
        }else if (box16 == 256) {
            b16.setIcon(iconv256);
        }else if (box16 == 512) {
            b16.setIcon(iconv512);
        }else if (box16 == 1024) {
            b16.setIcon(iconv1024);
        }else if (box16 == 2048) {
            b16.setIcon(iconv2048);
        }else if (box16 == 4096) {
            b16.setIcon(iconv4096);
        }
    }}

