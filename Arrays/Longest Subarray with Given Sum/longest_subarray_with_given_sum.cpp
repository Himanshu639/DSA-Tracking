#include <bits/stdc++.h>
using namespace std;

int get_longest_subarr_len_with_k_sum(vector<int>& nums, int k) {
    int curr_sum = 0;
    int n = nums.size();
    int longest_len = -1;
    unordered_map<int, int> prefix_sum;

    for(int i = 0; i < n; i++) {
        curr_sum += nums[i];

        if(curr_sum == k) {
            longest_len = max(longest_len, i+1);
        }
        if(prefix_sum.find(curr_sum - k) != prefix_sum.end()) {
            longest_len = max(longest_len, i - prefix_sum[curr_sum - k]);
        } 
        if(prefix_sum.find(curr_sum) == prefix_sum.end()) {
            prefix_sum[curr_sum] = i;
        }
    }

    return longest_len;
}

int main() {
    vector<int> nums{10, -10, 20, 30};
    int k = 5;
    int longest_sub_arr_len = get_longest_subarr_len_with_k_sum(nums, k);
    cout<< longest_sub_arr_len << endl;
    return 0;
}