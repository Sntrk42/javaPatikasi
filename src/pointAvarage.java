import java.util.Scanner;

public class pointAvarage {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.println("Müzik notunuz: ");
        muzik = inp.nextInt();

        int sum = (mat + fizik+ kimya+ turkce + tarih + muzik);
        double avg = sum / 6.0;

        System.out.println("Not ortalamanız: " + avg);

        String result  = avg >= 60 ? "Sınıfı geçti." : "Sınıfta kaldı";
        System.out.println(result);


    }
}
