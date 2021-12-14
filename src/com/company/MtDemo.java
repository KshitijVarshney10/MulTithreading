package com.company;

public class MtDemo implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("MyThread");
        }
    }
}
class Test
{
    public static void main(String[] args)
    {
        MtDemo obj = new MtDemo();
        Thread obj2 = new Thread(obj);
        obj2.start();
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Main Thread");
        }
    }
}
