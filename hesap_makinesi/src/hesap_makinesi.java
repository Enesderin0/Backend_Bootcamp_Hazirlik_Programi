import java.util.Scanner;
public class hesap_makinesi {
    public static void main(String[] args) {
        double a,b,total=0;
        Scanner input=new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        a=input.nextDouble();

        System.out.print("2. sayıyı giriniz: ");
        b=input.nextDouble();

        System.out.println("işlem seçenekleri:1= +,2= -,3= *,4= /");
        System.out.print("işlem seçiniz= ");
        int x = input.nextInt();

        switch (x) {
            case 1 -> total += a + b;
            case 2 -> total += a - b;
            case 3 -> total += a * b;
            case 4 -> total += a / b;
            default -> System.out.println("eksik işlem yaptınız.");
        }
        System.out.println("işleminin sonucu = "+total);

    }
}
