import java.util.*;
public class Stack1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();

       
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        
        String rev = "";

        while (!stack.isEmpty()) {
            rev = rev + stack.pop();
        }

        System.out.println(rev);
        sc.close();
    }
}

