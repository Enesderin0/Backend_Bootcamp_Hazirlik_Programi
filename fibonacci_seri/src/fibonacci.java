import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int Number,n1=0,n2=1,n3;
        System.out.print("Seri kaç elemanlı olsun: ");
        Number=inp.nextInt();

        for (int i=1;i<=Number-1;i++){
            n3 = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
