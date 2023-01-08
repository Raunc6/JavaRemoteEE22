public class LetterCountClass {
    public static int[] letterCount(String word) {
        int[] letterCounts = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                int index = c - 'a';
                letterCounts[index]++;
            }
        }
        return letterCounts;
    }
}
}
