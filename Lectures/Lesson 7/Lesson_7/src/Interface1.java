import java.io.FileNotFoundException;
import java.io.IOException;

interface Interface1 {
    void run() throws IOException;
}

interface Interface2 {
    void run() throws FileNotFoundException, IllegalAccessException;
}

interface Interface3 {
    void run() throws Exception;
}

class Impl implements Interface1, Interface2, Interface3 {

    @Override
    public void run() throws FileNotFoundException {

    }
}