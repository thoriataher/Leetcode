class Solution {
    ArrayList<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backTrack(\\, 0, 0, n);
        return res;
    }

    private void backTrack(String cur, int open, int close, int n) {
        if (cur.length() == 2 * n) {
            if (open == close) {
                res.add(cur);
            }
            return;
        }
        if (open < n) {
            backTrack(cur + '(', open + 1, close, n);
        }
        if (open > close) {
            backTrack(cur + ')', open, close + 1, n);
        }
    }
}
