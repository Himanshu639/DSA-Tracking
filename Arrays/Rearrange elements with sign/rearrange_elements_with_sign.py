def rearrangeArray(nums: list[int]) -> list[int]:
    n = len(nums)
    if n <= 1: return nums
    pos_idx = 0
    neg_idx = 1
    res = [0] * n

    for i in range(n):
        if nums[i] > 0:
            res[pos_idx] = nums[i]
            pos_idx += 2
        elif nums[i] < 0:
            res[neg_idx] = nums[i]
            neg_idx += 2

    return res

if __name__ == "__main__":
    nums = [3,1,-2,-5,2,-4]
    print(rearrangeArray(nums))