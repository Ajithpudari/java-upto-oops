package com.java.prctice9;


class Emp
{
    int aid;
    int asalary;
    static String devlpr;

    public Emp()  // when you create an object
    {
        aid = 1;
        asalary = 50000;
        System.out.println("in constructor");
    }


    static    // when you load a class
    {
        devlpr = "aj";
        System.out.println("in static");
    }


    public void show()
    {
        System.out.println(aid + " : " + asalary + " : " + devlpr);
    }
}

public class StaticExamp
{
    static int i = 0;
    public static void main(String[] args)
    {
        i = 7;

        Emp Ravi= new Emp();
//		navin.eid = 8;
//		navin.salary = 4000;
//		Emp.ceo = "Ravi";

        Emp Billa = new Emp();
//		rahul.aid = 9;
//		rahul.asalary = 50000;
//		Emp.devlpr = "billa";   // we dont need object
//
//

        Billa.show();
        Ravi.show();
    }

}