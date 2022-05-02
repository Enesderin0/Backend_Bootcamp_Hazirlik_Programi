import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int randomNumber=(int) (Math.random()*100);
        int right=7;
        Scanner input=new Scanner(System.in);
        System.out.println("Aklımızda tuttuğumuz sayı 0 ile 100 arasındadır");
        while (right>0){
            System.out.print("Tahmin giriniz: ");
            int decide=input.nextInt();
            if (decide==randomNumber){
                System.out.println("Doğru Bildiniz. Oyun Sonlanmıştır.");
                break;
            }else{
                right--;
                if (right==0){
                    System.out.println("Canınız kalmamıştır");
                }else if (decide<randomNumber){
                    System.out.println("Sayı biraz daha büyük");
                }else{
                    System.out.println("Sayı biraz daha küçük");
                }
            }
        }
    }
}
