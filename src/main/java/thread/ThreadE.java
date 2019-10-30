package thread;

import model.Counter;

public class ThreadE extends Thread {
    private Counter counter;
    private int score;

    public ThreadE(Counter counter) {
        this.counter = counter;
        score = 0;
    }

    @Override
    public void run() {
        while (counter.getCount() < Counter.getThreshold()) {
            counter.count();
            score++;
            System.out.println("ThreadE " + ThreadE.currentThread().getName() + " " + counter.getCount());
        }
        System.out.println("ThreadE score is " + score);
    }
}
