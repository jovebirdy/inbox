import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Thread> list = new ArrayList<Thread>();
        for(int i = 0; i < 100000; i++) {
            Thread thread = new Thread() {
                public void run() {
                    System.out.println(this.getName() + "thread start");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(this.getName() + "thread end");
                }
            };
            thread.start();
            list.add(thread);
        }

        try {
            for(Thread thread : list) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("threads runtime: " + (end - start));
    }
}

