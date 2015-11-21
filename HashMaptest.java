/**
 * Created by admin on 2015/11/21.
 */
import java.util.HashMap;
public class HashMaptest
{
    public static void main(String [] arg)
    {
        HashMap hs = new HashMap();
        hs.put("name", "凌霄学姐");
        hs.put("skill","移动开发");
        System.out.println("伟大的" + hs.get("name"));
        hs.put("name1","子沂学长");
        hs.put("skill2","丢飞盘");
        hs.put("捡飞盘","凌霄学姐成功捡到子沂学长的飞盘");
        hs.remove("skill2");
         if (hs.containsKey("捡飞盘"))
        {
            System.out.println("凌霄学姐赛高");
        }
    }
}
