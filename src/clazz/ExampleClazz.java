package clazz;

/**
 * @author theboyaply
 * @version V1.0
 * @Date 2020-1-7
 * @description
 */
public class ExampleClazz {

    /**
     * 类属性(成员变量)
     */
    private int age;

    /**
     * 类属性(成员变量)
     */
    String name;

    static {
        System.out.println("静态代码块");
    }

    /**
     * 构造器
     */
    public ExampleClazz() {
    }

    /**
     * 内部类
     */
    class InnerClazz {
        /**
         * 内部类属性
         */
        private int innerAge;

        /**
         * 内部类属性
         */
        private String innerName;

        public void hello() {
            System.out.println("内部类方法");
        }
    }
}
