import java.util.*;
class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(majorityElement(nums));
        
    }

    public static int majorityElement(int[] nums) {
        int maj = nums[0];
        int count = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]==maj){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                maj = nums[i];
                count = 1;
            }
        }
        return maj;
    }
}