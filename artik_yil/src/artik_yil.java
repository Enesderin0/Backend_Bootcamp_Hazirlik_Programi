import java.util.Scanner;

public class artik_yil {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Hesaplanacak yılı giriniz: ");
        int year=input.nextInt();
        if (year%4==0){
            System.out.println(""+year+" Artık bir yıldır.");
        }else{
            System.out.println(""+year+" Artık bir yıl değildir.");
        }
    }
}
