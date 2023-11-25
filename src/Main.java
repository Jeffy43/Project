public class Main {
    public static void main(String[] args) {
        try {
            Game game = new Game("easy");
            game.setup();
            game.print();
            while (!game.won()) {
                game.won();
                while (!game.won()) {
                    game.refresh();
                }
            }
            game.refresh();
            System.out.println("You won!");
        } catch (Exception e) {
            System.out.println("You lost!");
        }
    }
}















