public class LongestMatchedSubstring {

    public String LongestMatchedSubStr(String[] s, String value){
        int index = -1;
        int len = 0;
        for(int i =0; i<s.length; i++){
            if(s[i].contains(value) && s[i].length()>len){
                index = i;
            }
        }
        if(index>=0){
            return s[index];
        }
        return "None Found";

        //write using the sliding window approach
    }
}
