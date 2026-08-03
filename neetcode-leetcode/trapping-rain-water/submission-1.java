class Solution {
  public int trap(int[] height) {
    int water = 0;
    int left = 0;
    int right = height.length - 1;

    int maxL = height[left];
    int maxR = height[right];
    while (left < right) {
      if (maxL <= maxR) {
        left++;
        int amt = maxL - height[left];
        if (amt > 0) {
          water += amt;
        }
        maxL = Math.max(maxL, height[left]);
      } else {
        right--;
        int amt = maxR - height[right];
        if (amt > 0) {
          water += amt;
        }
        maxR = Math.max(maxR, height[right]);
      }
    }

    return water;
  }
}
