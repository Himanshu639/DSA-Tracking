def maxSubArray(nums: list[int]) -> int:
    n = len(nums)
    if n == 0: return 0

    curr_sum = nums[0] if nums[0] > 0 else 0
    max_sum = nums[0]
    for i in range(1,n):
        curr_sum += nums[i]
        max_sum = max(max_sum, curr_sum)
        if curr_sum < 0:
            curr_sum = 0

    return max_sum


if __name__ == "__main__":
    nums = [-2,1,-3,4,-1,2,1,-5,4]
    print(maxSubArray(nums))
