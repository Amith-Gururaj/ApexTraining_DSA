import java.util.TreeSet;

public class ShortestDistanceBetweenWords {

    public static int ShortestDistanceBetweenTwoWords(String str, String s1, String s2){
        TreeSet<Integer> res = new TreeSet<>();

        String[] words = str.split("\\s");
        int len = words.length;
        int i = 0;
        while(i< len){
            if(words[i].equals(s1) || words[i].equals(s2)){
                if(words[i].equals(s1)){
                    int j = i+1;
                    while(j<len){
                        if(words[j].equals(s2)){
                            res.add(j-i-1);
                            break;
                        }else j++;
                    }
                }
                if(words[i].equals(s2)){
                    int j = i+1;
                    while(j<len){
                        if(words[j].equals(s1)){
                            res.add(j-i-1);
                            break;
                        }else j++;
                    }
                }
            } i++;
        }

        return res.getFirst();
    }
}
