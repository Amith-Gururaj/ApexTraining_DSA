import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;

        List<String> sum = getTwoSumIndexes(arr, target);

        sum.stream().forEach(e -> System.out.println(e));

    }

    private static List<String> getTwoSumIndexes(int[] arr, int target){
        List<String> res = new ArrayList<>();

        Map<Integer, Integer> temp = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                res.add(Integer.toString(i));
            }else if(arr[i]<target){
                if(temp.containsKey(arr[i])){
                    res.add(Integer.toString(i)+", "+ Integer.toString(temp.get(arr[i])));
                }else{
                    temp.put(target - arr[i], i);
                }
            }
        }

        return res;
    }
}
