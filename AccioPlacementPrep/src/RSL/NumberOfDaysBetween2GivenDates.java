package RSL;

public class NumberOfDaysBetween2GivenDates {
    public static boolean isLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static int calc(int y, int m, int d) {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = d; //total days
        for (int i = 1971; i < y; i++) {
            if (isLeap(i)) {
                days += 366;
            } else {
                days += 365;
            }
        }
        for (int i = 0; i < m - 1; i++) {
            days += month[i];
        }

        if (isLeap(y) && m > 2) {
            days += 1; //if current year is leap year
        }

        return days;
    }

    public int daysBetweenDates(String date1, String date2) {
        int y1 = Integer.parseInt(date1.substring(0, 4));
        int m1 = Integer.parseInt(date1.substring(5, 7));
        int d1 = Integer.parseInt(date1.substring(8));
        int y2 = Integer.parseInt(date2.substring(0, 4));
        int m2 = Integer.parseInt(date2.substring(5, 7));
        int d2 = Integer.parseInt(date2.substring(8));
        return Math.abs(calc(y1, m1, d1) - calc(y2, m2, d2));
    }
}
