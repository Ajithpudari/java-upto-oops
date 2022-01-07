package com.java.Exampthis;


class Calc
{
    int n1;
    int n2;
    int result;

    public Calc(int num1,int num2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

}

public class Thisone
{
    public static void main(String[] args)
    {
        Calc obj = new Calc(6,5);

        System.out.println(obj.n1);
        System.out.println(obj.n2);

    }
}