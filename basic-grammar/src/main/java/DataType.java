/**
 * @author theboyaply
 * @version V1.0
 * @Date 2019-12-12
 * @description 四类八种基本数据类型:
 * 注：一个字节 = 1byte = 8bit(位), 即8位的二进制数(整型)。浮点在内存中不是二进制存储，是指数方式存储
 * <p>
 * 整  型     占用存储空间  表数范围
 * byte       1字节= 8bit   -128 ~ 127
 * short      2字节         -2^15 ~ 2^15 - 1
 * int(默认)  4字节         -2^31 ~ 2^31 - 1
 * long       8字节         -2^63 ~ 2^63 - 1
 * <p>
 * 浮点型
 * float       4字节         -3.403E38 ~ 3.403E38
 * double(默认)8字节         -1.798E308 ~ 1.798E308
 * <p>
 * 字符型
 * char         2字节
 * <p>
 * 布尔型
 * boolean      1字节 or 4字节 ?
 */
public class DataType {

    private DataType() {
        // 1. 整型
        byte b1 = 127;
        short s1 = 1;
        int i1 = 1;
        long l1 = 1;
        // 如果数值大于int范围，需要加上一个L，表示定义一个long类型。
        long l2 = 1L;

        // 2. 浮点型
        double d1 = 1.1;
        // float向默认类型double转换，会出现精度损失，因此加上一个f/F表示定义一个float类型
        float f1 = 1.1f;
        float f2 = 1.1F;

        // 3. 字符型, 单引号表示，只能表示一个字符, 涵盖所有书面语字符，包括字母、标点、数字、中文等等
        char c1 = 'a';
        char c2 = '9';
        char c3 = '中';
        // 表示多个可用String等
        String str1 = "asdad";
        // 可以表示转义字符, '\'来将其后面的字符转变为特殊字符型常量
        // 表示换行符
        char c4 = '\n';
        // 使用Unicode值表示字符型常量, \ u xxx，其中xxx代表一个十六进制整数, 每个字符对应一个数值(中间没有空格，为了编译通过加了空格)
        // \ u 1234表示'?'
        char c5 = '\u1234';

        // 4. boolean, 只能是true 或者 false
        boolean boolean1 = true;
        boolean boolean2 = false;
    }

}
