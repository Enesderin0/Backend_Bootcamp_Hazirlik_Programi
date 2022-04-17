import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Number,a,total=0;
        System.out.print("Sayı giriniz: ");
        Number=scan.nextInt();
        while (Number != 0) {
            a = Number % 10;
            total+=a;
            Number /= 10;
        }
        System.out.println(total);
    }
}
