import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan biaya trip: ");
        double priceTrip = Double.parseDouble(input.nextLine());
        System.out.print("Masukkan jumlah puzzles: ");
        int numberOfPuzzles = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan jumlah Talking Dolls: ");
        int numberOfTalkingDolls = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan jumlah Teddy Bears: ");
        int numberOfTeddyBears = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan jumlah Minions: ");
        int numberOfMinions = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan jumlah Trucks: ");
        int numberOfTrucks = Integer.parseInt(input.nextLine());

        int totalToys = numberOfPuzzles + numberOfTalkingDolls + numberOfTeddyBears + numberOfMinions + numberOfTrucks;
        double toysPrice = (numberOfPuzzles * 2.6) + (numberOfTalkingDolls * 3)+(numberOfTeddyBears * 4.1) + (numberOfMinions  * 8.2) + (numberOfTrucks * 2);


        if (totalToys>=50){
            toysPrice = toysPrice - (toysPrice * 0.25);
        }
            toysPrice = toysPrice - (toysPrice * 0.1);

        if (toysPrice>= priceTrip){
            System.out.printf("Yes! %.2f USD Left.", toysPrice - priceTrip);
        }else {
            System.out.printf("Not Enough money! %.2f USD needed.", priceTrip - toysPrice);
        }

    }
}
