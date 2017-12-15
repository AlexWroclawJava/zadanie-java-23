
public class CalendarConverter {

    public static String stala1 = "PONIEDZIALEK";
    public static String stala2 = "WTOREK";
    public static String stala3 = "SRODA";
    public static String stala4 = "CZWARTEK";
    public static String stala5 = "PIATEK";
    public static String stala6 = "SOBOTA";
    public static String stala7 = "NIEDZIELA";

    int dayNumber;

    public void convertDayToString(int DayNumber) {
            switch (dayNumber) {
            case 1:
                System.out.println("Dzień Tygodnia to: ", +stala1);
            case 2:
                System.out.println("Dzień Tygodnia to: ", +stala2);
            case 3:
                System.out.println("Dzień Tygodnia to: ", +stala3);
            case 4:
                System.out.println("Dzień Tygodnia to: ", +stala4);
            case 5:
                System.out.println("Dzień Tygodnia to: ", +stala5);
            case 6:
                System.out.println("Dzień Tygodnia to: ", +stala6);
            case 7:
                System.out.println("Dzień Tygodnia to: ", +stala7);
            default:
                System.out.println("Taki dzien tygodnia nie istenieje");
        }
    }
}
