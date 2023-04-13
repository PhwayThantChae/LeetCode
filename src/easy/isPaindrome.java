package easy;

public class isPaindrome {
  public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    char[] ch = s.toCharArray();
    String reversedString = "";

    for(int i = s.length() -1 ; i >= 0; i--) {
      reversedString = reversedString + ch[i];
    }

    if(reversedString.equals(s)) {
      return true;
    }

    return false;
  }
}
