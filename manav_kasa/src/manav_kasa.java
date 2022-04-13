import java.util.Scanner;
public class manav_kasa {
    public static void main(String[] args) {
        int elma,armut,domates,muz,patlıcan;
        double elmakg=3.67,armutkg=2.14,domateskg=1.11,muzkg=0.95,patlıcankg=5.00,total;

        Scanner input=new Scanner(System.in);

        System.out.print("Elma kaç kilo: ");
        elma=input.nextInt();
        System.out.print("Armut kaç kilo: ");
        armut=input.nextInt();
        System.out.print("Domates kaç kilo: ");
        domates=input.nextInt();
        System.out.print("Muz kaç kilo: ");
        muz=input.nextInt();
        System.out.print("Patlıcan kaç kilo: ");
        patlıcan=input.nextInt();

        total=(elma*elmakg)+(armut*armutkg)+(domates*domateskg)+(muz*muzkg)+(patlıcan*patlıcankg);
        System.out.println("Toplam fiyat: "+total);
    }
}
