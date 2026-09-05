#include <bits/stdc++.h>
using namespace std;

void nextPermutation(vector<int>& nums) {
    int n = nums.size();
    int i;
    for(i = n - 1; i > 0; i--) {
        if(nums[i-1] < nums[i]) {
            break;
        }
    }
    if(i == 0) {
        sort(nums.begin(), nums.end());
    } else {
        int just_greater = nums[i];
        int just_greater_idx = i;
        int j = i;
        for(; j < n; j++) {
            if(nums[j] > nums[i-1]) {
                if(just_greater >= nums[j]) {
                    just_greater = nums[j];
                    just_greater_idx = j;
                }
            }
        }
        swap(nums[just_greater_idx], nums[i-1]);
        reverse(nums.begin() + i, nums.end());
    }
}

void print_vector(vector<int>& nums) {
    for(int num: nums) cout << num << " ";
    cout << endl;
}

int main() {
    vector<int> nums{2,8,9,7,4};
    nextPermutation(nums);
    print_vector(nums);
    return 0;
}