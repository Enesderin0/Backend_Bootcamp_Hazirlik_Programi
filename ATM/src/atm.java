import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String userName,password;
        int right=3,select,balance=1500;
        while (right>0){
            System.out.print("Kullanıcı adınız: ");
            userName=input.nextLine();
            System.out.print("Parolanız: ");
            password=input.nextLine();
            if (userName.equals("kodluyoruz")&&password.equals("dev123")){
                System.out.println("Kodluyoruz bankasına hoşgeldiniz.");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırılacak Para Tutarı: ");
                            int price=input.nextInt();
                            balance+=price;
                            System.out.println("Para yatırma işleminiz başarıyla gerçekleşti.\nHesaptaki paranız: "+balance);
                            break;
                        case 2:
                            System.out.print("Çekilecek Para Tutarı: ");
                            price=input.nextInt();
                            if (price>balance){
                                System.out.println("Yetersiz Bakiye");
                            }else {
                                balance -= price;
                                System.out.println("Para çekme işlemi başarılı.\nKalan Bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Hesabınızdaki Bakiye: "+balance);
                            break;
                        case 4:
                    }
                }while (select!=4);
                break;
            }else{
                right--;
                System.out.println("eksik ya da yanlış giriş yaptınız. Kalan giriş hakkınız: "+right);
                switch (right){
                    case 0:
                    System.out.println("kartınız bloke olmuştur. Lütfen bankanızla iletişime geçiniz.");
                    break;
                }
            }
        }
    }
}
