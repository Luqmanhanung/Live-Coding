import java.util.Scanner;

public class WeekendOrWeekday {
    public static void main(String[] args) {
        System.out.print("Input day: ");
        Scanner input = new Scanner(System.in);
        String day = input.nextLine();

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thusday":
            case "Friday":
                System.out.println("Weekday / Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error, please check your keyword");
                break;

        }
    }
}
