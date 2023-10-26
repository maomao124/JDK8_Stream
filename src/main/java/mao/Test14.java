package mao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Project name(项目名称)：JDK8_Stream
 * Package(包名): mao
 * Class(类名): Test14
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/26
 * Time(创建时间)： 11:45
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test14
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++)
        {
            list.add(i);
        }
        System.out.println(list.stream().allMatch(new Predicate<Integer>()
        {
            @Override
            public boolean test(Integer integer)
            {
                return integer > 20;
            }
        }));
        System.out.println(list.stream().allMatch(integer -> integer > -2));
        System.out.println(list.stream().anyMatch(integer -> integer > 60));
        System.out.println(list.stream().anyMatch(integer -> integer > -3));
        System.out.println(list.stream().anyMatch(integer -> integer > 120));
        System.out.println(list.stream().noneMatch(integer -> integer > 60));
        System.out.println(list.stream().noneMatch(integer -> integer > -3));
        System.out.println(list.stream().noneMatch(integer -> integer > 120));
    }
}
