bool check(int* nums, int numsSize) {
        int cnt = 0;

        for (int i = 1; i < numsSize; i++) {
            if (nums[i - 1] > nums[i])
                cnt++;
        }
        if (nums[numsSize - 1] > nums[0])
            cnt++;

        return cnt <= 1;
}