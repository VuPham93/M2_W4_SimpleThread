public class NumberGenerator implements Runnable{
    private int MAX_PRIORITY = 1000;
    private int MIN_PRIORITY = 100;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(hashCode() + ": " + (i + 1));
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
