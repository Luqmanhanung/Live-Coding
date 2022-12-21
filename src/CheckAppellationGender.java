import java.util.Scanner;

public class CheckAppellationGender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Your Age: ");
        double age = Double.parseDouble(input.nextLine());
        System.out.print("Input Your Gender: ");
        String gender = input.nextLine();

        if (gender.equals("Female")){
            if (age < 16){
                System.out.println("Miss");
            }else {
                System.out.println("Ms.");
            }
        }else if (gender.equals("Male")){
            if (age < 16){
                System.out.println("Master");
            }else {
                System.out.println("Mr.");
            }
        }else {
            System.out.println("Sorry, Your Input Invalid");
        }
    }
}
