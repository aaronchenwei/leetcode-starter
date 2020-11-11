function twoSum(nums: number[], target: number): number[] {
  let ans: number[] = [0, 0];

  for (let i = 0; i < nums.length - 1; i += 1) {
    for (let j = i + 1; j < nums.length; j += 1) {
      if (nums[i] + nums[j] == target) {
        ans[0] = i;
        ans[1] = j;
        break;
      }
    }
  }
  return ans;
};

export { twoSum };