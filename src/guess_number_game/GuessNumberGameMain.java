package guess_number_game;

public class GuessNumberGameMain {
    private final static int min = 0;
    private final static int max = 100;

    public static void main(String[] args) {
        System.out.printf("Try to guess a number in a range [%d, %d].\n", min, max);

        InputParser inputParser = new InputParser(min, max);
        Game game = new Game(min, max);

        while (!game.isEnded()) {
            int userNumber = inputParser.prompt();
            Game.GuessResult guessResult = game.guess(userNumber);

            switch (guessResult) {
                case CORRECT:
                    System.out.printf("Correct! The answer is %d. Tries count = %d.\n", userNumber, game.getTriesCount());
                    break;
                case TOO_BIG:
                    System.out.println("The number is bigger then an answer. Try again.");
                    break;
                case TOO_SMALL:
                    System.out.println("The number is smaller then an answer. Try again.");
                    break;
            }
        }

        inputParser.close();
    }
}
