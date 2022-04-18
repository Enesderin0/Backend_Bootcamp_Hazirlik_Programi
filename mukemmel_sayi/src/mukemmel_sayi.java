import java.util.Scanner;

public class mukemmel_sayi {
    public static void main(String[] args) {
        int n,total=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        n=inp.nextInt();
        for (int i=1;i<n;i++){
            if (n%i==0){
                total+=i;
            }
        }
        if (n==total){
            System.out.println(""+n+" sayısı mükemmel sayıdır");
        }else{
            System.out.println(""+n+" sayısı mükemmel sayı değildir");
        }
    }
}
