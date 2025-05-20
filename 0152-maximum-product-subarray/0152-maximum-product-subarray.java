class Solution {
    public int maxProduct(int[] nums) {
        int currmax=1;
        int currmin=1;
        int res=nums[0];

        for(int num : nums)
         {
            if(num == 0){
                currmax=1;
                currmin=1;
                
            }
            int n= num* currmax;
            currmax=Math.max(num, Math.max(num * currmax,num * currmin));
            currmin=Math.min(num, Math.min(n,num * currmin));
            res=Math.max(res,currmax);
         }      
         return res;  
    }
}