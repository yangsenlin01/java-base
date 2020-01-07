package clazz;

/**
 * @author theboyaply
 * @version V1.0
 * @Date 2020-1-7
 * @description
 */
public class ParamTransmit {

    public static void main(String[] args) {
        DemoClazz demoClazz = new DemoClazz();
        demoClazz.i = 4;
        demoClazz.j = 5;
        System.out.println("before: i = " + demoClazz.i + ", j = " + demoClazz.j);
        exchange(demoClazz);
        System.out.println("before: i = " + demoClazz.i + ", j = " + demoClazz.j);
    }

    public static void exchange(DemoClazz demoClazz) {
        int temp = demoClazz.i;
        demoClazz.i = demoClazz.j;
        demoClazz.j = temp;
    }

}

class DemoClazz {
    int i;
    int j;
}
