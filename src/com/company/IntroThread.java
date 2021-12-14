
//Multithreading using Thread Class ( extend Thread Class )

class C extends Thread
{
    public void run()
    {
        int x = 1;
        while(x <= 10)
        {
            System.out.println("Thread C " + x);
            x++;
        }
    }
}
class D extends Thread
{
    public void run()
    {
        int x = 1;
        while(x <= 10)
        {
            System.out.println("Thread D " + x);
            x++;
        }
    }
}
/* The disadvantage of inheriting Thread class for implementing the concept of multithreading is that,
   the class in which you have inherited Thread class cannot have any other class as its Parent Class
   as JAVA doesn't support multilevel inheritance.
   If you use Runnable interface for implementing the concept of multithreading
 */
public class IntroThread
{
    public static void main(String[] args)
    {
        C obj1 = new C();
        D obj2 = new D();
        obj1.start();
        obj2.start();
    }
}
