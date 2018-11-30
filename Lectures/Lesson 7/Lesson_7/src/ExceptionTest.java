public class ExceptionTest {
    public static void main(String[] args)  {
        try {
            double x = sqrt(-43);
        } catch (Exception e) {
            throw new IllegalArgumentException("Exception occurred during risk metric calculation", e);
        }
    }

    private static double sqrt(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Argument must be positive, current = " + n);
        }
        return 100;
    }
}
