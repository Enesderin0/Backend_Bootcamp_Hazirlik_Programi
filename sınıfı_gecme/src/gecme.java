import java.util.Scanner;
public class gecme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        double avarage=0;

        System.out.print("Matematik notunuzu giriniz: ");
        mat=input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik=input.nextInt();

        System.out.print("Turkçe notunuzu giriniz: ");
        turkce=input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik=input.nextInt();


        if (mat<=100 && mat>=0){
            avarage+=mat;
        }
        if (fizik<=100 && fizik>=0){
            avarage+=fizik;
        }
        if (turkce<=100 && turkce>=0){
            avarage+=turkce;
        }
        if (kimya<=100 && kimya>=0){
            avarage+=kimya;
        }
        if (muzik<=100 && muzik>=0){
            avarage+=muzik;
        }

        avarage=avarage/5;
         if (avarage<55){
             System.out.println("Ortalamanız: "+avarage+" "+"Sınıfı Geçemediniz");
         }else if (avarage>=55){
             System.out.println("Ortalamanız: "+avarage+" "+"Sınıfı Geçtiniz");
         }



    }
}
