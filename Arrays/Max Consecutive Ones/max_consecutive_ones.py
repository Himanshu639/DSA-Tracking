def find_max_consecutive_ones(nums: List[int]) -> int:
    max_ones = 0
    curr_ones = 0
    for num in nums:
        if num:
            curr_ones += 1
        else:
            max_ones = max(max_ones, curr_ones)
            curr_ones = 0
    max_ones = max(max_ones, curr_ones)

    return max_ones

if __name__ == '__main__':
    nums = [1,1,0,1,1,1]
    print(find_max_consecutive_ones(nums))