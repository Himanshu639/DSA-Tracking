def maxSumSubArray(nums: list[int]) -> list[int]:
    n = len(nums)
    if n == 0:
        return []

    curr_sum = nums[0]
    max_sum = curr_sum
    start = 0
    max_start = max_end = 0

    for i in range(1, n):
        if curr_sum < 0:
            curr_sum = nums[i]
            start = i
        else:
            curr_sum += nums[i]

        if curr_sum > max_sum:
            max_sum = curr_sum
            max_start = start
            max_end = i

    return nums[max_start:max_end+1]


if __name__ == "__main__":
    nums = [-2, -3, -7, -2, -10, -4]
    print(maxSumSubArray(nums))