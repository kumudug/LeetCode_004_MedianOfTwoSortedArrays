package com.company;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //Find midpoint
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int totalLength = nums1Length + nums2Length;
        int quotient = totalLength / 2;
        int remainder = totalLength % 2;
        if (remainder > 0) {
            quotient++;
        }
        int nums1Runner = 0;
        int nums2Runner = 0;
        double median1 = 0;
        double median2 = 0;

        for (int i = 0; i < (remainder == 0 ? quotient+1 : quotient); i++) {
            if (nums1Runner < nums1Length && nums2Runner < nums2Length) {
                if (nums1[nums1Runner] > nums2[nums2Runner]) {
                    median1 = median2;
                    median2 = nums2[nums2Runner];
                    nums2Runner++;
                } else {
                    median1 = median2;
                    median2 = nums1[nums1Runner];
                    nums1Runner++;
                }
            } else if (nums1Runner < nums1Length) {
                median1 = median2;
                median2 = nums1[nums1Runner];
                nums1Runner++;
            } else {
                median1 = median2;
                median2 = nums2[nums2Runner];
                nums2Runner++;
            }
        }

        if (remainder == 0) {
            median2 = (median1 + median2) / 2;
        }

        return median2;
    }
}
