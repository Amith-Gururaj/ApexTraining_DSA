public class AxisCoordinator {

    public static int[] AxisCoordinatorOperator(String str){
        int[] res = {0,0};
        for(char s : str.toCharArray()){
            if(s=='U' || s == 'D'){
                if(s=='U')
                    res[1] +=1;
                else
                    res[1] -= 1;
            } else
            if(s=='L' || s == 'R'){
                if(s=='R')
                    res[0] +=1;
                else
                    res[0] -= 1;
            }
        }
        return res;
    }
}
