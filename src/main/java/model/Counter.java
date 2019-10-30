package model;

public class Counter {

    private static final int THRESHOLD = 100;
    private int count;

    public Counter() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void count() {
        if (count < THRESHOLD) {
            count++;
        }
    }

    public static int getThreshold() {
        return THRESHOLD;
    }
}
