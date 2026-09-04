// as this is only positive array problem, we can use sliding window approach
// where we move window to right for increment the sum and to left to decrement the sum 

#include <bits/stdc++.h>
using namespace std;

int get_longest_subarr_len_with_k_sum(vector<int>& nums, int k) {
    int n = nums.size();
    if(n == 0) return 0;

    int sum = 0;
    int i = 0;
    int j = 0;
    int longest_len = 0;
    
    while(j < n) {
        if(sum == k) {
            longest_len = max(longest_len, j - i);
            cout<< "i: " << i << " j: " << j << endl;
            sum += nums[j++];
        } else if(sum < k) {
            sum += nums[j++];
        } else {
            sum -= nums[i++];
        }
    }
    if(sum == k)
        longest_len = max(longest_len, j - i);

    return longest_len;
}

int main() {
    vector<int> nums{0,0,0,0,0,3};
    int k = 3;
    int longest_len = get_longest_subarr_len_with_k_sum(nums, k);
    cout << longest_len << endl;
    return 0;
}