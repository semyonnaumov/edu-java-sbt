import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lenght = scan.nextInt();
        int[] array = new int[lenght];

        for(int i = 0; i < lenght; i++) {
            array[i] = scan.nextInt();
        }


        for(int j = 0; j < 2; j++){
            int max = 0;
            for(int i = 0; i < lenght; i++) {
                max = array[i] >= max ? array[i] : max;
            }
            for(int i = 0; i < lenght; i++) {
                if(array[i] == max){
                    array[i] /= 2;
                }
            }
        }

        for(int i = 0; i < lenght; i++) {
            System.out.print(array[i]);
            if (i < lenght-1){
                System.out.print(" ");
            }
        }
    }
}
