import java.io.IOException;

public interface Store<T> {
    void store(T t) throws IOException;

    T get() ;
}
