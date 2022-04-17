import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n,r,nTotal=1,rTotal=1,nrfaktor,nrTotal=1;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısınız giriniz: ");
        n=input.nextInt();

        System.out.print("R sayısını giriniz: ");
        r= input.nextInt();

        for (int i=1;i<=n;i++){
            nTotal*=i;
        }
        for (int i=1;i<=r;i++){
            rTotal*=i;
        }
        nrfaktor=n-r;
        for (int i=1;i<=nrfaktor;i++){
            nrTotal*=i;
        }
        int C=nTotal/(rTotal*(nrTotal));
        System.out.println("C(n,r)= "+C);

    }
}
