class Solution {

  private void func(String s, List<String> out, int open, int close) {
    if (open == 0 && close == 0) {
      out.add(s);
      return;
    }

    if (open > 0) {
      func(s + "(", out, open - 1, close);
    }
    if (open < close) {
      func(s + ")", out, open, close - 1);
    }
  }

  public List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<>();
    if (n > 0) {
      func("(", list, n - 1, n);
    }
    return list;
  }
}
