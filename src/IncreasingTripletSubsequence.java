public class IncreasingTripletSubsequence {

    public static void main(String[] args){
        int[] nums = {2,1,5,0,4,6};

        System.out.println(IncreasingTripletSubsequenceApproach1(nums));

        System.out.println(IncreasingTripletSubsequenceApproach2(nums));
    }

    private static boolean IncreasingTripletSubsequenceApproach2(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int i = 0, j = i+1, k = j+1;
        for(; k<nums.length; i++,j++,k++){
            if(nums[i]<nums[j] && nums[j]<nums[k])
                return true;
        }
        return false;
    }

    private static boolean IncreasingTripletSubsequenceApproach1(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int lCounter = 2;
        int rCounter = 2;

        for(int i=0, j=nums.length-1; i<j ; i++, j--){
            if(nums[i]<nums[i+1])
                lCounter--;
            else
                lCounter = 2;

            if(nums[j]>nums[j-1])
                rCounter--;
            else
                rCounter = 2;

            if(lCounter == 0 || rCounter == 0){
                return true;
            }
        }

        return false;
    }
}
