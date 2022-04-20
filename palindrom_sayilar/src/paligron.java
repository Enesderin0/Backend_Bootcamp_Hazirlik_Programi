public class paligron {
    static boolean isPoligron(int Number){
        int LastNumber = 0,temp=Number,reverse = 0;
        System.out.print("Enter a number: ");
        while (temp>0){
            LastNumber=temp%10;
            reverse=(reverse*10)+LastNumber;
            temp/=10;
        }

        if(reverse==Number){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPoligron(492));
    }
}
