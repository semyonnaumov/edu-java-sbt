import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sLength = scanner.nextLine();
        int length = Integer.parseInt(sLength);
        int printLength = 0;

        String[] words = new String[length];
        String[] printWords = new String[length];

        for (int i = 0; i < length; i++) {
            words[i] = scanner.nextLine();
            if (checkWord(words[i])){
                printWords[printLength] = words[i];
                printLength++;
            }
        }

        for (int i = 0; i < printLength; i++) {
            if (i < printLength - 1){
                System.out.println(printWords[i]);
            }
            else {
                System.out.print(printWords[i]);
            }
        }
    }

    public static boolean checkWord(String word) {
        char[] vowels = {'e', 'y', 'u', 'i', 'o', 'a'};
        int length = word.length();
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (isVowel(word.charAt(i))) {
                counter++;
            }
            else {
                counter = 0;
            }
            if (counter >= 3) {
                return  false;
            }
        }
        return true;
    }

    public static boolean isVowel(char c){
        char[] vowels = {'e', 'y', 'u', 'i', 'o', 'a'};
        for (int i = 0; i < 6; i++) {
            if(c == vowels[i]) {
                return true;
            }
        }
        return false;
    }
}
