import java.util.ArrayList;
import java.util.List;

public class FindStringWithPrefix {

    public static String[] FindStringsStartingWithPrefix(String[] values, String prefix){
        List<String> res = new ArrayList<>();
        for(String val : values){
            if(val.length()>=prefix.length()){
                boolean flag = true;
                for(int i =0; i< prefix.length();i++){
                    if(val.charAt(i) != prefix.charAt(i)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    res.add(val);
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
