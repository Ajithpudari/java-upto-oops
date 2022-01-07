package practice24;


class Hi implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("aj");
            try {Thread.sleep(1000); } catch(Exception e) {}
        }
    }
}
class Aj implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("m coming");
            try {Thread.sleep(1000); } catch(Exception e) {}
        }
    }
}
public class RunnableInterface
{
    public static void main(String[] args)
    {
        Runnable obj1 = new Aj();
        Runnable obj2 = new Hi();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);


        t1.start();
        try {Thread.sleep(10); } catch(Exception e) {}
        t2.start();

    }
}