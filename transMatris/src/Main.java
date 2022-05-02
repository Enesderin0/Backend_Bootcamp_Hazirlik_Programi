import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please determine the matrix colmn: ");
            int colmn=scan.nextInt();
            System.out.print("Please determine the matrix row: ");
            int row=scan.nextInt();
            int[][] matris = new int[colmn][row];
            int[][] transMatris = new int[row][colmn];
            for (int i = 0; i <colmn ; i++) {
                for (int j = 0; j <row ; j++) {
                    System.out.print("Please enter the matris ["+(i+1)+","+(j+1)+"]: ");
                    matris [i][j] = scan.nextInt();
                    transMatris[j][i]=matris[i][j];
                }
            }
            System.out.println("Your matris:");
            for (int i = 0; i <colmn ; i++) {
                for (int j = 0; j <row ; j++) {
                    System.out.print(matris[i][j]+",\s");
                }
                System.out.println();
            }
            System.out.println("-------------------------------------------------");
            System.out.println("Transpose matris:");
            for (int i = 0; i <row; i++) {

                for (int j = 0; j <colmn ; j++) {
                    System.out.print(transMatris[i][j]+",\s");
                }
                System.out.println();
            }
        }
}
