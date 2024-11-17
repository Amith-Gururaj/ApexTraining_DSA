public class WaterSnowStored {

    public static void main(String[] args) {
        int[] arr = {0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0};

        System.out.println(waterStored(arr));
    }

    private static int waterStored(int[] arr){
        int res = 0;
        int lmax = Integer.MIN_VALUE;
        int rmax = Integer.MIN_VALUE;
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            if(arr[i]>lmax)
                lmax = arr[i];

            if(arr[j]>rmax)
                rmax = arr[j];

            if(lmax<rmax){
                res = res + (lmax - arr[i]);
                i++;
            }else{
                res = res + (rmax - arr[j]);
                j--;
            }
        }

        return res;
    }
}
