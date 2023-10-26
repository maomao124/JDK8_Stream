package mao;

import java.util.*;

/**
 * Project name(项目名称)：JDK8_Stream
 * Package(包名): mao
 * Class(类名): Test16
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/26
 * Time(创建时间)： 12:02
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test16
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(100);
        for (int i = 1000; i < 1100; i++)
        {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(list.stream().max(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o1 - o2;
            }
        }).get());
        System.out.println(list.stream().min(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o1 - o2;
            }
        }).get());
    }
}
