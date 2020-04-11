package myjava8.module2.defaultex;
interface InEx1{
    default void fn(){};
}
interface InEx2 extends InEx1{
    default void fn(){};
}

public class DefaultEx implements InEx2{

}
