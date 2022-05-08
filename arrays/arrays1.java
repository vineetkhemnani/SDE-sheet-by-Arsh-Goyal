package arrays;

import java.util.Scanner;

public class arrays1 {
    public static Scanner scn = new Scanner(System.in);

    public static int findDuplicate(int[] nums) {
        int len = nums.length;
        int[] cnt = new int[len + 1];
        for (int i = 0; i < len; i++) {
            cnt[nums[i]]++;
            if (cnt[nums[i]] > 1) {
                return nums[i];
            }
        }

        return len;
    }
    // =======================================================================
    // public static int findDuplicate(int[] nums){
    //     int len = nums.length;
    //     int [] output_arr = new int[len];
    //     int area=0;
    //     for (int i = 0; i < len; i++) {
    //       int index = Math.abs(nums[i])-1;
    //       if(nums[index]<0){
    //           output_arr[i]= index+1;
    //           nums[index] = -nums[index];
    //           area = output_arr[i];
    //       }
          
    //     //   for (int j = 0; j < len; i++) {
    //     //     // int index = Math.abs(nums[i])-1;
    //     //     System.out.println(output_arr[j]);
    //     // }
        
    //      }
    //     return area;
    //     }
    
    
    
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = scn.nextInt();
        } 
        int a = findDuplicate(nums);
        System.out.println(a);
    }
    
}
