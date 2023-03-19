public class question5 {
    public void arrayPer(int[] nums){
        int arrLength = nums.length;
        int[] ans = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            ans[i] = nums[nums[i]];
        }
        System.out.println();
        System.out.print("Original Array : ");
        for (int i = 0; i < arrLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.print("Ans Array : ");
        for (int i = 0; i < arrLength; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
