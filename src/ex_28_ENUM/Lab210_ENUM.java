package ex_28_ENUM;

public class Lab210_ENUM {
    public static void main(String[] args) {
        System.out.println(DAY.FRIDAY);
        System.out.println(DAY.SUNDAY);
        System.out.println(PROJECT_NAMES.google);
    }
}

enum DAY{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum PROJECT_NAMES{
    google, katalon, vwo
}
