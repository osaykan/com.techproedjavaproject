public class Array04 {
    public static void main(String[] args) {
        //Array listesinin ortalamasını bulan java kodunu bulalım
        int[] numbers = {20,30,25,32,-15,11};

        System.out.println(ortalama(numbers));

    }

    public static double ortalama(int[] nummers){
        double sum=0;
        for(int i=0;i<nummers.length;i++){
            sum+=nummers[i];
        }
        double ort=sum/nummers.length;
        return ort;
    }
}
