import model.Counter;
import thread.ThreadE;
import thread.ThreadR;

public class ThreadMain {
    private static Counter counter = new Counter();

    public static void main(String[] args) {

        Thread threadR = new Thread(new ThreadR(counter));
        ThreadE threadE = new ThreadE(counter);

        threadR.start();
        threadE.start();
    }
}
