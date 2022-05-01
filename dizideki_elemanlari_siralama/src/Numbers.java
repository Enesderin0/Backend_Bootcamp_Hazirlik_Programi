import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int weight= input.nextInt();
        int[] list=new int[weight];
        int sayac=1;
        System.out.println();
        for (int i=0;i<weight;i++){
            System.out.print(i+1+". Eleman; ");
            sayac=input.nextInt();
            sayac++;
            list[i]=sayac-1;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
