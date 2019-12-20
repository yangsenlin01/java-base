/**
 * @author theboyaply
 * @version V1.0
 * @Date 2019-12-20
 * @description
 */
public class ArraySort {

    /**
     * 冒泡排序
     * 每次循环，用第i和i+1两位数比较，取最大/小的数
     */
    public static void test1() {
        int[] number = new int[]{23, 54, 12, 7, -2, -89, 324, 0, 89, 34};
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] > number[j + 1]) {
                    number[j] = number[j] ^ number[j + 1];
                    number[j + 1] = number[j] ^ number[j + 1];
                    number[j] = number[j] ^ number[j + 1];
                }
            }
        }
        for (int i = 0; i < number.length - 1; i++) {
            System.out.print(number[i] + "  ");
        }
    }

    /**
     * 快速直接排序
     * 每次循环，找到最小/大的数放到最前面
     */
    public static void test2() {
        int[] number = new int[]{23, 54, 12, 7, -2, -89, 324, 0, 89, 34};
        for (int i = 0; i < number.length - 1; i++) {
            int temp = i;
            for (int j = i; j < number.length; j++) {
                if (number[temp] > number[j]) {
                    temp = j;
                }
            }
            if (temp != i) {
                number[i] = number[temp] ^ number[i];
                number[temp] = number[temp] ^ number[i];
                number[i] = number[temp] ^ number[i];
            }
        }
        for (int i = 0; i < number.length - 1; i++) {
            System.out.print(number[i] + "  ");
        }
    }

}
