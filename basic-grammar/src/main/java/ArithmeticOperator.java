import java.util.ArrayList;
import java.util.List;

/**
 * @author theboyaply
 * @version V1.0
 * @Date 2019-12-17
 * @description
 *
 */
public class ArithmeticOperator {

    /**
     * 算术运算符
     * + 加
     * - 减
     * * 乘
     * / 除
     * % 取模
     * ++ 自增1(前/后++)
     * -- 自减1(前/后--)
     */
    public void test() {
        int i = 12;
        // 除法，结果为整数2
        int j = i / 5;
        // 使用double接收结果，此时结果为2
        double d1 = i / 5;
        // 此时结果为2.4
        double d2 = i / 5.0;
        double d3 = (double)i / 5;

        // 取模，结果的正负取决于被模数的正负
        // 2
        int i1 = 12 % 5;
        // 2
        int i2 = 12 % -5;
        // -2
        int i3 = -12 % 5;
        // -2
        int i4 = -12 % -5;

        // 前++ --：先自增/自减1，再做运算
        // 后++ --：先做运算，再自增/自减1
    }

    /**
     * 赋值运算符：用自身作运算然后将结果赋值给自己
     * += 加等于
     * -= 减等于
     * *= 乘等于
     * /= 除等于
     * %= 模等于
     */
    public void test2() {
        int i = 12;
        // 相当于 i = i + 1
        i += 1;

        // 需要注意的是
        short s = 10;
        // 不能写为s = s + 1;，因为s + 1的结果为int类型，使用short类型的s接收是错误的。
        // 但是可以使用+=，因为赋值运算符是在值本身作运算，不存在类型转换。同理其它几个赋值运算符也是这样
        s += 1;
    }

    /**
     * 比较运算符，运算结果为true 或者 false
     * == 等于
     * <= 小于等于
     * >= 大于等于
     * != 不等于
     * < 大于
     * > 小于
     * instanceof 两个对象类型是否相等 A instanceof B
     */
    public void test3() {

    }

    /**
     * 逻辑运算符(左右两端是boolean类型)
     * & 逻辑与
     * && 短路与
     * | 逻辑或
     * || 短路或
     * ! 逻辑非
     * ^ 逻辑异或
     *
     * 关系表
     * a     b     a&b   a|b   a&&b  a||b  a^b   !a
     * true  true  true  true  true  true  false false
     * true  fale  false true  false true  true  false
     * false true  false true  false true  true  true
     * false false false false false false false true
     *
     */
    public void test4() {
        // 逻辑与/逻辑或 和 短路与/短路或的区别
        boolean a = true;
        boolean b = false;
        // 逻辑与：不管前面的a是true还是false，都会执行后面的b
        if (a & b) {
            System.out.println(1);
        }
        // 短路与：如果前面的a是false，则不执行后面的b
        if (a && b) {
            System.out.println(1);
        }
        // 个人总结：
        // 逻辑与/逻辑或：将所有条件全部执行
        // 短路与/短路或：当前面的条件满足/不满足，不执行后面的判断
        // 建议使用短路与/或

        // 下面给出一个明显的例子来证明短路与/短路或的好处
        boolean b2 = true;
        // 短路或：b2满足条件，不执行后面的1 / 0 == 1，不会报错 by zero
        if (b2 || 1 / 0 == 1) {
            System.out.println(1);
        }
        // 逻辑或：即使b2满足条件，但还是会执行后面的的 1 / 0 == 1，因此会报错 by zero
        if (b2 | 1 / 0 == 1) {
            System.out.println(1);
        }
    }

    /**
     * 位运算符(左右两端是数字)
     * << 左移
     * >> 右移
     * >>> 无符号右移(没有无符号左移)
     * & 与运算
     * | 或运算
     * ^ 异或运算
     * ~ 取反
     */
    public void test5() {
        // 左移示例：
        int i2 = 31<<2;
        //   0000 0000 0001 1111 = 31
        // 0000 0000 0001 111100
        //   00 0000 0001 111100 = 124
        // 左移两位，舍去头两位，末尾补0

        // 右移示例：
        int i3 = 31>>2;
        //   0000 0000 0001 1111 = 31
        //   000000 0000 0001 1111
        //   000000 0000 0001 11 = 7
        int i4 = -31>>2;
        // 1111 1111 1110 0001 = -31
        // 111111 1111 1110 0001
        // 111111 1111 1110 00
        // 右移两位，头两位按符号补0或1，舍去尾两位

        // 无符号右移
        int i5 = 31>>>2;
        //   0000 0000 0001 1111 = 31
        //   000000 0000 0001 1111
        //   000000 0000 0001 11 = 7
        int i6 = -31>>>2;
        // 1111 1111 1110 0001 = -31
        // 001111 1111 1110 0001
        // 001111 1111 1110 00
        // (不管是正数还是负数，无符号右移时，头位一律补0)

        // 与运算
        int a = 12;
        int b = 5;
        int c = a & b;
        // a: 0000 0000 0000 1100
        // b: 0000 0000 0000 0110
        // &: 0000 0000 0000 0100 = 4
        // 可以把0看作false，1看作true，&运算时，只有同为1，结果为1

        // 或运算
        c = a | b;
        // a: 0000 0000 0000 1100
        // b: 0000 0000 0000 0110
        // |: 0000 0000 0000 1110 = 13
        // |运算时，只要有1，结果为1

        // 异或运算
        c = a ^ b;
        // a: 0000 0000 0000 1100
        // b: 0000 0000 0000 0110
        // ^: 0000 0000 0000 1010 = 9
        // ^运算时，一个为1，一个为0，结果为1

        // 取反运算
        c = ~a;
        // a:  0000 0000 0000 1100
        // ~a: 1111 1111 1111 0011
        // ~运算时，所有数字全部取反
    }

    public static void main(String[] args) {
        // 交换m和n的值
        int m = 10;
        int n = 7;
        System.out.println("m:" + m + ", n: " + n);
        // 方法一，缺点，需要新增临时变量，消耗内存
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m:" + m + ", n: " + n);

        // 方法二，缺点，当m和n较大时，m+n可能会溢出，导致精度损失
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println("m:" + m + ", n: " + n);

        // 方法三，没有方法一和二的缺点
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("m:" + m + ", n: " + n);
    }
}
