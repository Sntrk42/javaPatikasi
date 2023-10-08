import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        float armut = 2.14F, elma = 3.67F, domates = 1.11F, muz = 0.95F, patlican = 5.00F;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldın? ");
        float armutF = input.nextFloat();

        System.out.println("Kaç kilo elma aldın? ");
        float elmaF = input.nextFloat();

        System.out.println("Kaç kilo domates aldın? ");
        float domatesF = input.nextFloat();

        System.out.println("Kaç kilo muz aldın? ");
        float muzF = input.nextFloat();

        System.out.println("Kaç kilo patlıcan aldın? ");
        float patlicanF = input.nextFloat();

        float toplam = (armut * armutF) + (elma * elmaF) + (domates * domatesF) + (muz * muzF) + (patlican * patlicanF);
        System.out.println("Toplam tutar: " + toplam);
    }
}
