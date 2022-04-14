import java.util.Scanner;
public class etkinlik {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int heat;
        System.out.print("Hava sıcaklığı kaç derece? :");
        heat=input.nextInt();
        if (heat<5){
            System.out.println("Kayak yapmanı öneririz");
        }else if (heat>=10 && heat<=15){
            System.out.println("Sinemaya gidebilir ya da piknik yapabilirsin");
        }else if (heat>=5 && heat<=15){
            System.out.println("Sinamaya gitmeni öneririz");
        }else if (heat>=10 && heat<=25){
            System.out.println("Piknik yapmanı öneririz");
        }else if (heat>25){
            System.out.println("Biraz yüzmeye ne dersin");
        }
    }
}
