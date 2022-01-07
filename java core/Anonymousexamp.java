package com.java.practice;



    class Aj
    {
        public void show()
        {
            System.out.println("in A show");
        }
    }


    public class Anonymousexamp
    {
        public static void main(String[] args)
        {
            Aj obj = new Aj()
            {
                public void show()
                {
                    System.out.println("im the best");
                }
            };

            obj.show();
        }
    }

