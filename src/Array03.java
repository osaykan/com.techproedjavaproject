import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {
        //Array icerisindeki tek sayilari 1 artirip cift sayilari 1 azaltan
       //java methodu yazalim.
    int[] a ={1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(donusum(a)));

    }


    public static int []donusum(int[] a){
        for (int i=0;i<a.length;i++) {

            if (a[i]%2==0) {
                a[i]=a[i]-1;

            }else{
                a[i]=a[i]+1;
            }
        }
  return a;
    }
}
