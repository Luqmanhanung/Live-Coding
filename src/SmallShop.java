import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Your Product: ");
        String product = input.nextLine();

        System.out.print("Input Your City: ");
        String city = input.nextLine();

        System.out.print("Input Quantity Product: ");
        double quatity = Double.parseDouble(input.nextLine());

        if (city.equals("London")){
            if (product.equals("Coffe")){
                System.out.println("Price Coffe in "+ city + " is "+ quatity * 0.50);
            } else if (product.equals("Water")) {
                System.out.println("Price Water in "+ city + " is "+ quatity * 0.80);
            } else if (product.equals("Beer")) {
                System.out.println("Price Beer in "+ city + " is "+ quatity * 1.20);
            } else if (product.equals("Sweets")) {
                System.out.println("Price Sweet in "+ city + " is "+ quatity * 1.45);
            } else if (product.equals("Peanuts")) {
                System.out.println("Price Peanut in "+ city + " is "+ quatity * 1.60);
            }
        } else if (city.equals("Rome")) {
            if (product.equals("Coffe")){
                System.out.println("Price Coffe in "+ city + " is "+ quatity * 0.40);
            } else if (product.equals("Water")) {
                System.out.println("Price Water in "+ city + " is "+ quatity * 0.70);
            } else if (product.equals("Beer")) {
                System.out.println("Price Beer in "+ city + " is "+ quatity * 1.15);
            } else if (product.equals("Sweets")) {
                System.out.println("Price Sweet in "+ city + " is "+ quatity * 1.30);
            } else if (product.equals("Peanuts")) {
                System.out.println("Price Peanut in "+ city + " is "+ quatity * 1.50);
            }
        } else if (city.equals("Paris")) {
            if (product.equals("Coffe")){
                System.out.println("Price Coffe in "+ city + " is "+ quatity * 0.45);
            } else if (product.equals("Water")) {
                System.out.println("Price Water in "+ city + " is "+ quatity * 0.70);
            } else if (product.equals("Beer")) {
                System.out.println("Price Beer in "+ city + " is "+ quatity * 1.15);
            } else if (product.equals("Sweets")) {
                System.out.println("Price Sweet in "+ city + " is "+ quatity * 1.30);
            } else if (product.equals("Peanuts")) {
                System.out.println("Price Peanut in "+ city + "is "+ quatity * 1.50);
            }
        }else{
            System.out.println("Your Input Is Invalid");
        }
    }
}
