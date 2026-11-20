class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count 0, 1 and 2
        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        // Fill array with sorted values
        int index = 0;

        while (count0 > 0) {
            nums[index++] = 0;
            count0--;
        }

        while (count1 > 0) {
            nums[index++] = 1;
            count1--;
        }

        while (count2 > 0) {
            nums[index++] = 2;
            count2--;
        }
    }
}
