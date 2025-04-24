package coder25.problemSolving1.maths;

public class DayOfWeek {
    public static void main(String[] args) {
        String day = findDayOfWeek(11, 11, 1800);
        System.out.println(day + " ==========>");
    }

    public static String findDayOfWeek(int day, int month, int year) {
            String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            int months[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            int daysPast = day;
            int normalYear = 0;
            int leapYear = 0;
            for (int i = 1; i < month; i++) {
                daysPast += months[i];
            }
            if (isLeapYear(year)&& month>2) {
                daysPast++;
            }
            year--;
            leapYear =(year / 4) - (year / 100) + (year / 400);
            normalYear=year-leapYear;
            daysPast = daysPast + ((leapYear * 366) % 7) + ((normalYear * 365) % 7);
            return days[(daysPast) % 7];
        }

        private static boolean isLeapYear(int year) {
            return  (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
        }
    }