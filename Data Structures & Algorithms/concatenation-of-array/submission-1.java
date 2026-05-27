class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int [] finalarray = new int[length*2];
        for(int i =0;i<nums.length;i++){
            finalarray[i]=nums[i];
            finalarray[i+nums.length]=nums[i];
        }
        return finalarray;
    }
}