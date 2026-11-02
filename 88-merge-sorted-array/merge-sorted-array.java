class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n == 1) {
            nums1[0] = nums2[0];
            return;
        }
        if (m == 1 && n == 0) {
            return;
        }
        int index = m;
        for (int i = 0; i < n; i++) {
            nums1[index] = nums2[i];
            index++;
        }Arrays.sort(nums1);
    }
}