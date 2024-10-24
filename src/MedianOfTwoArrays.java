public class MedianOfTwoArrays {

    public static float MedianOfTwoSortedArrays(int[] arr1, int[] arr2){
        return findMedian(arr1, arr2);
    }

    private static float findMedian(int[] arr1, int[] arr2) {
        int len = arr1.length+arr2.length;
        int i=0; int j =0;
        int counter = len/2;
        if(len%2==0)
            counter--;
        while(counter>0){
            if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
            counter--;
        }
        float median = getMedianBasedOnIndex(len, arr1, arr2, i, j);
        return median;
    }

    private static float getMedianBasedOnIndex(int len, int[] arr1, int[] arr2, int i, int j) {
        float sum = 0;
        if(len%2!=0){
            if(arr1[i]<arr2[j]){
                return arr1[i];
            }else{
                return arr2[j];
            }
        }else{
            if(arr1[i]<arr2[j]){
                sum+=arr1[i];
                if(arr1[i+1]<arr2[j]){
                    sum+=arr1[i+1];
                }else{
                    sum+=arr2[j];
                }
            }else{
                sum+=arr2[j];
                if(arr2[j+1]<arr1[i]){
                    sum+=arr2[j+1];
                }else{
                    sum+=arr1[i];
                }
            }
        }
        return sum/2;
    }
}
