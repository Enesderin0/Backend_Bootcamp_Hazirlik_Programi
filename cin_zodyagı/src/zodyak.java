import java.util.Scanner;

public class zodyak {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year,output;
        System.out.print("Doğum yılınızı giriniz: ");
        year= input.nextInt();

        output=year%12;
        switch (output) {
            case 0 -> System.out.println("Maymun");
            case 1 -> System.out.println("Horoz");
            case 2 -> System.out.println("Kopek");
            case 3 -> System.out.println("Domuz");
            case 4 -> System.out.println("Fare");
            case 5 -> System.out.println("Okuz");
            case 6 -> System.out.println("Kaplan");
            case 7 -> System.out.println("Tavsan");
            case 8 -> System.out.println("Ejderha");
            case 9 -> System.out.println("Yılan");
            case 10 -> System.out.println("At");
            case 11 -> System.out.println("Koyun");
        }
    }
}
