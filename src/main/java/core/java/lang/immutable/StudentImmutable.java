package core.java.lang.immutable;

public final class StudentImmutable{

    private final int id;
    private final String name;
    private final Age age;

    public StudentImmutable(int id, String name,Age age) {
        this.id = id;
        this.name = name;
        Age cloneAge=new Age();
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age=cloneAge;
//        this.age=age;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        Age cloneAge=new Age();
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        return cloneAge;
    }

    @Override
    public String toString() {
        return "StudentImmutable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Age age=new Age();
        age.setMonth(1);
        age.setYear(1990);

        StudentImmutable s=new StudentImmutable(1,"a",age);
        System.out.println(s);
//        age.setYear(1991);
        s.getAge().setYear(1991);
        System.out.println(s);
    }

}
