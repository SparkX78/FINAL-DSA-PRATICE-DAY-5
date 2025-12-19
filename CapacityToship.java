public class CapacityToship {
    public static int shipWithinDays(int[] weights, int days) {
        int maxCap = 0;
        int minCap = 0;
        for(int i = 0 ; i < weights.length; i++){
            minCap = Math.max(minCap, weights[i]);
            maxCap += weights[i];
        }
        while(minCap < maxCap){
            int mid = minCap + (maxCap - minCap)/2;
            int d = 1;
            int sum = 0;
            for(int weight : weights){
                if((sum + weight)> mid){
                    d++;
                    sum = 0;
                }
                sum += weight;
            }
            
            
            if(d > days){
                minCap = mid+1;
            }
            else{
                maxCap = mid;
            }
        }

            
        
        return minCap;
        
        
    }

    public static void main(String[] args){
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
}
