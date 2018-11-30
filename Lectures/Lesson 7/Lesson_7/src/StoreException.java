import javax.lang.model.type.ErrorType;
import java.util.List;

public class StoreException extends RuntimeException {
    private List<XlsError> errors;

    static class XlsError {
        private int row;
        private int column;
        private ErrorType errorType;
        private String reason;
    }
}
