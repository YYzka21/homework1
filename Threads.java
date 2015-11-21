/**
 * Created by admin on 2015/11/21.
 */
public class Threads extends Thread
{
   public void run()
   {
       Thread t = Thread.currentThread();
       System.out.println(t.getName()+">>>>>>>>>>--ÏµÍ³¼´½«±¬Õ¨");
   }
   public static void main(String [] args)
   {
       Threads thread1=new Threads();
       Threads thread2=new Threads();
          thread1.start();
          thread2.start();
      }
    }


