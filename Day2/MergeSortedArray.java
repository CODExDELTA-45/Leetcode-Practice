import java.util.*;
class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int nums1[] = new int[m+n];
        for(int i = 0; i<m; i++){
            nums1[i] = sc.nextInt();
        }
        int nums2[] = new int[n];
        for(int i = 0; i<n; i++){
            nums2[i] = sc.nextInt();
        }
        merge(nums1,m,nums2,n);
        for(int i = 0; i<m+n; i++){
            System.out.print(nums1[i]+" ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = m; i<m+n; i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}