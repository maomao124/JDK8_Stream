package mao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Project name(项目名称)：JDK8_Stream
 * Package(包名): mao
 * Class(类名): Test15
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/26
 * Time(创建时间)： 11:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test15
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(100);
        for (int i = 1000; i < 1100; i++)
        {
            list.add(i);
        }
        Optional<Integer> optional = list.stream().findFirst();
        System.out.println(optional.get());
        System.out.println(list.stream().findAny().get());
    }
}
