import java.util.Scanner;

public class hesapla {
    static int toplama(int n1,int n2){
        return n1+n2;
    }
    static int cikarma(int n1,int n2){
        return n1-n2;
    }
    static int carpma(int n1,int n2){
        return n1*n2;
    }
    static int bolme(int n1,int n2){
        return n1/n2;
    }
    static int us(int n1,int n2,int total){
        total=n1;
        for (int i=2;i<=n2;i++){
            total*=n1;
        }
        return total;
    }
    static int faktoriyel(int n1,int total){
        total=1;
        for (int i=1;i<=n1;i++){
            total*=i;
        }
        return total;
    }
    static int mod(int n1,int n2){
        return n1%n2;
    }
    static int Alan(int n1,int n2){
        int alan=n1*n2;
        return alan;
    }
    static int Cevre(int n1, int n2){
        int cevre=2*(n1+n2);
        return cevre;
    }
    public static void main(String[] args) {
        int n1,n2,decide;
        Scanner inp=new Scanner(System.in);
        System.out.println(
                "toplama = 1\n" +
                "çıkarma = 2\n" +
                "çarpma = 3\n" +
                "bölme = 4\n" +
                "üs alma = 5\n" +
                "faktoriyel hesaplama = 6\n" +
                "mod alma = 7\n"+
                "Dikdörtgen alan ve çevre hesaplama = 8 "+
                "olarak seçim yapınız");
        System.out.print("Seçiminiz: ");
        decide=inp.nextInt();
        do {
            if(decide==1){
                System.out.print("ilk sayıyı giriniz: ");
                n1=inp.nextInt();
                System.out.print("ikinci sayıyı giriniz: ");
                n2=inp.nextInt();
                System.out.println(toplama(n1,n2));
                break;
            }else if (decide==2){
                System.out.print("ilk sayıyı giriniz: ");
                n1=inp.nextInt();
                System.out.print("ikinci sayıyı giriniz: ");
                n2=inp.nextInt();
                System.out.println(cikarma(n1,n2));
                break;
            }else if (decide==3){
                System.out.print("ilk sayıyı giriniz: ");
                n1=inp.nextInt();
                System.out.print("ikinci sayıyı giriniz: ");
                n2=inp.nextInt();
                System.out.println(carpma(n1,n2));
                break;
            }else if (decide==4){
                System.out.print("ilk sayıyı giriniz: ");
                n1=inp.nextInt();
                System.out.print("ikinci sayıyı giriniz: ");
                n2=inp.nextInt();
                System.out.println(bolme(n1,n2));
                break;
            }else if (decide==5){
                System.out.print("Tabanı giriniz: ");
                n1=inp.nextInt();
                System.out.print("Üssü giriniz: ");
                n2=inp.nextInt();
                System.out.println(us(n1,n2,n1));
                break;
            }else if (decide==6){
                System.out.print("Faktoriyeli hesaplanacak sayıyı giriniz: ");
                n1=inp.nextInt();
                System.out.println(faktoriyel(n1,1));
                break;
            }else if (decide==7){
                System.out.print("ilk sayıyı giriniz: ");
                n1=inp.nextInt();
                System.out.print("ikinci sayıyı giriniz: ");
                n2=inp.nextInt();
                System.out.println(mod(n1,n2));
                break;
            }else if (decide==8){
                System.out.print("Kısa kenarı giriniz: : ");
                n1=inp.nextInt();
                System.out.print("Uzun kenarı giriniz: ");
                n2=inp.nextInt();
                System.out.print("Dikdörtgenin Çevresi = ");
                System.out.print(Cevre(n1,n2));
                System.out.print("Dikdörtgenin Alanı= ");
                System.out.print(Alan(n1,n2));
                break;
            }
        }while (decide!=0);

    }
}