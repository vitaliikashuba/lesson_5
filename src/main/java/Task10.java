
public class Task10 {
    public enum Day
    {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day theDay = Day.WEDNESDAY;
        printDayGreeting(theDay);
    }
    public static void printDayGreeting(Day day){
        System.out.println("Today is " + (day.ordinal()+1) + " day of week");
    }
}
