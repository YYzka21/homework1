/**
 * Created by admin on 2015/11/20.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
    public class testlist {
        public static void main(String[] args) {
            System.out.println("开始");
            String a = "A", b = "B", c = "C", d = "D", e = "E";
            List<String> list = new LinkedList<String>();
            list.add(a);
            list.add(e);
            list.add(d);
            list.set(1, b);// 更改位置1处的对象e;
            list.remove(0);// 移除位置0处的对象a;
            list.add(2, c);//更改位置2出的对象d;
            System.out.println(list.get(1));//输出位置1出的对象；
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
