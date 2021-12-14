package com.company;

public class PrintNum implements Runnable
{
    @Override
    public void run()
    {
        synchronized (this)
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println(i+1);
                if((i+1)==5)
                {
                    try
                    {
                        Thread.sleep(5000);
                    }
                    catch (InterruptedException e)
                    {
                      e.printStackTrace();
                    }
                }
            }
        }
    }
}
class PrintMain
{
    public static void main(String[] args)
    {
        PrintNum obj = new PrintNum();
        Thread obj2 = new Thread(obj);
        obj2.start();
    }
}
