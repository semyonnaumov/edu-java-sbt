import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileStore implements Store<String> {
    @Override
    public void store(String s) throws IOException {
        File file = new File("file.txt");

        Files.write(
                file.toPath(),
                s.getBytes()
        );
    }

    @Override
    public String get() {
        return null;
    }
}
