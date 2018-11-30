import java.io.*;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Naumov\\IdeaProjects\\Java Course\\Lesson 7\\Lesson_7\\src\\Main.java");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println("1");
        try {
            while (true) {
                System.out.println('2');
                String s = reader.readLine();
                if (s == null) break;
                doProcess(s);
                System.out.println(s);
            }
        } finally {
            // Любое закрытие ресурсов должно быть тут
            System.out.println("3");
            reader.close();
            Integer.parseInt("asdsasadas");
            System.out.println("4");
        }
        System.out.println("5");
    }

    private static void doProcess(String s) {
        ////////
    }
}
