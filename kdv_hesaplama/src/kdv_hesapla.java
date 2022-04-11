import java.util.Scanner;
public class kdv_hesapla{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Fİyat bilgisi giriniz: ");
        double fiyat= input.nextDouble(),kdv;
        if (fiyat<1000 && fiyat>0){
            kdv= 0.18;
            double kdvFiyat18 = fiyat * kdv;
            double answer= fiyat+kdvFiyat18;
            System.out.println("kdv oranı "+kdv);
            System.out.println("kdv dahil fiyat "+answer);
        }else if(fiyat>1000){
            kdv=0.8;
            double kdvFiyat8=fiyat*kdv;
            System.out.println("kdv oranı "+kdv);
            double answer= fiyat+kdvFiyat8;
            System.out.println("kdv dahil fiyat "+answer);
        }else {
            System.out.println("Eksik giriş yaptınız");
        }
    }
}
