import java.util.Scanner;

public class CheckItemVegetableOrFruitOrUnknown {
    public static void main(String[] args) {
        System.out.print("Input Item: ");
        Scanner input = new Scanner(System.in);
        String product = input.nextLine();

        if (product.equals("Banana") || product.equals("Apple") || product.equals("Kiwi") || product.equals("Cherry") || product.equals("Lemon") || product.equals("")){
            System.out.println("Fruit");
        } else if (product.equals("Tomato") || product.equals("Cucumber") || product.equals("Peper") || product.equals("Carrot")){
            System.out.println("Vegetable");
        }else {
            System.out.println("Unknown");
        }
    }
}
