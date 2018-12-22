public class TestConsumer {
    private int a = 10;
    private String b = "asd";

    public void setA(int a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "TestConsumer{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}
