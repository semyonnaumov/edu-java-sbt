public class BarrierMain {
    private final Barrier barrier;
    private final double runningSpeed;
    private final double distance;

    public BarrierMain(Barrier barrier, double doublerunningSpeed, double distance) {
        this.barrier = barrier;
        this.doublerunningSpeed = doublerunningSpeed;
        this.distance = distance;
    }

    public void run(){
        doRun();
        barrier.await();

        printRunningTime();
    }
}
