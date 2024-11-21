import java.util.Stack;

public class checkValidParantesisOrNot {
    public static void main(String[] args){
        String str = "(a+(b-c)+z)-z)"; //invalid
        System.out.println(checkValidOrNot(str));

        String str1 = "(a + (b -c) +z) - z)"; // extra closing
        System.out.println(checkValidOrNot(str1));

        String str2 = "(a + (b -c) +z - z)"; // valid
        System.out.println(checkValidOrNot(str2));

        String str3 = "((a + (b -c) +z - z)"; // extra opening
        System.out.println(checkValidOrNot(str3));

        String str4 = "(a + {b -c)  +z}"; // bracket types do not match/ brackets overlapping
        System.out.println(checkValidOrNot(str4));

        String str5 = "y + (a + (b -c) +z - z)"; // valid
        System.out.println(checkValidOrNot(str5));
    }

    private static boolean checkValidOrNot(String str){
        Stack<Character> ch = new Stack<Character>();
        for(char c : str.toCharArray()){
            if(!ch.isEmpty() && ((c==']' && ch.peek()=='[') || (c=='}' && ch.peek()=='{') || (c==')' && ch.peek()=='(')))
                ch.pop();
            else if(c==']' || c=='}' || c==')')
                return false;
            else if(c=='[' || c=='{' || c=='(')
                ch.push(c);
        }

        return ch.isEmpty();
    }
}
