package com.company;
class Scooby implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Scooby");
    }
}
class Shaggy implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Shaggy");
    }
}
public class ScoobyNshaggy
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Scooby());
        Thread t2 = new Thread(new Shaggy());
        t1.start();
        t2.start();
    }
}
