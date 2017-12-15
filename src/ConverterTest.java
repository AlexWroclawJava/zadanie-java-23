import java.util.Scanner;

public class ConverterTest {

    public static void main(String[] args) {

        CalendarConverter calendarConverter = new CalendarConverter();

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj cyfrę od 1 do 7: ");
        int dayNumber = scan.nextInt();
        calendarConverter.convertDayToString(dayNumber);
    }
}
