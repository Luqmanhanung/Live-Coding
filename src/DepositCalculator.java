import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah deposit uang: ");
        float deposit = Float.parseFloat(input.nextLine());
        System.out.print("Masukkan lama jangka waktu: ");
        int term = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan persentase bunga: ");
        float interestRate = Float.parseFloat(input.nextLine());
        float percentage = interestRate/100;

        float amount = deposit + term * ((deposit * percentage) / 12);
        System.out.println("Jumlah keseluruhan menjadi " + amount);
    }
}
