import java.util.Arrays;

public class DailyTemperatures {

    public static void main(String[] args){
        int[] temperatures = {73,74,75,71,69,72,76,7};

        System.out.println(Arrays.toString(findTemperaturesDiffDaysApproach1(temperatures)));

        System.out.println(Arrays.toString(findTemperaturesDiffDaysApproach2(temperatures)));
    }

    //Approach 1
    private static int[] findTemperaturesDiffDaysApproach1(int[] arr) {
        int i = 0;
        int j = 1;
        int[] res = new int[arr.length];

        while(i<arr.length-1){
            if(j<arr.length){
                if(arr[i]>=arr[j]){
                    j++;
                }else{
                    res[i] = j-i;
                    i++;
                    j=i+1;
                }
            }else{
                i++;
                j = i+1;
            }
        }

        return res;
    }

    //Approach 2
    private static int[] findTemperaturesDiffDaysApproach2(int[] arr) {
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    res[i] = j - i;
                    break;
                }
            }
        }
        return res;
    }
}
