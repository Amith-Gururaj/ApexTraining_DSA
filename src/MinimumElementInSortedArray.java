public class MinimumElementInSortedArray {

    public static int MinimumElement(int[] arr){
        int res = 0;
        for(int i=0; i<arr.length; i++){
            if(i!=0 && i+1 !=arr.length && arr[i]<arr[i+1] && arr[i]<arr[i-1]){
                res = arr[i];
                break;
            }else if(i==0 && arr[i]<arr[i+1] && arr[i]<arr[arr.length-1]){
                res = arr[i];
                break;
            }else if(i+1==arr.length && arr[i]<arr[i-1] && arr[i]<arr[0]){
                res = arr[i];
                break;
            }
        }
        return res;
    }
}
