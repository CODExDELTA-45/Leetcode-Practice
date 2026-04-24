import java.util.*;

public class JumpGame {

    public static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            
            if (i > maxReach) {
                return false;
            }

            
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];


        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = canJump(nums);

        System.out.println("Can reach last index: " + result);

        sc.close();
    }
}