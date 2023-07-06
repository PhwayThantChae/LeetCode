package easy;

class canPlant {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if(n <= 0) {
      return true;
    }
    if(flowerbed.length <= 0) {
      return false;
    } else if (flowerbed.length == 1) {
      if(flowerbed[0] == 0) {
        return true;
      } else {
        return false;
      }
    } else {
      int canPlant = 0;
      for(int i = 0; i < flowerbed.length; i++) {
        if(flowerbed[i] == 0) {
          int leftSpot;
          int rightSpot;

          if(i == 0) {
            leftSpot = flowerbed[0];
          } else {
            leftSpot = flowerbed[i-1];
          }

          if(i == flowerbed.length - 1) {
            rightSpot = flowerbed[flowerbed.length - 1];
          } else {
            rightSpot = flowerbed[i+1];
          }

          if(leftSpot == 0 && rightSpot == 0) {
            flowerbed[i] = 1;
            canPlant++;
          }
        }
      }
      return canPlant >= n;
    }
  }
}