// creating threads with Runnable and optimizing with lambda expressions

public class threadsWithRunnable {
    public static void main(String a[]) {
        Runnable obj1 = () -> // represents: Runnable obj1 = new Runnable; nextLine: public void run();
        {
            for(int i = 1; i <= 10; i++)
            {
                System.out.println("first class runnable obj");
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> // represents: Runnable obj2 = new Runnable; nextLine: public void run();
        {
            for(int i = 1; i <= 10; i++)
            {
                System.out.println("second class runnable obj");
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
