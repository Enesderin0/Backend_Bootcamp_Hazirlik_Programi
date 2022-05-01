import java.util.Arrays;

public class Repeat {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int liste1[]= {3,7,3,3,2,9,10,21,1,33,9,1};
        int liste2[]=new int[liste1.length];
        int sayac=0;
        for (int i=0;i< liste1.length;i++){
            for (int j=0;j< liste1.length;j++) {
                if (i!=j && liste1[i]==liste1[j]){
                    if (!isFind(liste2,liste1[j])){
                        liste2[sayac++]=liste1[i];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(liste2));
    }
}
