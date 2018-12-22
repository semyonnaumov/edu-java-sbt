import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String sThreshold = scanner.nextLine();
        Integer treshold = Integer.parseInt(sThreshold);
        int length = line.length();
        ArrayList<String> trueWordList = new ArrayList<>();

        // Заполняем слово за словом
        for (int start = 0, stop = 0; stop < length; ) {

            // В конце запятая
            if (stop == length-1 && line.charAt(stop) == ',') {
                trueWordList.add(line.substring(start,stop));
                trueWordList.add("");
                start = ++ stop;
                break;
            }

            // В конце буква
            if (stop == length-1 && line.charAt(stop) != ',') {
                trueWordList.add(line.substring(start));
                start = ++ stop;
                break;
            }

            if (line.charAt(stop) != ',') {
                stop++;
            }
            else {
                trueWordList.add(line.substring(start, stop));
                start = ++stop;
            }
        }

//        int size = trueWordList.size();
//        System.out.println("Количество слов: " + size);
//
//        for (int i = 0; i < size; i++) {
//            System.out.println("Слово номер " + i + ": " + trueWordList.get(i));
//        }
        int size = trueWordList.size();
        boolean first = true;
        for (int i = 0; i < size; i++) {
            if (trueWordList.get(i).length() >= treshold) {
                System.out.print((first ? "":",") + trueWordList.get(i));
                first = false;
            }
        }
    }
}
