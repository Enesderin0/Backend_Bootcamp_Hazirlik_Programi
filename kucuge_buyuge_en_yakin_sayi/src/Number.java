import java.util.Arrays;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int[] arr={35,24,66,15,80,93,59,74,7,77,4,-90,-13};
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Number= input.nextInt();


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int search=Arrays.binarySearch(arr,Number);

        System.out.println("girilen dizi sayısından bir küçük olan sayı: "+arr[search-1]);
        System.out.println("girilen dizi sayısından bir büyük olan sayı: "+arr[search+1]);
    }
}
