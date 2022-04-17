import java.util.Scanner;

public class Uslu_sayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,k,answer = 1;
        System.out.print("Üssü hesaplanacak sayı: ");
        n=scan.nextInt();

        System.out.print("Üs sayısı: ");
        k=scan.nextInt();
        
        for (int i=1;i<=k;i++){
            answer*=n;
        }
        System.out.println("Answer: "+answer);
    }
}
