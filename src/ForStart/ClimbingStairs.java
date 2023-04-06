package ForStart;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int result = 2;
        int distinction = 1;
        int temp;
        for(int i = 1; i <= n; i++){
            if(n <= 2){
                return n;
            }
            else if(i > 2){
                temp = result;
                result += distinction;
                distinction = temp;
            }
        }
        return result;
    }
}
