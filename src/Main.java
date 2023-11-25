public class Main {
    public static void main(String[] args) {
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
    }
}















