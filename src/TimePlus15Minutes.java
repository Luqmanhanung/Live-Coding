import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jam: ");
        int hour = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Menit: ");
        int minute = Integer.parseInt(input.nextLine());

        int minutePlus15Minutes = minute + 15;
        int minuteToHour = minutePlus15Minutes / 60;
        int modMinutes = minutePlus15Minutes % 60;

        int realHours = hour + minuteToHour;

        if (realHours>23){
            realHours=0;
        }
        System.out.printf("%d:%02d", realHours, modMinutes);
    }
}
