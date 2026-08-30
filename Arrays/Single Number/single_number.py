from typing import List

def single_number(nums: List[int]) -> int:
    xor = 0
    for num in nums:
        xor ^= num
    return xor

if __name__ == '__main__':
    nums = [1,2,3,5,3,2,1]
    print(single_number(nums))