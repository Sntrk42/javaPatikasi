import java.util.Scanner;
public class daireDilimiAlani {
    public static void main(String[] args) {
        double daireAlani, yaricap, merkezAci, pi =3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Yarı çap ölçüsünü giriniz: ");
        yaricap = input.nextDouble();

        System.out.println("Merkez açısının ölçüsünü giriniz: ");
        merkezAci = input.nextDouble();

        daireAlani = (pi * (yaricap * yaricap) * merkezAci) / 360;
        System.out.println("Dairenin alanı: " + daireAlani);
    }
}
