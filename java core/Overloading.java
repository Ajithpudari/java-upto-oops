package com.java.practice6;


class Ajio
{
    int num1;
    int num2;
    String operation;

    public Ajio()
    {
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
    }
    public Ajio(int i)
    {
        num1 = i;
        num2 = 0;
        operation = "Nothing";
    }
    public Ajio(int i,int j,String op)
    {
        num1 = i;
        num2 = j;
        operation = op;
    }
}



//	public void add(int i , int j)
//	{
//		System.out.println(i + j);
//	}
//	public void add(int i , int j , int k)
//	{
//		System.out.println(i + j + k);
//	}
//	public void add(double i, double j)
//	{
//		System.out.println(i + j);
//	}
//}


public class Overloading
{
    public static void main(String[] args)
    {
        Ajio obj = new Ajio(4,5,"aj");

//		obj.add(5, 2);
//
//		obj.add(4, 3,5);
//
//		obj.add(4.5, 3.8);
    }

}