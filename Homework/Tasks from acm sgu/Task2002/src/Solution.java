import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = scanner.nextInt();
        int[] array = new int[lenght];

        for(int i = 0; i < lenght; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < lenght; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}