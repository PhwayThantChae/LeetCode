package easy;

class findMiddleIndex {

  public int findMiddleIndex(int[] nums) {
    if(nums.length == 0 || nums.length == 2) {
      return -1;
    } else if(nums.length == 1){
      return 0;
    } else {
      int middleIndex = (int)Math.ceil((double)nums.length/2);
      int sum = 0;
      int count = 0;
      for(int i = 0; i <= middleIndex - 1; i++) {
        sum += nums[i];
        count++;
      }

      if (middleIndex + 1 >= nums.length) {
        return count;
      } else if(sum == nums[middleIndex + 1]) {
        return count;
      } else{
        return 0;
      }
    }
  }
}