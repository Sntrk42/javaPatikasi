import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[] args) {
        float boy, vucutKitle;
        int kilo;

        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz(cm): ");
        boy = input.nextFloat();

        System.out.println("Kilonuzu giriniz: ");
        kilo = input.nextInt();

        vucutKitle = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: " + vucutKitle);

    }
}
