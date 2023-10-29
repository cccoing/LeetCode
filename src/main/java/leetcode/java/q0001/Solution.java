package leetcode.java.q0001;

import java.util.HashMap;

/**
 * @author wengxiuting
 * @Email 274887435@qq.com
 * @date 2023/10/29 21:09
 */
class Solution {
  public int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        return new int[]{i, map.get(target - nums[i])};
      }
      map.put(nums[i], i);
    }
    return null;
  }
}