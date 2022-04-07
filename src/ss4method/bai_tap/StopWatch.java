package ss4method.bai_tap;

public class StopWatch {

    private long startTime;
    private long endTime;
    long star;
    long stop;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStar() {
        return star;
    }

    public void setStar(long star) {
        this.star = star;
    }

    public long getStop() {
        return stop;
    }

    public void setStop(long stop) {
        this.stop = stop;
    }

    public long getElapsedTime() {

        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("time");

        }
sw.stop = System.currentTimeMillis();
        System.out.println(sw.stop - sw.startTime);

    }

}
