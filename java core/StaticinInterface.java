package com.java.practice14;


@FunctionalInterface
interface Demo
{
    int num=7;
    void abc();

    static void show()
    {
        System.out.println("hi");
    }

}
class DemoImp implements Demo
{
    public void abc()
    {
     //   num=9;
    }
}

public class StaticinInterface
{
    public static void main(String[] args)
    {

        Demo.show();
    }
}