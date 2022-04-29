public class Harmonik {
    public static void main(String[] args) {
        double[] arr={1,4,6,7,5,3,9};
        double harmonikArr=0.0;
        double avarage=0.0;
        for (double i:arr) {
            harmonikArr+=(1.0/i);
        }
        avarage=arr.length/harmonikArr;
        System.out.println("Ortalama= "+avarage);

    }
}
