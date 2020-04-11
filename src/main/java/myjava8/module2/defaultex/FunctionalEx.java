package myjava8.module2.defaultex;

@FunctionalInterface
interface MyFunctionalInterface{
    public int fn();
    default void fn2(){}
}

public class FunctionalEx implements MyFunctionalInterface{
    @Override
    public int fn() {
        return 0;
    }
}
