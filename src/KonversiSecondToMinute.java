import java.util.Scanner;

public class KonversiSecondToMinute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan detik pertama: ");
        int timeFirst = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan detik kedua: ");
        int timeSecond = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan detik ketiga: ");
        int timeThird = Integer.parseInt(input.nextLine());

        int totalSeconds = timeFirst + timeSecond + timeThird;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("Jadi Konversi detik ke menit dari "+ totalSeconds +" detik adalah " + "%d:%02d", minutes, seconds);
    }
}
