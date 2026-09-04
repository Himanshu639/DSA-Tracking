def get_majority_element(nums: list[int]) -> int | None:
    n = len(nums)

    majority_ele = None
    majority_ele_occ = 0

    for num in nums:
        if majority_ele_occ == 0:
            majority_ele = num
        if majority_ele == num:
            majority_ele_occ += 1
        else:
            majority_ele_occ -= 1
            

    return majority_ele

if __name__ == "__main__":
    nums = [1,2,2,1,4,2,1,1,4,3] 
    print(get_majority_element(nums))