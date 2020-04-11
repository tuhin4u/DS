/*
package react.rxjava;


import io.reactivex.Observable;

public class FirstRXProg {

    public static void main(String[] args) {
//        Observable<Integer> source = Observable.range(1, 10);
//
//        source.subscribe(n-> System.out.println(n));


        Observable.range(1, 5).subscribe(
                number -> System.out.println(number),
                error -> System.out.println("error"),
                () -> System.out.println("completed")
        );

    }
}
*/
