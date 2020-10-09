package solution

func twoSum(nums []int, target int) []int {
	ans := []int{0, 0}
	for i := 0; i < len(nums)-1; i++ {
		for j := i + 1; j < len(nums); j++ {
			if nums[i]+nums[j] == target {
				ans[0] = i
				ans[1] = j
				return ans
			}
		}
	}
	return ans
}
