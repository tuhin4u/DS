package myjava8.module2;

import jdk.nashorn.internal.runtime.options.OptionTemplate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {

        // tomap function
//        testListToMap();

        //sort list
//        sortList();
//
//
//         sort list of list
        sortListofList();
    }
    public static void testListToMap(){


        List<Book> bookList= Book.getDefaultBookList();
//        to map function takes a key mapper and a value mapper
//        Map<String,String> map= bookList.stream().collect(Collectors.toMap(x->x.isbn,x->x.name));
//        System.out.println(map);

//        to map key with year, there will be conflict of duplicacy, IlligalStateException will be thrown at runtime

//        Map<String,String> map= bookList.stream().collect(Collectors.toMap(x->x.isbn,x->x.name));

//        to resolve that we require a merge function
        Map<Integer,Book> map= bookList.stream().collect(
                Collectors.toMap(Book::getReleaseYear, Function.identity(),(existing,replacement)->existing));
        System.out.println(map);

        //to collect in sorted map
        TreeMap<Integer, Book> treeMap = bookList.stream().collect(Collectors.toMap(x -> x.releaseYear, x -> x, (existing, replacement) -> existing, TreeMap::new));
        System.out.println(treeMap);
    }


    public static void sortList(){

        //sorting
        List<Book> bookList= Book.getDefaultBookList();
        bookList.sort((x,y)->-(x.releaseYear-y.releaseYear));
        System.out.println(bookList);

        //sum
        List<Integer> numList= Arrays.asList(10,20,30,10,20,10);
        Integer sum = numList.stream().collect(Collectors.reducing(0, (num1, num2) -> num1 + num2));
        System.out.println(sum);
        Optional<Integer> optionalSum = numList.stream().reduce((num1, num2) -> num1 + num2);
        System.out.println(optionalSum.get());

    }

    public static void sortListofList(){
        List<Integer> list=Arrays.asList(1,2,3);
        list.stream().map(x->x).forEach(x-> System.out.println(x));

        List<List<Integer>> Lists= new ArrayList(Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,8,0,1)));
        System.out.println(Lists);

//        Lists.stream().flatMap(x->x.stream()).forEach(x-> System.out.println(x));
        List<Integer> l=Lists.stream().flatMap(x->x.stream()).sorted().collect(Collectors.toList());
        System.out.println(l);


    }

    //All class for data manupulation
    static class Book {
        private String name;
        private int releaseYear;
        private String isbn;

        public Book(String name, int releaseYear, String isbn) {
            this.name = name;
            this.releaseYear = releaseYear;
            this.isbn = isbn;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public void setReleaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", releaseYear=" + releaseYear +
                    ", isbn='" + isbn + '\'' +
                    '}';
        }

        public static List<Book> getDefaultBookList(){
            List<Book> bookList = new ArrayList<>();
            bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
            bookList.add(new Book("The Two Towers", 1954, "0345339711"));
            bookList.add(new Book("The Return of the King", 1955, "0618129111"));
            return bookList;
        }
    }
}
