/**
 * @author theboyaply
 * @version V1.0
 * @Date 2019-12-16
 * @description 进制之间的转换
 * 二进制: 0-1 满2进1，以0b或0B开头(是数字0，不是英文字母o)
 * 八进制: 0-7 满8进1，以数字0开头表示
 * 十进制: 0-9 满10进1
 * 十六进制: 0-9及A-F 满16进1，以0x或0X开头(是数字0，不是英文字母o)。此处A-F不分大小写
 *
 */
public class BinarySystem {

    public static void main(String[] args) {
        // 二进制100
        int i1 = 0b01100100;
        // 八进制100
        int i2 = 0144;
        // 十进制100
        int i3 = 100;
        // 十六进制100
        int i4 = 0x64;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }

}
