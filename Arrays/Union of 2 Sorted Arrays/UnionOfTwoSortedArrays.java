import java.util.List;
import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        
        ArrayList<Integer> res = new ArrayList<>();
        int size = -1;
        while(i < n && j < m) {
            if(a[i] < b[j]) {
                if(size == -1 || (size > -1 && a[i] != res.get(size))) {
                    res.add(a[i]);
                    size++;
                }
                i++;
            } else {
                if(size == -1 || (size > -1 && b[j] != res.get(size))) {
                    res.add(b[j]);
                    size++;
                }
                j++;
            }
        }
        
        while(i < n) {
            if(size == -1 || (size > -1 && a[i] != res.get(size))) {
                res.add(a[i]);
                size++;
            }
            i++;
        }
        
        while(j < m) {
            if(size == -1 || (size > -1 && b[j] != res.get(size))) {
                res.add(b[j]);
                size++;
            }
            j++;
        }
        
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,4,6};
        int[] arr2 = {4};
        List<Integer> res = findUnion(arr1, arr2);
        System.out.println(res);
    }
}
