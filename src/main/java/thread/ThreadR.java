package thread;

import model.Counter;

public class ThreadR implements Runnable {
    private Counter counter;
    private int score;

    public ThreadR(Counter counter) {
        this.counter = counter;
        score = 0;
    }

    @Override
    public void run() {
        while (counter.getCount() < Counter.getThreshold()) {
            counter.count();
            score++;
            System.out.println("ThreadR " + Thread.currentThread().getName() + " "
                    + counter.getCount());
        }
        System.out.println("ThreadR score is " + score);
    }
}
