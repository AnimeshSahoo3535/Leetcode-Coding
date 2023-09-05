class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int c=1;
        for(int i=0;i<nums.length;i++){
            if(nums[c-1]!=nums[j]){
      
            nums[c]=nums[j];
            c++;   
            }
          j++;
        }
        return c;
    }
}