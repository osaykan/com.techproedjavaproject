import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {

        //Bir String array method oluşturalım ve array
//  elemanlarının her birine istediğimiz eki ekleyebilelim.
        // String [] arr ={"clever", "meek", "hurried", "nice"};  "ly";

        String [] arr ={"clever", "meek", "hurried", "nice"};
   String ek="ly";
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sonEk(arr,ek)));



    }
    public static String[] sonEk (String[]arr,String ek){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=ek;
        }
        return arr;
    }

}
