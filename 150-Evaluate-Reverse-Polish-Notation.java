class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int x, y;
        int z;
        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals(\+\) && !tokens[i].equals(\*\) && !tokens[i].equals(\/\) && !tokens[i].equals(\-\)) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                y = stack.pop();
                x = stack.pop();
                if (tokens[i].equals(\+\)) {
                    z = x + y;
                } else if (tokens[i].equals(\-\)) {
                    z = x - y;
                } else if (tokens[i].equals(\*\)) {
                    z = x * y;
                } else {
                    z = x / y;
                }
                stack.push(z);
            }
        }
        return stack.pop();
    }
}