import java.util.*;
class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length-1;
        while(i<=j){
            if(nums[i]==val&&nums[j]==val){
                j--;
                continue;
            }
            if(nums[i]==val&&nums[j]!=val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
                continue;
            }
            i++;
        }
        return i;
    }
}