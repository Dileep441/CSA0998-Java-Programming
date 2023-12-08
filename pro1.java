import java.util.Scanner;

class HangmanGame {
    private static String[] words = {"java", "hangman", "programming", "computer", "developer","dileep","maaruboina"};
    private static String selectedWord;
    private static char[] guessedWord;
    private static int maxAttempts = 6;
    private static int attemptsLeft;

    public static void main(String[] args) {
        selectRandomWord();
        initializeGuessedWord();

        Scanner scanner = new Scanner(System.in);

        while (attemptsLeft > 0 && !isWordGuessed()) {
            displayHangman();
            displayGuessedWord();

            System.out.print("Enter a letter: ");
            char guess = scanner.next().charAt(0);

            if (!makeGuess(guess)) {
                attemptsLeft--;
                System.out.println("Incorrect! Attempts left: " + attemptsLeft);
            }
        }

        displayHangman();
        if (isWordGuessed()) {
            System.out.println("Congratulations! You guessed the word: " + selectedWord);
        } else {
            System.out.println("Sorry, you ran out of attempts. The word was: " + selectedWord);
        }
    }

    private static void selectRandomWord() {
        int randomIndex = (int) (Math.random() * words.length);
        selectedWord = words[randomIndex];
    }

    private static void initializeGuessedWord() {
        guessedWord = new char[selectedWord.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }
        attemptsLeft = maxAttempts;
    }

    private static void displayHangman() {
        int remainingAttempts = maxAttempts - attemptsLeft;
        System.out.println("Hangman:");
        switch (remainingAttempts) {
            case 1:
                System.out.println("  ____");
                System.out.println(" |    |");
                System.out.println(" |    O");
                break;
            case 2:
                System.out.println("  ____");
                System.out.println(" |    |");
                System.out.println(" |    O");
                System.out.println(" |    |");
                break;
            case 3:
                System.out.println("  ____");
                System.out.println(" |    |");
                System.out.println(" |    O");
                System.out.println(" |   /|");
                break;
            case 4:
                System.out.println("  ____");
                System.out.println(" |    |");
                System.out.println(" |    O");
                System.out.println(" |   /|\\");
                break;
            case 5:
                System.out.println("  ____");
                System.out.println(" |    |");
                System.out.println(" |    O");
                System.out.println(" |   /|\\");
                System.out.println(" |   /");
                break;
            case 6:
                System.out.println("  ____");
                System.out.println(" |    |");
                System.out.println(" |    O");
                System.out.println(" |   /|\\");
                System.out.println(" |   / \\");
                break;
            default:
                break;
        }
    }

    private static void displayGuessedWord() {
        System.out.print("Word: ");
        for (char letter : guessedWord) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    private static boolean makeGuess(char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < selectedWord.length(); i++) {
            if (selectedWord.charAt(i) == guess) {
                guessedWord[i] = guess;
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    private static boolean isWordGuessed() {
        for (char letter : guessedWord) {
            if (letter == '_') {
                return false;
            }
        }
        return true;
    }
}
