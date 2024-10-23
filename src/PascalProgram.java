import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalProgram {

    public static List<List<Integer>> buildPascalProgram(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));
        if(numRows != 1){
            List<Integer> temp = List.of(1);
            for(int i=1; i<numRows; i++){
                temp = getNextRow(temp);
                res.add(temp);
            }
        }
        return res;
    }

    private static List<Integer> getNextRow(List<Integer> temp) {
        List<Integer> res = new ArrayList<>(temp.size()+1);
        for(int i=0; i<temp.size()+1; i++){
            if(i==0 || i==temp.size()){
                res.add(1);
            }else{
                res.add(temp.get(i-1)+temp.get(i));
            }
        }
        return res;
    }
    /*
        Considering the input parameter height is non zero positive Integer
        Output: Matrix / 2D array
     */
    public static int[][] buildPascalProgramArray(int height){
        int[][] result = new int[height][height];

        result[0][0] = 1;
        if(height != 1){
            int[] temp = new int[]{1};
            for(int i =1; i<height; i++){
                temp = getNextRowArray(temp);
                for(int j =0;j<temp.length;j++){
                    result[i][j] = temp[j];
                }
            }
        }
        return result;
    }

    private static int[] getNextRowArray(int[] temp) {
        int[] res = new int[temp.length+1];
        for(int i =0; i<res.length; i++){
            if(i==0 || i==res.length-1){
                res[i] = 1;
            }else{
                res[i] = temp[i-1]+temp[i];
            }
        }
        return res;
    }
}
