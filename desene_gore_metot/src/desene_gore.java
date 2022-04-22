import java.util.Scanner;

public class desene_gore {
    static int Number(int n){
        int total=n;
        if (total<=0){
            return total;
        }else{
            System.out.println(total);
            return Number(total-5);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=input.nextInt();
        Number(n);
    }
}
