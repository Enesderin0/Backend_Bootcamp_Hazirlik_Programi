import java.util.Scanner;
public class alan {
    public static void main(String[] args) {
        /*
        HİPOTENÜS BULMA

        int kenar1,kenar2;
        double Hipo,A2B2;
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenarın uzunluğu: ");
        kenar1= input.nextInt();

        System.out.print("2. kenarın uzunluğu: ");
        kenar2= input.nextInt();

        A2B2=((kenar1*kenar1)+(kenar2*kenar2));
        Hipo=Math.sqrt(A2B2);
        System.out.println("Hipotenüs: "+Hipo);
         */
        // ÜÇGENİN ALANINI BULMA
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
