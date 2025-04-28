// using multiple threads with shared variables

class Counter
{
    int count;
    public synchronized void increment() // making the thread use the method one after the other with synchronized
    {
        count++;
    }
}
public class mutableThreads {
    public static void main(String a[]) 
    {
        Counter c = new Counter();

        Runnable obj1 = () ->
        {
            for(int i = 1; i <= 10000; i++)
            {
                c.increment();
            }
        };

        Runnable obj2 = () ->
        {
            for(int i = 1; i <= 10000; i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try 
        {
            t1.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        // make the two threads run completely before main prints the value of count
        try
        {
            t2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(c.count); // printing the value of c
    }
}
