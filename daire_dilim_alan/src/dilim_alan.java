import java.util.Scanner;
public class dilim_alan {
    public static void main(String[] args) {
        int a,r;
        double pi=3.14,answer;
        Scanner girdi=new Scanner(System.in);

        System.out.print("yarıçap: ");
        r=girdi.nextInt();

        System.out.print("parçanın açısı: ");
        a =girdi.nextInt();

        answer= (pi * (r*r) * a) / 360;

        System.out.println("Daire diliminin alanı: "+answer);

    }
}
