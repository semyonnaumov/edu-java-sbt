public class Main {
    public static void main(String[] args) {
        Person x = new Person("Alex", 20, null);
        Person y = new Person("Alex", 22, null);
        System.out.println(x.compareTo(y));
        System.out.println(y.compareTo(x));

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }
    }
}
