package Stack;

import java.util.Stack;

public class DesignBrowserHistory {
    Stack<String> backward;
    Stack<String> forward;


    public DesignBrowserHistory(String homepage) {
        backward = new Stack<>();
        backward.push(homepage); //homepage remains inside backward stack
        forward = new Stack<>();
    }

    public void visit(String url) {
        backward.push(url);
        forward.clear();
    }

    public String back(int steps) {
        //homepage will always remain inside backward stack
        while (backward.size() > 1 && steps > 0) {
            steps--;
            String x = backward.pop();
            forward.push(x);
        }
        return backward.peek();
    }

    public String forward(int steps) {
        while (!forward.isEmpty() && steps > 0) {
            steps--;
            String x = forward.pop();
            backward.push(x);
        }
        return backward.peek();
    }
}
