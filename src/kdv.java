import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        double tutar, kdvOrani;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını girin: ");
        tutar = input.nextDouble();
        if ((tutar > 0) && (tutar <= 1000))
            kdvOrani = 0.18;
        else if (tutar > 1000)
            kdvOrani = 0.08;
        else {
            System.out.println("Hatalı giriş.");
            return;
        }
        double kdvtutar = tutar * kdvOrani;
        double kdvli = tutar + kdvtutar;
        double kdvsiz = tutar;
        System.out.println("KDV tutarı: " + kdvtutar);
        System.out.println("KDV'li tutar: " + kdvli);
        System.out.println("KDV'siz tutar: " + kdvsiz);
    }
}
