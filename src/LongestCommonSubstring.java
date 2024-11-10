public class LongestCommonSubstring {
    public static void main(String[] args) {
        String str = "aabbbbccddd";

        longestSubstring(str);
    }

    private static void longestSubstring(String str){
        int len = 0;
        int j = 0;
        int index = -1; String subString = "";
        for(int i = 1; i< str.length(); i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                if(i-j>len){
                    len = i-j;
                    index = j;
                    subString = str.substring(j, i);
                }
                j = i;
            }
        }

        System.out.println(index + "(index) and substring "+ subString+ " len = "+len);
    }
}
