public class DaysOfTheWeek {

    private enum DayOfWeek {
        MON,
        TUES,
        WED,
        THURS,
        FRI,
        SAT,
        SUN

    } // end DayOfWeek enum

    public static void main(String[] args) {
        DayOfWeek theDay = DayOfWeek.SAT;

        if(isWeekDay(theDay)) {
            System.out.println("It's a work day, boo!");

        }
        else {
            System.out.println("Yay, it's the weekend!");
        } // end if else

    } // end main method

    public static boolean isWeekDay(DayOfWeek day) {
        if(day != DayOfWeek.SAT && day != DayOfWeek.SUN) {
            return true;
        }
        return false;
    }
} // end DaysOfTheWeek class
