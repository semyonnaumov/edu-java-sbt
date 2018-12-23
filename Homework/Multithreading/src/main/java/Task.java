import java.util.concurrent.Callable;

public final class Task<T> {
    private final Callable<T> callable;
    private T result = null;
    private CallableExecutionException exception = null;

    public Task(Callable<? extends T> callable) {
        this.callable = (Callable<T>) callable;
    }

    public T get() {
        if (exception != null) {
            throw exception;
        }
        if (result != null) {
            return (T) ((String) result + " (was read out before going into sync by " + Thread.currentThread().getName() + ")");
        }
        synchronized (this) {
            if (result == null) {
                try {
                    result = callable.call();
                    return result;
                } catch (Exception e) {
                    exception = new CallableExecutionException(e);
                    throw exception;
                }
            }
            return (T) ((String) result + " (was read out by " + Thread.currentThread().getName() + ")");
        }
    }

}
