def find_two_sum(nums: list[int], target: int):
    map = {}
    for i, num in enumerate(nums):
        if (target - num) in map.keys():
            return [map[target - num], i]
        if num not in map.keys():
            map[num] = i
    
    return []

if __name__ == "__main__":
    nums = [2,6,5,8,11]
    target = 14
    print(find_two_sum(nums, target))