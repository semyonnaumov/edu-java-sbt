import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = new String(scanner.nextLine());
        int length = line.length();

        // Looks in all prefixes and suffixes
        for (int divisor = 0; divisor <= length; divisor++) {
            String prefix = new String(line.substring(0, divisor));
            String suffix = new String(line.substring(divisor));

            if (isPalindrome(prefix) && isPalindrome(suffix)) {
                System.out.println(Answer.YES);
                return;
            }
        }
        System.out.println(Answer.NO);
    }

    public static boolean isPalindrome(String line){
        int length = line.length();
        for (int i = 0, j = length-1; i < length/2; i++, j--) {
            if (line.charAt(i) != line.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public enum Answer {
        YES,
        NO
    }

}

