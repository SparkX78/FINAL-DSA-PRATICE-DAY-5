public class Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            rightSum += nums[i];
        }
        int val = 0;
        for(int i = 0; i < nums.length; i++){
            
            rightSum -= nums[i];
            
            if(rightSum == leftSum){
                return i;
            }
            leftSum += nums[i];


        }
        return -1;
        
    }

    public static void main(String[] args){
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
