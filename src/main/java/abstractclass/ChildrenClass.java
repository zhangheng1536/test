package abstractclass;

/**
 * Created by vivider on 2016/9/9.
 */
public class ChildrenClass extends AbstractClass {
    @Override protected void printf() {
        System.out.println("Hello World!!!");
    }

    void ttt() {

    }

    public void test() {
        super.collect();
    }
}
