public class StringToIntegerConvertion {

    public static int parseStringToInteger(String str){
        int sign =1;
        int i = 0;
        int res = 0;

        if(str.charAt(i)=='-' || str.charAt(i)=='+'){
            if(str.charAt(i)=='-')
                sign = -1;
            i++;
        }

        while(i<str.length()){
            if(!Character.isDigit(str.charAt(i)))
                return -1;

            res = res * 10 + (str.charAt(i) - '0') ;
            i++;
        }
        return sign * res;
    }
}
