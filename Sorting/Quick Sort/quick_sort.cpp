#include <bits/stdc++.h>
using namespace std;

void print_vector(vector<int> vec) {
    for(int element: vec) {
        cout<< element << " ";
    }
    cout << endl;
}

void quick_sort_helper(vector<int>& nums, int start, int end) {
    if(start >= end) {
        return;
    }
    int pivot = nums[start];
    int i = start + 1;
    int j = end;
    while(i <= j) {
        while(i <= end && nums[i] <= pivot) {
            i++;
        } 
        while(j >= start && nums[j] > pivot) {
            j--;
        }
        // cout<< "Found first bigger element on left: " << nums[i] << endl;
        // cout<< "Found first smaller element on right: " << nums[j] << endl;
        if(i < j)
            swap(nums[i], nums[j]);
        // print_vector(nums);
    }
    swap(nums[i-1], nums[start]);
    // cout<< "\nStart: " << start << "\tEnd: " << end << "\t\tPivot: " << pivot << endl;
    // cout<< "Final vec: ";
    // print_vector(nums);
    quick_sort_helper(nums, start, i-2);
    quick_sort_helper(nums, i, end);
}

void quick_sort(vector<int>& nums) {
    int n = nums.size();
    quick_sort_helper(nums, 0, n-1);
}

int main() {
    vector<int> nums{4, 2, 4, 4, 1, 4};
    quick_sort(nums);
    print_vector(nums);
    return 0;
}


// 4, 6, 3, 2, 7, 1, 8
// 4, 1, 3, 2, 7, 6, 8