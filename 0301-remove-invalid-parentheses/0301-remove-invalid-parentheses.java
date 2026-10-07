import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer(s);
        visited.add(s);

        boolean found = false;

        while (!queue.isEmpty() && !found) {
            int size = queue.size();

            for (int k = 0; k < size; k++) {
                String current = queue.poll();

                if (isValid(current)) {
                    result.add(current);
                    found = true;
                    continue;
                }

            
                if (!found) {
                    for (int i = 0; i < current.length(); i++) {

                        
                        if (current.charAt(i) != '(' &&
                            current.charAt(i) != ')') {
                            continue;
                        }

                      
                        if (i > 0 &&
                            current.charAt(i) == current.charAt(i - 1)) {
                            continue;
                        }

                        String next = current.substring(0, i)
                                + current.substring(i + 1);

                        if (visited.add(next)) {
                            queue.offer(next);
                        }
                    }
                }
            }
        }

        return result;
    }

    private boolean isValid(String s) {
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;

              
                if (balance < 0) {
                    return false;
                }
            }
        }

        
        return balance == 0;
    }
}