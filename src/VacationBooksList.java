import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Halaman: ");
        int numberOfPage = Integer.parseInt(input.nextLine());
        System.out.print("Masukkkan jumlah Halaman per jam: ");
        int pagesPerHour = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan jumlah target hari: ");
        int numberOfDays = Integer.parseInt(input.nextLine());
        int targetResult = (numberOfPage /pagesPerHour)/numberOfDays;
        System.out.println("Jadi Target jumlah hari untuk membaca buku dengan jumlah halaman "+ numberOfPage + " dengan jumlah halaman per jam adalah " + pagesPerHour + " /halaman adalah " + targetResult+" jam/hari");
    }
}
