import java.util.Scanner;
public class vke {
    public static void main(String[] args) {
        double boy,vke;
        int kilo;

        Scanner input= new Scanner(System.in);
        System.out.print("Boyunuzu lütfen metre cinsinden giriniz (1,70 gibi): ");
        boy=input.nextDouble();

        System.out.print("kilonuzu giriniz (75 gibi): )");
        kilo= input.nextInt();

        vke=kilo/(boy*boy);

        System.out.println("Vücut Kitle Endeksiniz: "+vke);
    }
}
