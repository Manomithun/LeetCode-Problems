/** 
3105. Longest Strictly Increasing or Strictly Decreasing Subarray
You are given an array of integers nums. Return the length of the longest subarray of nums which is either strictly increasing or strictly decreasing.

 

Example 1:

Input: nums = [1,4,3,3,2]

Output: 2

Explanation:

The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].

The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].

Hence, we return 2.
**/
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j-1]<nums[j]){
                    max=Math.max(max,j-i+1);
                }
                else break;
            }
        }
        int min=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j-1]>nums[j]){
                    min=Math.max(min,j-i+1);
                }
                else break;
            }
        }
        if(min==0 && max==0 && nums.length>=1)return 1;
        return Math.max(max,min);
    }
}