import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean isEven=true;
        int total=0;
        while (isEven){
            System.out.print("Sayı giriniz: ");
            int Number=input.nextInt();
            if (Number%2==1){
                isEven=false;
            }else if(Number%2==0 && Number%4==0){
                System.out.println("Sayı= "+Number);
                total+=Number;
                System.out.println("Toplam: "+total);
                continue;
            }
        }
        System.out.println("Program bitmiştir. Sayıların toplamı= "+total);
    }
}
