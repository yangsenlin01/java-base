package array;

/**
 * @author theboyaply
 * @version V1.0
 * @Date 2019-12-17
 * @description
 */
public class ArrayDefine {

    /**
     * 数组的声明
     */
    public void test1() {
        // 静态声明：定义数组的同时,给数组赋值
        String[] str1 = new String[]{"tom"};
        // 动态声明：先声明，再赋值
        String[] str2 = new String[4];
        str2[0] = "tom";
        // 注意: 如果在new String[]里面定义了数组的长度，后面不可再使用{}。即这种写法是错误的new String[4]{}

        // []可以写在String后面，也可以写在变量名后面
        String str3[] = new String[5];
        String[] str4 = new String[5];
    }

    /**
     * 二维数组
     */
    public void test2() {

        int[][] i = new int[][]{{1, 2, 3}, {1, 2, 3, 4, 5}};

        int[][] i1 = new int[1][1];
        i1[0][0] = 1;

        int[][] i2 = new int[1][];
        // 把i2[0]的内容改为一个数组
        i2[0] = new int[5];
        i2[0][0] = 1;

        // 空指针异常
        int[][] i3 = new int[3][];
        // 这个会报空指针。因为i3[0]这里初始化后内容是null，所以i3[0][x] = xxx会报错
        i3[0][1] = 12;
    }

    /**
     * byte,short,int,long数组默认值为0
     * float,double数组默认值为0.0
     * char数组默认值为空格
     * boolean数组默认值为false
     * 在初始化时，相当于给了arr[i] = 默认值，这样一个操作
     */
    public static void main(String[] args) {
        // 默认值为0
        byte[] b = new byte[3];
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        // 默认值为0.0
        float[] f = new float[3];
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }

        // 默认值为空格
        char[] c = new char[3];
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        // 默认值为false
        boolean[] b2 = new boolean[3];
        for (int i = 0; i < b2.length; i++) {
            System.out.println(b2[i]);
        }
    }

}
