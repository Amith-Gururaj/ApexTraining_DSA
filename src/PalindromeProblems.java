public class PalindromeProblems {
        public static void main(String[] args) {
            String str = "madam";

            boolean palindrome = findPalindromeOrNot(str);

            System.out.println(palindrome);

            int value = 121;

            palindrome = findPalindromeOrNot(value);

            System.out.println(palindrome);

        }

        private static boolean findPalindromeOrNot(String str){

            for(int i = 0, j = str.length()-1; i<j ; i++, j--){
                if(str.charAt(i)!=str.charAt(j)){
                    return false;
                }
            }

            return true;

        }

        private static boolean findPalindromeOrNot(int value){

            int rev = 0;
            int temp = value;

            while(temp>0){
                int rem = temp %10;
                rev = rev * 10 + rem;
                temp /= 10;
            }

            return rev==value;

        }
}
