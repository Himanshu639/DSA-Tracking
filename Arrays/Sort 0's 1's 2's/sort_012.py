def sort_012(nums: list[int]):
    n = len(nums)

    i = 0
    j = 0
    k = n - 1

    while j <= k:
        if nums[j] == 0:
            nums[i], nums[j] = nums[j], nums[i]
            i += 1
            j += 1
        elif nums[j] == 1:
            j += 1
        else:
            nums[j], nums[k] = nums[k], nums[j]
            k -= 1


if __name__ == "__main__":
    nums = [2,1,0,1,2,1,1,0]
    sort_012(nums)
    print(nums)


#    k
# 0, 1, 2
#    i     
#    j 