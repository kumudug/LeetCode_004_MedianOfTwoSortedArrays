package com.company;

public class Main {

    private static int[] nums1_1 = new int[]{1, 3};
    private static int[] nums1_2 = new int[]{2};
    private static double result1 = 2.0;

    private static int[] nums2_1 = new int[]{1, 2};
    private static int[] nums2_2 = new int[]{3, 4};
    private static double result2 = 2.5;

    private static int[] nums3_1 = new int[]{};
    private static int[] nums3_2 = new int[]{1};
    private static double result3 = 1;

    private static int[] nums4_1 = new int[]{3, 4};
    private static int[] nums4_2 = new int[]{1, 2};
    private static double result4 = 2.5;



    public static void main(String[] args) {
        Solution solution = new Solution();

        double actualResult = solution.findMedianSortedArrays(nums1_1, nums1_2);
        System.out.println(String.format("Expected: %f, Actual %f", result1, actualResult));

        actualResult = solution.findMedianSortedArrays(nums2_1, nums2_2);
        System.out.println(String.format("Expected: %f, Actual %f", result2, actualResult));

        actualResult = solution.findMedianSortedArrays(nums3_1, nums3_2);
        System.out.println(String.format("Expected: %f, Actual %f", result3, actualResult));

        actualResult = solution.findMedianSortedArrays(nums4_1, nums4_2);
        System.out.println(String.format("Expected: %f, Actual %f", result4, actualResult));
    }
}
