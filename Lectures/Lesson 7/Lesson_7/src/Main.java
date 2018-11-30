public class Main {
    public static void main(String[] args) {
        doWork();
        System.out.println("END");
    }

    private static void doWork(){
        try {
            doParse();
//        } catch (NumberFormatException e) {
//            System.out.println("NFE");
        } catch (NullPointerException e) {
            System.out.println("NPE");
//        } catch (IllegalArgumentException | IllegalStateException e) {
//            System.out.println("IAE or ISE");
//        } catch (Exception e) {
//            System.out.println("E");
        } finally {
            System.out.println("FINALLY");
        }

        System.out.println("!!!");
    }
    private static void doParse(){
        int z = Integer.parseInt("asdasdasadas");
        System.out.println(z);
    }

    int x() {
        try {
            //Никогда не вернется
            return 9;
        } finally {
            // Вернется именно это!
            return 10;
        }
    }
}
