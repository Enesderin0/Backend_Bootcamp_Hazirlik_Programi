import java.util.Scanner;

public class bilet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, age, decide;
        double perkm = 0.10, total;

        System.out.print("Yolunuz kaç KM: ");
        km = input.nextInt();

        System.out.print("Yaşınız: ");
        age = input.nextInt();

        System.out.print("Sadece gidiş için 1, gidiş dönüş için 2' ye basınız: ");
        decide = input.nextInt();

        if (age>=1 && km>=1) {
            total=km*perkm;
            if (age <= 12) {
                total = (total - (total * 0.50));
            } else if (age > 12 && age < 24) {
                total = (total - (total * 0.10));
            } else if (age >= 65) {
                total = (total - (total * 0.30));
            }
            if (decide==1 || decide==2) {
                if (decide == 2) {
                    total = (total - (total * 0.20)) * 2;
                }
            }else{
                System.out.println("Hatalı Veri Girdiniz !");
            }
            System.out.println(total);
        }else{
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
