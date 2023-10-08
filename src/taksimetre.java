import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        double km, tutar, KM = 2.20;
        int minTutar = 20;
        int acilis = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("KM değerini giriniz: ");
        km = input.nextDouble();
        tutar = acilis + km * KM;
        if(tutar > 20)
            System.out.println("Taksi ücreti: " + tutar);
        else
            System.out.println("Taksi ücreti:" + minTutar);
    }
}
