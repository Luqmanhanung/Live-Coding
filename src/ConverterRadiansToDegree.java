import java.util.Scanner;

public class ConverterRadiansToDegree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Radians: ");
        double radians = Double.parseDouble(input.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
    }
}
