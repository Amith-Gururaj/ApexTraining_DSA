public class SmallestMissingValue {

    public static int findSmallestMissingValueInSortedArray(int[] arr){
        int itr = 0;
        for(int i : arr){
            if(itr != i){
                return itr;
            }
            itr++;
        }
        return -1;
    }
}
