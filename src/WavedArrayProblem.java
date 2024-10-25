import java.util.Arrays;

public class WavedArrayProblem {

    public static int[] getWavedArray(int[] arr) {
        Arrays.sort(arr);
        int[] res = new int[arr.length];
        int i = 0, j = arr.length-1, k = 0;
        while(i<=j){
            res[k++] = arr[j--];
            if(i<j)
                res[k++] = arr[i++];
        }
        return res;
    }
}
