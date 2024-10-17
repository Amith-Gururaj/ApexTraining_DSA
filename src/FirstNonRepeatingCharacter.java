import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatingCharacter {

    public static String FindFirstNonRepeatingCharacter(String val){
        List<Character> res = new ArrayList<>();
        List<Character> notReq = new ArrayList<>();
        for(char ch : val.toCharArray()){
            if(notReq.contains(ch) || res.contains(ch)){
               if(res.contains(ch)){
                   res.remove(res.indexOf(ch));
                   notReq.add(ch);
               }
            }else{
                res.add(ch);
            }
        }
        return res.isEmpty()?"None Found":res.getFirst().toString();
    }
}
