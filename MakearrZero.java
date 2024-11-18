//100460. Make Array Elements Equal to Zero
class Solution {
    
         public static int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0;

       
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
               
                if (simulate(nums, i, -1)) {
                    count++;
                }
               
                if (simulate(nums, i, 1)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean simulate(int[] nums, int s, int d) {
        int[] arr = nums.clone();
        int curr = s;

        while (curr >= 0 && curr < arr.length) {
            if (arr[curr] == 0) {
               
                curr += d;
            } else {
              
                arr[curr]--;
                d= -d;
                curr += d;
            }
        }

       
        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    
}