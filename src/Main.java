import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Game.introduce());
        System.out.println("ENTER YOUR DIFFICULTY LEVEL (Easy, Medium, Hard) Default set to medium, enter nothing to continue.");

        String difficulty = scan.nextLine();
        if(difficulty.isEmpty()){
            Game game = new Game();
            game.setup();
            game.toString();
            while (!game.won()) {
                game.won();
                while (!game.won()) {
                    game.refresh();
                }
            }
            game.refresh();
        }else{
            Game game = new Game(difficulty);
            game.setup();
            game.toString();
            while (!game.won()) {
                game.won();
                while (!game.won()) {
                    game.refresh();
                }
            }
            game.refresh();
        }
    }
}















