import java.util.Scanner;
public class giris {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String UserName,password,newpassword;
        int decide;

        System.out.print("Kullanıcı adınızı giriniz : ");
        // User name = enesderin0
        UserName=input.nextLine();

        System.out.print("Parolanızı giriniz : ");
        // password = enes135
        password=input.nextLine();

        if ((UserName.equals("enesderin0"))&&(password.equals("enes135"))){
            System.out.println("Giriş başarı ile gerçekeşti");
        }else if (UserName.equals("enesderin0")){
            System.out.println("giriş başarısız");
            System.out.println("şifreyi sıfırlamak için 1'e basınız");
            decide=input.nextInt();
            if (decide==1){
                System.out.print("Yeni parolanızı giriniz: ");
                newpassword= input.next();
                if (newpassword.equals("enes135")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }

    }
}
