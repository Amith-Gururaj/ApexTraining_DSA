public class ShortestSubArraySum {

    public static int shortestSubArrayMatchingSum(int[] arr, int sum){
        int min = -1;
        int i =0;
        int temp = 0;
        int len = 0;
        while(i<arr.length){
            if(arr[i]==sum){
                min = 1;
                break;
            }

            if(temp<sum){
                temp += arr[i];
                len++;
                i++;
            }else{
                if(temp== sum && (min == -1 || len<min)){
                    min = len;
                }
                temp = 0;
                i -= len-1;
                len = 0;
            }
        }
        return min;
    }
}
