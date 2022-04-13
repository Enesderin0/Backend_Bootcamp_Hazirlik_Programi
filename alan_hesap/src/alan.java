import java.util.Scanner;
public class alan {
    public static void main(String[] args) {
        int a,b,c;
        double alan,u;

        Scanner input=new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
        a= input.nextInt();
        System.out.print("2. kenarı giriniz: ");
        b= input.nextInt();
        System.out.print("3. kenarı giriniz: ");
        c= input.nextInt();
        u=(a+b+c)/2;
        double alankare=u*(u-a)*(u-b)*(u-c);
        alan=Math.sqrt(alankare);

        System.out.println("Üçgenin alanı: "+alan);

        // VERİLEN FORMÜLE GÖRE YAPILMIŞTIR!

    }
}
