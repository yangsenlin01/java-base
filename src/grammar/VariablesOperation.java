package grammar;

/**
 * @author theboyaply
 * @version V1.0
 * @Date 2019-12-12
 * @description 数据类型转换
 */
public class VariablesOperation {

    public void opration1() {
        // 自动类型转换：当容量(数值范围)小的数据类型与容量大的数据类型做运算时，容量小的会自动转换为容量大的数据类型
        // char,byte,short -->>int -->>long -->> float -->> double
        // PS: 当char,byte,short之间作运算时，包括他们自己之间，结果默认为int类型
        int i1 = 1;
        short s1 = 1;
        // 默认转为容量大的int
        int i2 = i1 + s1;
        float f1 = 1.1F;
        // 默认转为容量大的float
        float f2 = f1 + i2;
        // PS: float是4个字节，long是8个字节，但是long能够自动转换为float,主要是因为在内存中浮点数和整型数存储方式不一样
        // https://blog.csdn.net/writing_happy/article/details/78880606
        // 整数在内存中是直接以二进制形式存储的，而浮点数是以指数方式存储的。4字节的float和8字节的long，float的数值范围要远大于long，因此long能够自动转换为float
        long l1 = 1;
        float f3 = l1 + 1;

        // char表示的字符代表的是一个数字，所以char类型也可以用来做运算
        // a代表的数值是97，A代表的是65(均指ASCII码)
        char c1 = 'a';
        int ii1 = c1 + 1;

        // 强制类型转换：容量大转换为容量小的，需要使用强制类型转换符: ()，里面放需要转换的类型
        // 强制类型转换存在的问题：精度损失(丢弃高位数据，保留低位数据)
        long ql1 = 12345L;
        int qi1 = (int) ql1;
        // 精度丢失举例：
        // int类型的12345二进制为0000 0000 0000 0000 0011 0000 0011 1001
        // 转换为byte(1字节/8位)时，丢弃高位数据，保留低位的0011 1001 -->> 57
        byte qb1 = (byte) qi1;

    }

}
