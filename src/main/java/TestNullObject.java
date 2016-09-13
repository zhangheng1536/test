/**
 * Created by vivider on 2016/8/25.
 */
public class TestNullObject {
    public static void main(final String[] args) {
        //        final Object object = null;
        //magic(null); //当有多个方法可以接收参数时，java中选择策略为选择更加具体的类型，并且运行他的方法 当有具体类型时使用该类型没差
    }

    public static void magic(final Object o) {
        System.out.println("object passed");
    }

    public static void magic(final String s) {
        System.out.println("String passed");
    }

    public static void magic(final Integer s) {
        System.out.println("Integer passed");
    }

}
