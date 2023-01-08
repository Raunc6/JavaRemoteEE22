import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        int[] letterCounts = LetterCountClass.letterCount(word);
        for (int i = 0; i < letterCounts.length; i++) {
            char letter = (char) (i + 'a');
            int count = letterCounts[i];
            System.out.print(letter + " - ");
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


