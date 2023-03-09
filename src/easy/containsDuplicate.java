package easy;

import java.util.HashSet;
import java.util.Set;

class containsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (int t : nums) {
      set.add(t);
    }

    if(nums.length > 0) {
      return !(set.size() == nums.length);
    } else {
      return false;
    }
  }
}