/**
 * Answer.java
 *
 *
 *
 * @author Brandon Nguyen
 *
 * @version December 07, 2016
 *
 */
public class Answer extends Thread {

    private static int counter = 0;
    private static final int THREADS = 4;
    private static final int COUNT = 100000;

    public static void main(String[] args) {

        Answer[] threads = new Answer[THREADS];
        for (int i = 0; i < THREADS; i++) {

            threads[i] = new Answer();
            threads[i].start();

        }
        try {
            for (int i = 0; i < THREADS; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter: " + counter);
    }

    public void run() {
        for (int i = 0; i < COUNT/THREADS; i++) {
            counter++;
        }
    }

}