/**
 * Created by admin on 2015/11/21.
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ArraylistTest
{
       public static void main(String [] arg)
       {
           System.out.println("Ready");
           ArrayList<String> list1 = new ArrayList<>();
           list1.add("f");
           list1.add("u");
           list1.add("n");
           list1.remove(2);
           list1.set(0,"F");
           list1.add("c");
           list1.add("k");
           String a= list1.get(0);
           for (int i=0;i<=9;i++)
           {
               list1.add("\0"+"YIKU~~~");
           }
           Iterator<String> it = list1.iterator();
           while (it.hasNext()) {
               System.out.print(it.next());
           }
           System.out.println("cum~~");
       }

}
