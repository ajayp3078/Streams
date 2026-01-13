package Codes;

public class ArrangeNums {
    public static void main(String[] args) {

        int[] nums = {1,4,3,7,9,0,8};
        int num = 7;
        // we need to write code such that whatever numbers which are less than 7 should come before
        // and which are greater than 7 should come after
        // eg: 1,4,3,0,7,9,8
        // or 0,1,3,4,7,8,9
        arrangeNumbers(nums,num);

    }

    public static void arrangeNumbers(int[] nums, int num){
        // using three pointers
        int left = 0;
        int mid = 0;
        int right = nums.length-1;

        while(mid<=right){
            if(nums[mid]<num){
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                mid++;
                left++;
            }
            else if(nums[mid]==num){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}
