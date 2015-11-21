/**
 * Created by admin on 2015/11/21.
 */
import java.util.Scanner;
class fuck
        {

        }

public class Thread2 extends fuck implements Runnable
{
   public void run()
   {
      Scanner a=new Scanner(System.in);
       int j=a.nextInt();
       int d=a.nextInt();
       cutIn(j,d);
   }

    public static void main(String [] args)
   {
       Thread2 threadX = new Thread2();
       Thread thread1 = new Thread(threadX);
       Thread thread2 = new Thread(threadX);
       thread1.start();
       thread2.start();
   }
           public void  cutIn(int Jsize,int Dsize)
           {
            synchronized (this)
            {
              if (Jsize-Dsize>=0&&Jsize-Dsize<2)  { System.out.println("kimoji");}
              else {System.out.println("I feel bad");}
            }
           }


}


