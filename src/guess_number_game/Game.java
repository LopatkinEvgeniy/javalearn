package guess_number_game;

import java.util.concurrent.ThreadLocalRandom;

public class Game {
    public enum GuessResult {
        TOO_SMALL,
        TOO_BIG,
        CORRECT
    }

    private int answer;
    private boolean isEnded;
    private int triesCount;

    public Game(int min, int max) {
        this.answer = ThreadLocalRandom
                .current()
                .nextInt(min, max + 1);
    }

    public GuessResult guess(int userNumber) {
        this.triesCount++;
        if (userNumber == answer) {
            this.isEnded = true;
            return GuessResult.CORRECT;
        }
        if (userNumber > answer) {
            return GuessResult.TOO_BIG;
        }
        return GuessResult.TOO_SMALL;
    }

    public boolean isEnded() {
        return this.isEnded;
    }

    public int getTriesCount() {
        return triesCount;
    }
}
