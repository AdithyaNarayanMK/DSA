package Stack.Leetcode;

import java.util.Objects;
import java.util.Stack;

public class BaseballGame682 {
    public static void main(String[] args) {

    }
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<operations.length;i++){
            Character curr = operations[i].toCharArray()[0];
            if(Character.isDigit(curr)){
                int currPoint = Integer.parseInt(operations[i]);
                stack.push(currPoint);
            }else if(!stack.isEmpty() && Objects.equals(curr, "C")){
                stack.pop();
            }else if(!stack.isEmpty() && Objects.equals(curr, "D")){
                int nextPoint = 2 * stack.peek();
                stack.push(nextPoint);
            }else if(!stack.isEmpty() && Objects.equals(curr, "+")){
                int one = stack.pop();
                int two = stack.peek();
            }
        }
       return 0;
    }
}
