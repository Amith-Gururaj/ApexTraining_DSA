import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        permute(arr, 0);
    }

    private static void permute(int[] arr, int start){
        if(start == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i = start ; i<arr.length; i++){
            swap(arr, start, i);
            permute(arr, start + 1);
            swap(arr, start, i);
        }
    }

    private static void swap(int[] arr, int start, int i){
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
    }
}
