import java.util.ArrayList;
import java.util.List;

public class VisibleOcean {

    public static void main(String[] args){

        int[] arr = {4,3,2,1};
        List<Integer> res = oceanVisible(arr);
        res.forEach(System.out::print);

        System.out.println();
        int[] arr1 = {4,7,2,3,1};
        res = oceanVisible(arr1);
        res.forEach(System.out::print);
    }

    private static List<Integer> oceanVisible(int[] arr){
        int max = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();

        for(int i = arr.length-1; i>=0; i--){
            if(arr[i]>max){
                max = arr[i];
                res.add(arr[i]);
            }
        }
        return res;
    }
}
