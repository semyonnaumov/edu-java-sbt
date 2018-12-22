import java.sql.SQLOutput;

public class Holder {
    public Holder(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private int value;
    
    public int sum(int x) {
        Holder holder = new Holder(x);
        //return process(holder);
        //return holder.getValue() + calc(holder.getValue());
        //return holder.value + calc(holder.getValue());
        int z = holder.getValue();
        return holder.value + z + 10 * 47 / z;
    }
    
    private static int process(Holder holder) {
        return holder.getValue() + calc(holder.getValue());
    }
    
    public static int calc(int z){
        return z + 10 * 47 / z;        
    }

    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        process(10);
        System.out.println(System.currentTimeMillis() - t);
    }

    private static void process(int i) {
    }
}
