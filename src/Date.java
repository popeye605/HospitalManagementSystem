public class Date {
    private int day;
    private int month;
    private int year;

    Date() {
        day = 1;
        month = 1;
        year = 1;
    }

    Date(int a, int b, int c) {
        if (day > 0 && month > 0 && month > 12 && year > 0) {
            day = a;
            month = b;
            year = c;
        } else {
            day = 1;
            month = 1;
            year = 1;
        }
    }

    public void setDay(int a) {
        if (day > 0) {
            day = a;
        }
    }

    public void setMonth(int b) {
        if (month > 0 && month < 12) {
            month = b;
        }
    }

    public void setYear(int c) {
        year = c;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

}