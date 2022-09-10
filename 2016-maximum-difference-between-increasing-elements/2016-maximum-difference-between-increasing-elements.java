class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0];
        int diff=-1;
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
                continue;
            }
            if(diff<(nums[i]-min) && nums[i]!=min){
                diff=nums[i]-min;
            }
        }
        return diff;
    }
}