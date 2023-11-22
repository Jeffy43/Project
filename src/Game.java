import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Game {
    String difficulty = "";
    int targetScore = 0;
    int currentScore = 0;
    int box1 = 0;
    int box2 = 0;
    int box3 = 2;
    int box4 = 2;
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
    //object constructor
    public Game(String difficulty, int targetScore){
        this.difficulty = difficulty;
        this.targetScore = targetScore;
        if(difficulty.equals("Easy") || difficulty.equals("easy")){
            this.targetScore = 1024;
        }else if(difficulty.equals("medium") || difficulty.equals("Medium")){
            this.targetScore = 2048;
        }else if(difficulty.equals("hard") || difficulty.equals("Hard")){
            this.targetScore = 4096;
        }else{
            ;
        }
    }
    //prints 4x4 grid
    public void print(){
        System.out.println(box1 + " " + box2 + " " + box3 + " " + box4);
        System.out.println(box5 + " " + box6 + " " + box7 + " " + box8);
        System.out.println(box9 + " " + box10 + " " + box11 + " " + box12);
        System.out.println(box13 + " " + box14 + " " + box15 + " " + box16);
    }


    //dw abt it
    public void clear(){
        boxesWithout.clear();
    }

    //replaces an empty box with 2
    ArrayList<Integer> boxesWithout = new ArrayList();
    public void newTwo() {
        if (box1 == 0) {boxesWithout.add(1);}
        if (box2 == 0) {boxesWithout.add(2);}
        if (box3 == 0) {boxesWithout.add(3);}
        if (box4 == 0) {boxesWithout.add(4);}
        if (box5 == 0) {boxesWithout.add(5);}
        if (box6 == 0) {boxesWithout.add(6);}
        if (box7 == 0) {boxesWithout.add(7);}
        if (box8 == 0) {boxesWithout.add(8);}
        if (box9 == 0) {boxesWithout.add(9);}
        if (box10 == 0) {boxesWithout.add(10);}
        if (box11 == 0) {boxesWithout.add(11);}
        if (box12 == 0) {boxesWithout.add(12);}
        if (box13 == 0) {boxesWithout.add(13);}
        if (box14 == 0) {boxesWithout.add(14);}
        if (box15 == 0) {boxesWithout.add(15);}
        if (box16 == 0) {boxesWithout.add(16);}
        System.out.println(boxesWithout);
        int rand = (int) (Math.random() * boxesWithout.size());

        int placement = boxesWithout.get(rand);
        if (placement == 1){box1 = 2;}
        if (placement == 2){box2 = 2;}
        if (placement == 3){box3 = 2;}
        if (placement == 4){box4 = 2;}
        if (placement == 5){box5 = 2;}
        if (placement == 6){box6 = 2;}
        if (placement == 7){box7 = 2;}
        if (placement == 8){box8 = 2;}
        if (placement == 9){box9 = 2;}
        if (placement == 10){box10 = 2;}
        if (placement == 11){box11 = 2;}
        if (placement == 12){box12 = 2;}
        if (placement == 13){box13 = 2;}
        if (placement == 14){box14 = 2;}
        if (placement == 15){box15 = 2;}
        if (placement == 16){box16 = 2;}
        clear();
    }

    public boolean lost(){
        return boxesWithout.isEmpty();
    }
    //checks if you've won
    public boolean won(){
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

        for(int i=0;i<boxes.size();i++){
            currentScore = boxes.get(i);
            if(highest < currentScore){
                highest = currentScore;
            }
            currentScore= 0;
        }
        if(highest == targetScore){
            won = true;
        }else{
            won = false;
        }
        return won;
    }

    //shift grids
    public void move(){
        Scanner s = new Scanner(System.in);
        if (s.nextLine().equals("d")) {
            if (box3 != 0) {
                if (box4 == 0) {
                    box4 = box3;
                    box3 = 0;
                } else {
                    if (box4 != 0 && box4 == box3) {
                        box4 += box3;
                        box3 = 0;
                    } else {
                        if (box3 != 0 && box1 != 0 && box1 == box3 && box2 == 0) {
                            box3 += box1;
                            box1 = 0;
                        }
                    }
                }
            }

            if (box2 != 0) {
                if (box3 == 0 && box4 == 0) {
                    box4 = box2;
                } else {
                    if (box3 == 0 && box4 != 0) {
                        box3 = box2;
                        box2 = 0;
                        if (box4 == 0) {
                            box4 = box3;
                        } else {
                            if (box4 == box3) {
                                box4 += box3;
                                box3 = 0;
                            }
                        }
                    } else {
                        if (box3 == box2) {
                            box3 += box2;
                            box2 = 0;
                        }
                    }
                }
            }

            if (box1 != 0) {
                if (box2 == 0) {
                    if (box3 == 0 && box4 == 0) {
                        box4 = box1;
                        box1 = 0;
                    } else {
                        if (box3 == 0 && box4 != 0) {
                            box3 = box1;
                            box1 = 0;
                            if (box4 == box3) {
                                box4 += box3;
                                box3 = 0;
                            }
                        } else {
                            if (box3 != 0 && box4 != 0) {
                                box2 = box1;
                                box1 = 0;
                                if (box3 == box2) {
                                    box3 += box2;
                                    box2 = 0;
                                }
                            }
                        }
                    }
                } else {
                    if (box1 == box2) {
                        box2 += box1;
                        box1 = 0;
                    }
                }
            }
        }
    }
}
