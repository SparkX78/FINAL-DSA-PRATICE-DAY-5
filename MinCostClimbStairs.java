public class MinCostClimbStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] minCost = new int[n+1];
        for(int i = 2; i <= n; i++){
            minCost[i] = Math.min(cost[i-1]+minCost[i-1], cost[i-2]+minCost[i-2]);
        }
        return minCost[n];
    }

    public static void main(String[]  args){
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));
    }
}
