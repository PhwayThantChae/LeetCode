package easy;

import java.util.Stack;

public class validParentheses {

  public boolean isValid(String s) {
    String[] strArray = new String[] {s};
    boolean isValid = true;

    Stack stack = new Stack();
    String prevChar = null;

    if (strArray.length <= 1) {
      isValid = false;
    }

    for (int i = 0; i < strArray.length; i++) {
      stack.push(strArray[i]);
    }

    while (!stack.empty()) {
      if (prevChar != null) {
        prevChar = stack.pop().toString();
      } else {
        String poppedChar = stack.pop().toString();
        if (!poppedChar.equals(prevChar)) {  // Switched the order of variables in the equality check
          System.out.println(prevChar);
          System.out.println(poppedChar);
          isValid = false;
          break;
        }
      }
    }

    return isValid;
  }
}
