import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int Number,total=0;
        System.out.print("Sayı giriniz: ");
        Number=input.nextInt();
        for (int i=1;i<=Number;i++){
            if (i%3==0 && i%4==0){
                total+=i;
            }
        }
        System.out.println("Toplamı: "+total);
    }
}
