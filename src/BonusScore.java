import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int startPoint = Integer.parseInt(input.nextLine());
        double bonusPoint = 0;

        if (startPoint <= 100){
            bonusPoint= 5;
        } else if (startPoint > 1000) {
            bonusPoint = startPoint * 0.1;
        } else if (startPoint >  100) {
            bonusPoint = startPoint * 0.2;
        }

        if (startPoint % 2 == 0) {
            bonusPoint = bonusPoint + 1;
        } else if (startPoint % 5 == 0) {
            bonusPoint = bonusPoint + 2;
        }

        System.out.println(bonusPoint);
        System.out.println(startPoint+bonusPoint);

    }
}
