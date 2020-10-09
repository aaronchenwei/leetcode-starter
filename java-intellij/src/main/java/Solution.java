class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] answer = new int[2];
      int len = nums.length;

      for (int i = 0; i < len - 1; i += 1) {
        for (int j = i + 1; j < len; j += 1) {
          if (nums[i] + nums[j] == target) {
            answer[0] = i;
            answer[1] = j;
            break;
          }
        }
      }

      return answer;
    }
  }
