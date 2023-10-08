import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        double k1, k2, Alan;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Kenar uzunluğunu giriniz: ");
        k1 = input.nextDouble();
        System.out.println("2.Kenar uzunluğunu giriniz:");
        k2 = input.nextDouble();

        Alan = k1 * k2 / 2;
        System.out.println("Üçgenin alanı: " + Alan);
    }
}
