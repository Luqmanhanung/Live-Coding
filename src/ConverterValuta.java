import java.util.Scanner;

public class ConverterValuta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai Dollar US:");
        double usd = Double.parseDouble(input.nextLine());
        double idr = usd * 15640.30;
        System.out.println("Konversi Nilai Valuta USD Sebesar "+usd+" adalah Rp. "+idr);
    }
}
