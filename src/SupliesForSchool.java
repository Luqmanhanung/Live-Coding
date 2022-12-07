import java.util.Scanner;

public class SupliesForSchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bolpoin = Integer.parseInt(input.nextLine());
        int markers = Integer.parseInt(input.nextLine());
        int detergent = Integer.parseInt(input.nextLine());
        double discount = Double.parseDouble(input.nextLine());
        double realDiscount = discount / 100;
        double amountPriceofBolpoin = bolpoin * 5.8;
        double amountPriceofMarkers = markers *7.2;
        double amountPriceofDetergent = detergent * 1.2;

        double totalPriceGross = amountPriceofBolpoin + amountPriceofMarkers + amountPriceofDetergent;
        double totalPriceNet = totalPriceGross - (totalPriceGross*realDiscount);
        System.out.println(totalPriceNet);

    }
}
