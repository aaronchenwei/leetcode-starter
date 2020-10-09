/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  const length = nums.length;

  for (let i = 0; i < length; i += 1)
    for (let j = i + 1; j < length; j += 1) {
      if (nums[i] + nums[j] === target) {
        return [i, j];
      }
    }
};

module.exports = twoSum;
