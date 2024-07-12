package ru.job4j;

public class Sequence {

    public static int findSequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;
        int currentNum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentNum) {
                currentLength++;
            } else {
                currentNum = nums[i];
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }
}