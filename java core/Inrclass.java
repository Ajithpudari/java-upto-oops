package com.java.examp7;


class Outer
{
    static int a;
    public static void show()
    {

    }

    static class Inner  // Outer$Inner.class
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}

public class Inrclass
{
    // variable , method , class
    public static void main(String[] args)
    {
        Outer obj = new Outer();
        obj.show();

//		Outer.Inner obj1 = obj.new Inner();
        Outer.Inner obj1 = new Outer.Inner();
        obj1.display();
    }
}