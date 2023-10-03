package Stack.Leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        isValid("()[]{}");
    }
    public static boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        Stack<Character> stack = new Stack<>();
        for(Character currBracket : s.toCharArray()){
            if(currBracket == '{' || currBracket == '(' ||currBracket == '[' ){
                stack.push(currBracket);
            }else{
                if (!(map.get(currBracket) == stack.pop())){
                    return false;
                }
                if(!stack.isEmpty())
                    stack.pop();
            }
        }
        return stack.isEmpty();

    }
}
