public class RunLengthEncoding {


    public String runLengthEncode(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 1; i<s.length();i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }

            if (s.length() == i + 1) {
                sb.append(s.charAt(i));
                sb.append(count);
            }
        }
        return sb.toString();
    }
}
