public class Day_5_Sum_OF_N {
    public static int sunFirstN(int n){
        if (n==1){
            return 1;
        }
        int sum = 0;
        sum = n + sunFirstN(n-1);
        return sum;
    }
}
