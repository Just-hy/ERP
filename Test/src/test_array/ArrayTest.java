package test_array;
import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        //定义一个字符串
        String str = "sfehacdkj4312";

        //将字符串转化为字符数组
        char[] chars = str.toCharArray();

        //按照默认升序进行排序
        Arrays.sort(chars);

        //打印输出
        System.out.println(Arrays.toString(chars));

        //遍历字符数组进行倒叙输出
        System.out.println("倒叙输出结果为:");
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
