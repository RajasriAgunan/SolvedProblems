//6.Rotated sorted array find the target element;
package work2;
import java.util.Scanner;

public class RotatedTargetElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int target = scan.nextInt();
      int result=  targetElement(nums, target);
      if(result!=-1){
          System.out.println(result);
      }else {
          System.out.print("-1");
      }

    }

    public static int targetElement(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if(nums.length==0)
            return -1;
        if(nums.length==1 && nums[0]==target)
            return 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] <= target) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
             else {
                if (nums[mid] <= target && target <= nums[right]){

                    left = mid + 1;}
                     else{
                    right = mid - 1;}
                }
            }


        return -1;

    }
}
//Time Complexity:O(log(n))
//Space Complexity:O(1)