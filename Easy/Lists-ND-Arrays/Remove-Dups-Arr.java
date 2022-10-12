class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) { //if not last element and is duplicate skip to next iteration
                continue;
            }
            // We will update the array in place
            nums[count] = nums[i]; //count only updates when duplicate not found and not at end of array, count will "move" list element by element
            count++;
        }
        return count;
    }
}
