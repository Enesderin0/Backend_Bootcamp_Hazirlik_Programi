import java.util.Scanner;
public class hesapla {
    public static void main(String[] args) {
        // Kullanıcıdan alınacak bilgiler
        double mat,fizik,kimya,tarih,turkce,muzik;
        Scanner input= new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat=input.nextDouble();
        System.out.print("Fizik notunuz : ");
        fizik=input.nextDouble();
        System.out.print("Kimya notunuz : ");
        kimya=input.nextDouble();
        System.out.print("Tarih notunuz : ");
        tarih=input.nextDouble();
        System.out.print("Turkce notunuz : ");
        turkce=input.nextDouble();
        System.out.print("Muzik notunuz : ");
        muzik=input.nextDouble();

        double answer=(mat+fizik+kimya+tarih+muzik+turkce)/6;
        System.out.println("Not Ortalamaniz: "+answer);

        String PassedOrFail=answer>60 ? "Gecti":"kaldı";
        System.out.println(PassedOrFail);

    }
}

