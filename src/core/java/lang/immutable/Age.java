package core.java.lang.immutable;

public class Age {
    private int month;
    private int year;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Age{" +
                "month=" + month +
                ", year=" + year +
                '}';
    }
}
