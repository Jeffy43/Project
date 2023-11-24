import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Game extends JFrame{
    String difficulty = "";
    int targetScore = 0;
    int currentScore = 0;
    int box1 = 2;
    int box2 = 2;
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
    //replaces an empty box with 2
    ArrayList<Integer> boxesWithout = new ArrayList();

    //object constructor
    public Game(String difficulty, int targetScore) {
        this.difficulty = difficulty;
        this.targetScore = targetScore;
        if (difficulty.equals("Easy") || difficulty.equals("easy")) {
            this.targetScore = 1024;
        } else if (difficulty.equals("medium") || difficulty.equals("Medium")) {
            this.targetScore = 2048;
        } else if (difficulty.equals("hard") || difficulty.equals("Hard")) {
            this.targetScore = 4096;
        } else {
        }
    }

    //prints 4x4 grid
    public void print() {
        System.out.println(box1 + " " + box2 + " " + box3 + " " + box4);
        System.out.println(box5 + " " + box6 + " " + box7 + " " + box8);
        System.out.println(box9 + " " + box10 + " " + box11 + " " + box12);
        System.out.println(box13 + " " + box14 + " " + box15 + " " + box16);
    }

    //dw abt it
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
        boolean won = false;
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
        won = highest == targetScore;
        return won;
    }

    //shift grids
    public void move() {
        Scanner s = new Scanner(System.in);
        String answer = s.nextLine();
        if (answer.equals("w")) {
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
                        if (box5 == box1) {
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
                        if (box6 == box2) {
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
                        if (box7 == box3) {
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
                        if (box8 == box4) {
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
        if (answer.equals("a")) {
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
                        if (box1 == box2) {
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
                        if (box5 == box6) {
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
                        if (box9 == box10) {
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
                        if (box13 == box14) {
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
        if (answer.equals("s")) {
            if (box9 != 0) {
                if (box13 == 0) {
                    box13 = box9;
                    box9 = 0;
                    System.out.println("1, 1");
                } else if (box13 != 0 && box13 == box9) {
                    box13 += box9;
                    box9 = 0;
                    System.out.println("1, 2");
                } else if (box9 != 0 && box1 != 0 && box1 == box9 && box5 == 0) {
                    box9 += box1;
                    box1 = 0;
                    System.out.println("1, 3");
                }
            }
            if (box5 != 0) {
                if (box9 == 0 && box13 == 0) {
                    box13 = box5;
                    box5 = 0;
                } else if (box9 == 0 && box13 != 0) {
                    box9 = box5;
                    box5 = 0;
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
                        if (box13 == box9) {
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
                    System.out.println("3, 6");
                }
            }
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
                        if (box14 == box10) {
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
                    System.out.println("2, 1");
                } else if (box11 == 0 && box15 != 0) {
                    box11 = box7;
                    box7 = 0;
                    System.out.println("2, 2");
                    if (box15 == 0) {
                        box15 = box11;
                        System.out.println("2, 3");
                    } else if (box15 == box11) {
                        box15 += box11;
                        box11 = 0;
                        System.out.println("2, 4");
                    }
                } else if (box11 == box7) {
                    box11 += box7;
                    box7 = 0;
                    System.out.println("2, 5");
                }
            }
            if (box3 != 0) {
                if (box7 == 0) {
                    if (box11 == 0 && box15 == 0) {
                        box15 = box3;
                        box3 = 0;
                        System.out.println("3, 1");
                    } else if (box11 == 0 && box15 != 0) {
                        box11 = box3;
                        box3 = 0;
                        System.out.println("3, 2");
                        if (box15 == box11) {
                            box15 += box11;
                            box11 = 0;
                            System.out.println("3, 3");
                        }
                    } else if (box11 != 0 && box15 != 0) {
                        System.out.println("3, 4");
                        box7 = box3;
                        box3 = 0;
                        if (box11 == box7) {
                            System.out.println("3, 5");
                            box11 += box7;
                            box7 = 0;
                        }
                    }
                } else if (box3 == box7) {
                    box7 += box3;
                    box3 = 0;
                    System.out.println("3, 6");
                }
            }
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
                        if (box16 == box12) {
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
        if (answer.equals("d")) {
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
                        if (box4 == box3) {
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
                        if (box8 == box7) {
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
                        if (box12 == box11) {
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
                        if (box16 == box15) {
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


    public void setup() {
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JFrame frame = new JFrame("MergeMania");
        JLabel title = new JLabel("MergeMania");
        JLabel title2 = new JLabel("MergeMania");
        JButton start = new JButton("Start");
        frame.setSize(1200, 900);
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
                    panel2.setBackground(Color.WHITE);
                }
                //a
                if (key == KeyEvent.VK_A) {
                    panel2.setBackground(Color.YELLOW);
                }
                //s
                if (key == KeyEvent.VK_S) {
                    panel2.setBackground(Color.BLACK);
                }
                //d
                if (key == KeyEvent.VK_D) {
                    panel2.setBackground(Color.GREEN);
                }
            }
        });

        //makes 16 boxes
        Icon icon0val = new ImageIcon("res/Boxes/0.png");
        Icon icon2val = new ImageIcon("res/Boxes/2.png");
        Icon icon4val = new ImageIcon("res/Boxes/4.png");
        Icon icon8val = new ImageIcon("res/Boxes/8.png");
        Icon icon16val = new ImageIcon("res/Boxes/16.png");
        Icon icon32val = new ImageIcon("res/Boxes/32.png");
        Icon icon64val = new ImageIcon("res/Boxes/64.png");
        Icon icon128val = new ImageIcon("res/Boxes/128.png");
        Icon icon256val = new ImageIcon("res/Boxes/256.png");
        Icon icon512val = new ImageIcon("res/Boxes/512.png");
        Icon icon1024val = new ImageIcon("res/Boxes/1024.png");
        Icon icon2048val = new ImageIcon("res/Boxes/2048.png");
        Icon icon4096val = new ImageIcon("res/Boxes/4096.png");

        Icon icon1 = new ImageIcon("res/Boxes/0.png");
        Icon icon2 = new ImageIcon("res/Boxes/0.png");
        Icon icon3 = new ImageIcon("res/Boxes/0.png");
        Icon icon4 = new ImageIcon("res/Boxes/0.png");
        Icon icon5 = new ImageIcon("res/Boxes/0.png");
        Icon icon6 = new ImageIcon("res/Boxes/0.png");
        Icon icon7 = new ImageIcon("res/Boxes/0.png");
        Icon icon8 = new ImageIcon("res/Boxes/0.png");
        Icon icon9 = new ImageIcon("res/Boxes/0.png");
        Icon icon10 = new ImageIcon("res/Boxes/0.png");
        Icon icon11 = new ImageIcon("res/Boxes/0.png");
        Icon icon12 = new ImageIcon("res/Boxes/0.png");
        Icon icon13 = new ImageIcon("res/Boxes/0.png");
        Icon icon14 = new ImageIcon("res/Boxes/0.png");
        Icon icon15 = new ImageIcon("res/Boxes/0.png");
        Icon icon16 = new ImageIcon("res/Boxes/0.png");

        JButton b1 = new JButton(icon1);
        JButton b2 = new JButton(icon2);
        JButton b3 = new JButton(icon3);
        JButton b4 = new JButton(icon4);
        JButton b5 = new JButton(icon5);
        JButton b6 = new JButton(icon6);
        JButton b7 = new JButton(icon7);
        JButton b8 = new JButton(icon8);
        JButton b9 = new JButton(icon9);
        JButton b10 = new JButton(icon10);
        JButton b11 = new JButton(icon11);
        JButton b12 = new JButton(icon12);
        JButton b13 = new JButton(icon13);
        JButton b14 = new JButton(icon14);
        JButton b15 = new JButton(icon15);
        JButton b16 = new JButton(icon16);


        start.setBackground(new java.awt.Color(212, 175, 55));
        start.setBounds(frame.getWidth() / 2 - 150, 300, 300, 150);
        title.setBounds(frame.getWidth() / 2 - 215, -80, 600, 300);
        frame.setVisible(true);
        frame.add(panel);
        panel.add(title);
        panel.add(start);
        title2.setBounds(frame.getWidth() / 2 - 215, -80, 600, 300);
        panel2.add(title2);
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
        frame.setVisible(true);
        frame.show();
    }
}

