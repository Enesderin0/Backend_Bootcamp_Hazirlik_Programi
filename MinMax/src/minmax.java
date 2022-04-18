import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        int Number,min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı giriceksin: ");
        Number=input.nextInt();
        for(int i=1;i<=Number;i++){
            System.out.print(""+i+". sayıyı giriniz: ");
            int x=input.nextInt();
            if(x>min){
                min=x;
            }
            if(x<max){
                max=x;
            }
        }
        System.out.println("max değer= "+min);
        System.out.println("min değer= "+max);
    }
}
