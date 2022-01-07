package com.java.practice22;


class Hi extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hi aj");
            try {Thread.sleep(2000); } catch(Exception e) {}
        }
    }
}
class Hello extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Bye aj");
            try {Thread.sleep(1000); } catch(Exception e) {}
        }
    }
}
public class MultiThreading
{
    public static void main(String[] args)
    {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        try {Thread.sleep(10); } catch(Exception e) {}
        obj2.start();

    }
}