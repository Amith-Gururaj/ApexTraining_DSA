public class WaysToClimb {

    public static int findWaysToClimb(int n){
        if(n == 0 || n == 1)
            return n;
        return findWaysToClimb(n-1)+findWaysToClimb(n-2);
    }
}
