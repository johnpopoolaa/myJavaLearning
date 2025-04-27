// using threads in java

class A extends Thread // you create a thread by extending a class by "Thread"
{
    public void run() // Threads use a run() method called by start()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("hi");
            try { // Thread.sleep() gives an exception so we must surround the with try/catch
                Thread.sleep(5); // we use Thread.sleep to make a thread wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("hey");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class threads
{
    public static void main(String a[])
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(7); // use setPriority to assign a value for the priority of the thread. the default is 5 and it ranges from 1 to 10 with  being the least priority and 10 the most

        obj1.start(); // to run a thread, you use the start method which calls the run method in your class(thread)
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}