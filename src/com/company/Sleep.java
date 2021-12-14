package com.company;

public class Sleep
{
    public static void main(String[] args)
    {
        int i = 1;
        while(i <= 10)
        {
            try
            {
                if (i==6)
                {
                    System.out.println("Sleep for 5 seconds.");
                    Thread.sleep(5000);
                }
                System.out.println(i);
                i++;
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
