package test_array;
import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        //����һ���ַ���
        String str = "sfehacdkj4312";

        //���ַ���ת��Ϊ�ַ�����
        char[] chars = str.toCharArray();

        //����Ĭ�������������
        Arrays.sort(chars);

        //��ӡ���
        System.out.println(Arrays.toString(chars));

        //�����ַ�������е������
        System.out.println("����������Ϊ:");
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
